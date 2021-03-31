/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author omalleym
 */
public class ContactList extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        FXMLLoader loader = new FXMLLoader (getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        
        ContactListObject list = new ContactListObject ();
        FXMLDocumentController controller = loader.getController();
        
        controller.bind (list);        

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
