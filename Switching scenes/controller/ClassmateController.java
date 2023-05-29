package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.*;

public class ClassmateController {
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Justin justin = new Justin();
    Czarina czarina = new Czarina();
    Arjay arjay = new Arjay();
    Lance lance = new Lance();
    Terrence terrence = new Terrence();

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    } 

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 


    public void initialize() {

        justin.setgender("man");
        justin.setpersonality("friendly");

        czarina.setgender("woman");
        czarina.setpersonality("outgoing");

        arjay.setgender("woman");
        arjay.setpersonality("funny");

        lance.setgender("man");
        lance.setpersonality("basketballist");
    
        terrence.setgender("man");
        terrence.setpersonality("sleeper");
    }


    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Czarina is a " + czarina.getgender() + " and " + czarina.getpersonality());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Justin is a " + justin.getgender() + " and " + justin.getpersonality());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Arjay is a " + arjay.getgender() + " and " + arjay.getpersonality());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Lance is a " + lance.getgender() + " and " + lance.getpersonality());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Terrence is a " + terrence.getgender() + " and " + terrence.getpersonality());
        }

        alert.showAndWait();

    }
}