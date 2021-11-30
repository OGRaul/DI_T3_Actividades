/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import CampoTextoBoton.CampoTextoBoton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author raul
 */
public class AppUsoTextoBoton extends Application implements Initializable {

    @FXML
    private CampoTextoBoton ctb1;
    @FXML
    private CampoTextoBoton ctb2;
    @FXML
    private Label lbl;
    
    @Override
    public void start(Stage stage) throws IOException {
       //Creando la escena y seleccionando esta clase como el controlador
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("APPUsoSelectorView.fxml"));
        loader.setController(this);
        Parent root = FXMLLoader.load(getClass().getResource("AppUsoTextoBoton.fxml"));
        
        Scene scene = new Scene(root);
    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ctb1.setBtnText("Grabar");
        ctb1.setOnAction(e -> {
            lbl.setText("Se ha grabado: "+ctb1.getText());
        });
        
        ctb2.setBtnText("Grabar");
        ctb2.setOnAction(e -> {
            lbl.setText("Se ha grabado: "+ctb2.getText());
        });
        

    }
    
    //TODO: conseguir hacer un override de la funcion dosomething de los botones para hacer otra cosa?
    
    public static void main(String[] args) {
        launch(args);
    }  
}
