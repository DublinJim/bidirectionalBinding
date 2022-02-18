package com.example.bidirectionalbinding;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;

public class HelloController implements Initializable {

    @FXML
    private Slider slider1;

    @FXML
    private Text txt1;
double initVal =50;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slider1.setValue(initVal);
        txt1.setText(String.valueOf(initVal));
        txt1.textProperty().bindBidirectional(slider1.valueProperty(), NumberFormat.getNumberInstance());

    }
}
