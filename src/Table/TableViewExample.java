
package Table;

/**
 *
 * @author Admi
 */

import java.awt.geom.Area;
import java.util.Stack;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


    
public class TableViewExample extends Application {
      private TableView table = new TableView();// hablamos de encapsulamiento, acceso adecuado a 
     Scene scene = new Scene(new Group());// se guarda una referencia a group
     
    public static void main(String[] args) {
        launch (args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
    Button button = new Button ();
    button.setOnAction(e->{ });
        stage.show();
        stage.setTitle(STYLESHEET_MODENA);
        stage.setWidth(300);
        stage.setHeight(500);
        
        final Label label = new Label("AdresBook"); 
        label.setFont(new Font ("Arial",20));
        
         TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");
        
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();     
    }
   
}