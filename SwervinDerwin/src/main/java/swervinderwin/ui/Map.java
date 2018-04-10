package swervinderwin.ui;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author antsax
 */
public class Map {
    public Scene scene() {
        Pane pane = new Pane();
        pane.setPrefSize(1980, 1080);
        Scene map = new Scene(pane, 1920, 1080, Color.BLACK);
        pane.setStyle("-fx-background-color: #000000");
        
        return map;
    }
}
