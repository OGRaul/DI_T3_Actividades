/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectorDeslizamiento;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author raul
 */
public class SelectorDeslizamientoExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creando la escena
        VBox root = new VBox();

        Scene scene = new Scene(root, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Selectores");
        primaryStage.show();

        //Creando componentes y añadiendolos al root
        Label titulo = new Label("Selectores");
        SelectorDeslizamiento selector = new SelectorDeslizamiento();
        SelectorDeslizamiento selector2 = new SelectorDeslizamiento();
        root.getChildren().addAll(titulo,selector,selector2);
        
        Label lbl = new Label ("");
        root.getChildren().add(lbl);
        
        //Gestion de eventos
        selector.setOnAction(e -> {
            lbl.setText("Pulsado selector de arriba");
        });
        
        selector2.setOnAction((ActionEvent event) -> {
           lbl.setText("Pulsado selector de abajo");
        });
        
        //añadiendo valores a los selectores
        
        ArrayList <String> cosas = new ArrayList();
        cosas.add("Cosa1");
        cosas.add("Cosa2");
        cosas.add("Cosa3");
        
        selector.setItems(cosas);
        
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
}