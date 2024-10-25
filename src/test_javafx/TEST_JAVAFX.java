
package test_javafx;

import java.util.Stack;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TEST_JAVAFX extends Application{

    public static void main(String[] args) {
        launch (args);
    }
    @Override
    public void start(Stage stage) throws Exception { 
        Button button = new Button ("Hello");
        button.setOnAction(e->{
        Alert alert= new Alert(AlertType.INFORMATION,"hello");
        alert.showAndWait();
        });// funciones landa 
        StackPane root = new StackPane ();// como se ordenan de arriba para abajo
        root.getChildren().add(button);
        Scene scene;
        scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        
        stage.show();
        
                
    }
    
}
