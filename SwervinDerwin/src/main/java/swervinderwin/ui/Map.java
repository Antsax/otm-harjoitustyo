package swervinderwin.ui;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
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

    int width = 1200;
    int height = 800;

    public Scene scene() {
        Pane pane = new Pane();
        pane.setPrefSize(width, height);
        Scene map = new Scene(pane, width, height, Color.BLACK);
        pane.setStyle("-fx-background-color: #000000");

        return map;
    }
}
