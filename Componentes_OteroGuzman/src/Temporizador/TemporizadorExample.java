/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporizador;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author raul
 */
public class TemporizadorExample extends Application{
     @Override
    public void start(Stage stage) throws Exception {
        
        Temporizador temp = new Temporizador(5);
        
        VBox root = new VBox();
        System.out.println(temp.getTime());

        stage.setScene(new Scene(root));
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
        
        root.getChildren().add(temp);
        temp.setOnFinished(e -> {
            Label lbl = new Label("Se acabo el tiempo!!");
            root.getChildren().add(lbl);
        });
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
