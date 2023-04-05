package com.currencymoneyalura.CurrencyConverter;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import com.currencymoneyalura.model.TKCurrency;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private Button btnConvert;

    @FXML
    private ComboBox<TKCurrency> drpFrom;

    @FXML
    private ComboBox<TKCurrency> drpTo;

    @FXML
    private TextField inpAmount;

    @FXML
    private VBox outVbox;

    @FXML
    private Label fromOut;

    @FXML
    private Label toOut;

    @FXML
    private Button btnSwap;

    @FXML
    private Text exchRate;

    @FXML
    private ImageView loader;

    @FXML
    private AnchorPane root;

    // Conversion



    @Override
    public void initialize(URL url, ResourceBundle resource) {

    }
}

