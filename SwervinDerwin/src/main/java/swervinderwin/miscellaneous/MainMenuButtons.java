package swervinderwin.miscellaneous;

import java.util.Optional;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static swervinderwin.miscellaneous.SceneSwitcher.exitGame;
import static swervinderwin.miscellaneous.SceneSwitcher.switchToHighScores;
import static swervinderwin.miscellaneous.SceneSwitcher.switchToMap;
import swervinderwin.ui.HighScores;
import swervinderwin.ui.Map;

/**
 *
 * @author antsax
 */
public class MainMenuButtons {

    public VBox getButtons(Stage menu, int width, int height) {
        VBox buttons = new VBox();
        Button start = new Button("START");
        Button exit = new Button("EXIT");
        Button highScores = new Button("HIGH SCORES");

        highScores.setFont(Font.font(30));
        exit.setFont(Font.font(30));
        start.setFont(Font.font(30));

        highScores.setOnAction((event) -> {
            switchToHighScores(menu, new HighScores());
        });

        exit.setOnAction((event) -> {
            exitGame(menu);
        });

        start.setOnAction((event) -> {
            switchToMap(menu, new Map());
        });

        buttons.getChildren().addAll(start, highScores, exit);
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(30);
        buttons.setTranslateX(width / 2.34);
        buttons.setTranslateY(height / 1.5);

        return buttons;
    }
}
