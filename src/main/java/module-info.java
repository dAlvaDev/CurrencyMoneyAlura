module com.currencymoneyalura {
    requires javafx.controls;
    requires javafx.fxml;

    requires htmlunit;
    requires neko.htmlunit;

    opens com.currencymoneyalura.CurrencyConverter to javafx.fxml;
    exports com.currencymoneyalura.CurrencyConverter;

}