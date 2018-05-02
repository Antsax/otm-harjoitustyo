package swervinderwin.ui;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import swervinderwin.gamelogic.AnimationHandler;
import swervinderwin.miscellaneous.MapCreator;
import swervinderwin.objects.Derwin;

/**
 *
 * @author antsax
 */
public class Map {

    int width = 1200;
    int height = 800;
    Pane pane = new Pane();
    Derwin derwin = new Derwin(width / 2 - 22 - 5, height - 195);
    private Stage menu;
    
    public Map(Stage menu) {
        this.menu = menu;
    }

    public Scene scene() {
        pane.setPrefSize(width, height);
        Scene map = new Scene(pane, width, height, Color.BLACK);
        pane.setStyle("-fx-background-color: #000000");

        MapCreator mapCreator = new MapCreator(width, height);
        AnimationHandler derwinMovement = new AnimationHandler(derwin, map, pane);

        mapCreator.originalMap(pane);
        derwinMovement.addMovementHandler();

        pane.getChildren().addAll(derwin.getCharacter());

        return map;
    }
}
