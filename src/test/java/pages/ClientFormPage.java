package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ClientFormPage {

    // обязательные поля для оформления заказа
    private SelenideElement
            inputFirstName = $("#billing_first_name"),
            inputMobilePhone = $("#billing_phone"),
            inputAddress = $("#shipping_address_1");

    public ClientFormPage fillClientForm(String firstName, String phoneNumber, String address) {
        inputFirstName.setValue(firstName);
        inputMobilePhone.setValue(phoneNumber);
        inputAddress.setValue(address);

        return this;
    }

}
