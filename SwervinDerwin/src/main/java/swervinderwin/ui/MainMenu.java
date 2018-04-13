package swervinderwin.ui;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Optional;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author antsax
 */
public class MainMenu extends Application {

    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int width = gd.getDisplayMode().getWidth();
    int height = gd.getDisplayMode().getHeight();

    @Override
    public void start(Stage menu) {
        menu.setTitle("Swervin' Derwin!");
        Pane pane = new Pane();
        pane.setPrefSize(width, height);
        Scene main = new Scene(pane, width, height, Color.BLACK);

        //Derwin
        Image image = new Image("File:derwinStill.png");
        ImageView derwin = new ImageView(image);
        derwin.setFitHeight(height/1.6);
        derwin.setFitWidth(width/2);
        derwin.setTranslateX(width/4);
        derwin.setTranslateY(height/300);

        //title of the game
        Text title = new Text("Swervin' Derwin");
        title.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 100));
        title.setTranslateX(250);
        title.setTranslateY(200);
        title.setFill(Color.WHITE);

        //Start, Exit and High Scores -buttons
        VBox buttons = new VBox();
        Button start = new Button("START");
        Button exit = new Button("EXIT");
        Button highScores = new Button("HIGH SCORES");

        highScores.setFont(Font.font(40));
        exit.setFont(Font.font(40));
        start.setFont(Font.font(40));

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
        buttons.setTranslateX(820);
        buttons.setTranslateY(750);

        pane.getChildren().addAll(derwin, title, buttons);
        pane.setStyle("-fx-background-color: #000000");

        menu.setScene(main);
        menu.show();
    }

    public static void main(String[] args) {
        launch(MainMenu.class);
    }

    public static void switchToHighScores(Stage window, HighScores score) {
        try {
            window.setScene(score.scene());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void exitGame(Stage window) {
        Alert exitingGame = new Alert(AlertType.CONFIRMATION);
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
}
