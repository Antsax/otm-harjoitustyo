package swervinderwin.miscellaneous;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import swervinderwin.ui.HighScores;
import swervinderwin.ui.MainMenu;
import swervinderwin.ui.Map;

/**
 *
 * @author ahommy
 */
public class SceneSwitcher {

    public static void switchToHighScores(Stage window, HighScores score) {
        try {
            window.setScene(score.scene());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void exitGame(Stage window) {
        Alert exitingGame = new Alert(Alert.AlertType.CONFIRMATION);
        exitingGame.getDialogPane().setPrefSize(1000, 500);
        exitingGame.setTitle("Close Application");
        exitingGame.setHeaderText("You are attempting to close Swervin' Derwin");
        exitingGame.setContentText("Are you sure you wish to exit this application?");

        Optional<ButtonType> result = exitingGame.showAndWait();
        if (result.get() == ButtonType.OK) {
            window.close();
        } else {
            exitingGame.close();
        }
    }

    public static void switchToMap(Stage window, Map map) {
        try {
            window.setScene(map.scene());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void switchToMenu(Stage window, MainMenu mainMenu) {
        try {
            window.setScene(mainMenu.scene(window));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
