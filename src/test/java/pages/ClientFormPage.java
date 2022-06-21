package pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;

public class ClientFormPage {
    Faker faker = new Faker(new Locale("ru"));
    private String firstName = faker.name().firstName();
    private String phoneNumber = faker.phoneNumber().phoneNumber();
    private String address = faker.address().streetAddress();

    SelenideElement
            inputFirstName = $("#billing_first_name"),
            inputMobilePhone = $("#billing_phone"),
            inputAddress = $("#shipping_address_1");

    public ClientFormPage fillClientForm() {
        inputFirstName.setValue(firstName);
        inputMobilePhone.setValue(phoneNumber);
        inputAddress.setValue(address);

        return this;
    }

}
