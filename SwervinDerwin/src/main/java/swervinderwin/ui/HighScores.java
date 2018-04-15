package swervinderwin.ui;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author antsax
 */
public class HighScores {
   
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int width = gd.getDisplayMode().getWidth();
    int height = gd.getDisplayMode().getHeight();
    
    public Scene scene() {
        Pane pane = new Pane();
        pane.setPrefSize(width, height);
        Scene score = new Scene(pane, width, height, Color.BLACK);
        pane.setStyle("-fx-background-color: #000000");
        
        pane.getChildren().add(generateTitle());
        return score;
    }
    
    public Text generateTitle() {
        Text highScores = new Text("Hall of Fame");
        highScores.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 100));
        highScores.setFill(Color.WHITE);
        highScores.setTranslateX(width/2.62);
        highScores.setTranslateY(height/10);
        return highScores;
    }
    
}
