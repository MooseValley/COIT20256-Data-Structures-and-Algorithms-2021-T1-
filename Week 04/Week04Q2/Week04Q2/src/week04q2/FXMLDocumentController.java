/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week04q2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class FXMLDocumentController implements Initializable
{

    @FXML
    private Button clickHereButton;

    @FXML
    private Label label;

    @FXML
    private Button exitButton;

    @FXML
    void handleClickHereButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");

    }

    @FXML
    void handleExitButtonAction(ActionEvent event) {
         System.exit(0);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
