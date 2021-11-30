/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporizador;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author raul
 */
public class TemporizadorExample extends Application{
    Temporizador temp;
     @Override
    public void start(Stage stage) throws Exception {
        
        temp = new Temporizador(5);
        
        System.out.println(temp.getTime());

        stage.setScene(new Scene(temp));
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
        
        temp.setOnFinished(e -> {
            Label lbl = new Label("Se acabo el tiempo!!");
            temp.getChildren().add(lbl);
        });
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
