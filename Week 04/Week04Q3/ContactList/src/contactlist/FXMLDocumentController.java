package contactlist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class FXMLDocumentController implements Initializable
{

    @FXML
    private Label label;

    @FXML
    private TextArea textArea;

    @FXML
    private Button nextButton;

    @FXML
    private Button exitButton;

    private ContactListObject list;
    
    
    @FXML
    void handleExitButtonAction(ActionEvent event) {
            System.exit(0);

    }

    @FXML
    void handleNextButtonAction(ActionEvent event) {
        ContactRecord rec = list.next();
        textArea.setText (rec.toString() );
    }
    
    public void bind (ContactListObject list)
    {
        this.list = list;
    }

        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
