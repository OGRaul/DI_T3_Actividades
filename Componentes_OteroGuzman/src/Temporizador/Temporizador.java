package Temporizador;

import java.io.IOException;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 *
 * @author raul
 */
public final class Temporizador extends VBox{
    //Objetos del fxml
    @FXML private Label lbl;
    private Integer time;
    
    //Constructor
    public Temporizador(Integer time){
        this.setTime(time);
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Temporizador.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        
        lbl.setText(time.toString());
        
        Timeline tl = new Timeline();
        
        tl.setCycleCount(getTime());
        
        KeyFrame kf =new KeyFrame(Duration.seconds(1), e -> {
           setTime(getTime()-1);
           lbl.setText(getTime().toString());
        });
        
        tl.getKeyFrames().addAll(kf);
        
        //Pasamos esta propiedad desde el constructor
        tl.setOnFinished((ActionEvent event) -> {
            onFinishedProperty().get().handle(event);
        });

        tl.play();
    }
    //Constructor vacio
    public Temporizador(){}

    //Getters y setters
    public Integer getTime() {
        return time;
    }

    private void setTime(Integer time) {
        this.time = time;
    }
    
    //Creamos un objeto privado de un Action Event
    private ObjectProperty<EventHandler<ActionEvent>> propertyOnFinished
            = new SimpleObjectProperty<EventHandler<ActionEvent>>();
    
    //Creamos un metodo para recuperar ese objeto privado de tipo object property action event
    public final ObjectProperty<EventHandler<ActionEvent>> onFinishedProperty() {
        return propertyOnFinished;
    }
    
    //Creamos un setter de esta propiedad
    public final void setOnFinished(EventHandler<ActionEvent> handler) {
        propertyOnFinished.set(handler);
    }
    
    //Creamos un getter
    public final EventHandler<ActionEvent> getOnFinished() {
        return propertyOnFinished.get();
    }
    
}
