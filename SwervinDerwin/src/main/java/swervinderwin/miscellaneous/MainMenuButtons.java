package swervinderwin.miscellaneous;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
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
 * Class which creates the buttons EXIT, START and HIGHSCORES with their corresponding actions
 */
public class MainMenuButtons {
    
    private Stage menu;
    private int width;
    private int height;

    public MainMenuButtons(Stage menu, int width, int height) {
        this.menu = menu;
        this.width = width;
        this.height = height;
    }

    /**
     * Method returns a VBox which contains the buttons, their transitions and the actions of the buttons
     * 
     * @return buttons in VBox
     */
    public VBox getButtons() {
        VBox buttons = new VBox();
        Button start = new Button("START");
        Button exit = new Button("EXIT");
        Button highScores = new Button("HIGH SCORES");

        highScores.setFont(Font.font(30));
        exit.setFont(Font.font(30));
        start.setFont(Font.font(30));

        highScores.setOnAction((event) -> {
            switchToHighScores(menu, new HighScores(menu));
        });

        exit.setOnAction((event) -> {
            exitGame(menu);
        });

        start.setOnAction((event) -> {
            switchToMap(menu, new Map(menu));
        });

        buttons.getChildren().addAll(start, highScores, exit);
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(30);
        buttons.setTranslateX(width / 2.34);
        buttons.setTranslateY(height / 1.5);

        return buttons;
    }
}
