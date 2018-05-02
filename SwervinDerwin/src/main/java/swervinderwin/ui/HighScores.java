package swervinderwin.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static swervinderwin.miscellaneous.SceneSwitcher.switchToMenu;
/**
 *
 * @author antsax
 */
public class HighScores {
   
    int width = 1200;
    int height = 800;
    private Stage menu;
    
    public HighScores(Stage menu) {
        this.menu = menu;
    }
    
    public Scene scene() {
        Pane pane = new Pane();
        pane.setPrefSize(width, height);
        Scene score = new Scene(pane, width, height, Color.BLACK);
        pane.setStyle("-fx-background-color: #000000");
        
        pane.getChildren().addAll(generateTitle(), generateBackButton());
        return score;
    }
    
    public Text generateTitle() {
        Text highScores = new Text("Hall of Fame");
        highScores.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 70));
        highScores.setFill(Color.WHITE);
        highScores.setTranslateX(width/3.2);
        highScores.setTranslateY(height/10);
        return highScores;
    }
    
    public Button generateBackButton() {
        Button back = new Button("BACK");
        back.setFont(Font.font(30));
        back.setOnAction((event) -> {
            switchToMenu(menu, new MainMenu());
        });
        
        back.setTranslateX(50);
        back.setTranslateY(700);
        return back;
    }
    
}
