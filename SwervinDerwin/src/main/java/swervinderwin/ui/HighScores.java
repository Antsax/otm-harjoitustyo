package swervinderwin.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author antsax
 */
public class HighScores {
    
    public Scene scene() {
        Pane pane = new Pane();
        pane.setPrefSize(1980, 1080);
        Scene score = new Scene(pane, 1920, 1080, Color.BLACK);
        pane.setStyle("-fx-background-color: #000000");
        
        pane.getChildren().add(generateTitle());
        return score;
    }
    
    public Text generateTitle() {
        Text highScores = new Text("High Scores");
        highScores.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 100));
        highScores.setFill(Color.WHITE);
        highScores.setTranslateX(650);
        highScores.setTranslateY(120);
        return highScores;
    }
    
}
