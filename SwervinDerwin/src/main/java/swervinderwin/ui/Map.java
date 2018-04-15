package swervinderwin.ui;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import swervinderwin.gameLogic.MovementHandler;
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

    public Scene scene() {
        pane.setPrefSize(width, height);
        Scene map = new Scene(pane, width, height, Color.BLACK);
        pane.setStyle("-fx-background-color: #000000");

        MapCreator mapCreator = new MapCreator(width, height);
        MovementHandler derwinMovement = new MovementHandler(derwin, map);
        
        mapCreator.originalMap(pane);
        derwinMovement.addMovementHandler();

        pane.getChildren().add(derwin.getCharacter());
        
        return map;
    }
}
