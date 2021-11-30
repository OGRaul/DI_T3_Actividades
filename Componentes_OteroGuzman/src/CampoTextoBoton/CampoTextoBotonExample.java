/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampoTextoBoton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author raul
 */
public class CampoTextoBotonExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        CampoTextoBoton ctb = new CampoTextoBoton();

        stage.setScene(new Scene(ctb));
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
        
        ctb.setText("Hello world!");
        ctb.setBtnText("Boton");
        
        ctb.setOnAction( e ->   {
            System.out.println("Hola boton");
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
