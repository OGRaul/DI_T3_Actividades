/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import SelectorDeslizamiento.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

/**
 *
 * @author raul
 */ //Si quiero usar Inicializable puedo hacerlo descomentando lo del controller e inicializable e implementando initialize
public class APPUsoSelector extends Application implements Initializable{

    @FXML
    private VBox root;
    @FXML
    private SelectorDeslizamiento selector1;
    @FXML
    private SelectorDeslizamiento selector2;
    @FXML
    private Label lbl;
 

    @Override
    public void start(Stage stage) throws Exception {
        //Creando la escena y seleccionando esta clase como el controlador
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("APPUsoSelectorView.fxml"));
        loader.setController(this);
        Parent root = FXMLLoader.load(getClass().getResource("APPUsoSelectorView.fxml"));
        
        Scene scene = new Scene(root);
    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
        
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList <String> cosas = new ArrayList();
        cosas.add("Cosa1");
        cosas.add("Cosa2");
        cosas.add("Cosa3");
        
        selector1.setItems(cosas);
        
        ArrayList <String> items = new ArrayList();
        items.add("Thing1");
        items.add("Thing2");
        items.add("Thing3");
        items.add("Thing4");
        
        
        selector2.setItems(items);
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private void pulsadoArriba(ActionEvent event) {
        lbl.setText("Pulsado el selector de arriba");
    }

    @FXML
    private void pulsadoAbajo(ActionEvent event) {
        lbl.setText("Pulsado el selector de abajo");
    }

    
}
