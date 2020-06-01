package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class Controller {
    @FXML
    TextArea messageArea;

    @FXML
    TextField newMessage;

    @FXML
    Button sendButton;

    public void sendMessageTypeAction (ActionEvent activeEvent){
        String messageText = newMessage.getText().trim();
        if(!messageText.isEmpty()){
            messageArea.appendText(messageText + System.lineSeparator());
            newMessage.clear();
        }

    }
}
