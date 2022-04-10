package shaslicktests;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import java.util.Locale;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;

public class ShashlickSuccessOrder extends TestBase {
    Faker faker = new Faker(new Locale("ru"));
    String firstName = faker.name().firstName();
    String phoneNumber = faker.phoneNumber().phoneNumber();
    String address = faker.address().fullAddress();


    @Test
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.BLOCKER)
    @Description(
            "Проверка успешного создания заказа шашлыка"
    )
    @Feature("Оформление заказа")
    void successOrder() {
        step("Открываем главную страницу", () -> {
            Selenide.open("https://shashlik.club/");
        });
        step("Наличие номера телефона и заголовка", () -> {
        $("#primary").shouldHave(text("Шашлык от кафе Ратибор"));
        $(".tphone").shouldHave(text("+7 (930) 222 00 32"));
        });
        step("Переход в раздел блюда на мангале", () -> {
        $("#menu-item-489").click();
        });
        step("Переход в товар Свиная корейка и добавляем одну штуку в корзину", () -> {
        $x("//a[@href='https://shashlik.club/meny/blyuda-na-mangale/svinaya-koreyka/']").click();
        $("[name=add-to-cart]").click();
        });
        step("Переход в корзину и добавление товара кликом на плюсик", () -> {
        $x("//a[@href='https://shashlik.club/cart/']").click();
        $(byText("+")).doubleClick();
        });
        step("Переход в оформление заказа и ввод данных для получения заказа", () -> {
        $x("//a[@href='https://shashlik.club/checkout/']").click();
        $("#billing_first_name").setValue(firstName);
        $("#billing_phone").setValue(phoneNumber);
        $("#shipping_address_1").setValue(address);
        });
        step("Выбор самовывоза и подтверждение заказа", () -> {
            $(byText("Самовывоз")).click();
            $(byText("Подтвердить заказ")).click();
        });
        }
    }

