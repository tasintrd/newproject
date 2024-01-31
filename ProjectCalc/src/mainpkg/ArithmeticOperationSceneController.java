/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ArithmeticOperationSceneController implements Initializable {

    @FXML    private TextField xTextField;
    @FXML    private TextField yTextField;
    @FXML    private Label resultLabel;
    @FXML    private Button addButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButtonOnMouseClicked(MouseEvent event) {
        String xStr = xTextField.getText(); //"12"
        String yStr = yTextField.getText(); //"13"
        //xStr + yStr;    //"1213"
        int xVal = Integer.parseInt(xStr); //12
        int yVal = Integer.parseInt(yStr); //13
        int sum = xVal + yVal;    //25
        String sumStr = Integer.toString(sum);
        resultLabel.setText("X + Y = " + sumStr);
    }

    @FXML
    private void subtractButtonOnMouseClicked(ActionEvent event) {

        resultLabel.setText(
            "X - Y = " + 
            Integer.toString(
                Integer.parseInt(
                    xTextField.getText()
                )
                - 
                Integer.parseInt(
                    yTextField.getText()
                )
            )
        );
    }

    @FXML
    private void multiplyButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void addButtonOnMouseExited(MouseEvent event) {
        addButton.setText("Add");
    }

    @FXML
    private void addButtonOnMouseEntered(MouseEvent event) {
        addButton.setText("Get out of me!");
    }

}
