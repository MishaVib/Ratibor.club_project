package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SuccessOrderPage {

    // общая информация о заказе
    private SelenideElement
            headerSuccesOrder = $("h1.entry-title"),
            paragraphSuccesOrder = $("div.woocommerce-order p"),
            orderNumber = $("li.woocommerce-order-overview__order.order"),
            orderData = $("li.woocommerce-order-overview__date.date"),
            orderTotalSum = $("li.woocommerce-order-overview__total.total"),
            orderPaymentMethod = $("li.woocommerce-order-overview__payment-method.method");

    //детальная информация о заказе
    private SelenideElement
            headerDetailedInfo = $x("//h2"),
            detailedInfoItem = $(" th.woocommerce-table__product-name.product-name"),
            detailedInfoItemName = $("td.woocommerce-table__product-name.product-name").$x("//a[@href='https://shashlik.club/meny/blyuda-na-mangale/shashlyk-iz-svinoy-shei/']"),
            detailedInfoQuantity = $("strong.product-quantity"),
            detailedInfoTotal = $("th.woocommerce-table__product-table.product-total"),
            delivery = $(byText("Доставка")),
            detailedInfoPaymentMethod = $(byText("Метод оплаты:")),
            detailedInfoTotalPrice = $x("//th[normalize-space()='Итого:']");


    //actions
    public SuccessOrderPage checkGeneralInfo() {
        headerSuccesOrder.shouldHave(exactText("Заказ принят")).shouldBe(visible);
        paragraphSuccesOrder.shouldHave(exactText("Ваш заказ принят. Благодарим вас.")).shouldBe(visible);
        orderNumber.shouldHave(exactText("Номер заказа:")).shouldBe(visible);
        orderData.shouldHave(exactText("Дата:")).shouldBe(visible);
        orderTotalSum.shouldHave(exactText("Итого:")).shouldBe(visible);
        orderPaymentMethod.shouldBe(exactText("Метод оплаты:")).shouldBe(visible);

        return this;
    }

    public SuccessOrderPage checkDetailedInfo() {
        headerDetailedInfo.shouldHave(text("Информация о заказе")).shouldBe(visible);
        detailedInfoItem.shouldHave(text("Товар"));
        detailedInfoItemName.shouldBe(enabled);
        detailedInfoQuantity.shouldHave(textCaseSensitive("x 3"));
        detailedInfoTotal.shouldHave(exactText("Итого"));
        delivery.shouldBe(visible).sibling(0).shouldHave(text("Самовывоз"));
        detailedInfoPaymentMethod.shouldBe(visible).sibling(0).shouldHave(text("Оплата при доставке"));
        detailedInfoTotalPrice.shouldBe(visible);

        return this;
    }

}
