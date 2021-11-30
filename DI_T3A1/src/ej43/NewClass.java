package ej43;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author raul
 */
public class NewClass extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //Crenado la escena 
        VBox root = new VBox();
        root.setPadding( new Insets (20));
        root.setSpacing(10);
        
        Scene scene = new Scene (root,600,400);
        
        primaryStage.setScene (scene);
        primaryStage.setTitle("MiControl");
        primaryStage.show();
        
        
        //Creando los componentes y añadiendolos al root
        MiControl mc = new MiControl();
        Label lbl2 = new Label("Clickea el rectangulo");
        root.getChildren().addAll(mc , lbl2);
        
        
        //Gestion de eventos
        mc.setOnAction(e -> {
            Label lbl = new Label("Hola mundo");
            root.getChildren().add(lbl);
            System.out.println("Hola Mundo");
        });
        

        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
