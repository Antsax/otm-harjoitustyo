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
        
        //face of Derwin
        Rectangle eye1 = new Rectangle(30, 40, Color.BLACK);
        Rectangle eye2 = new Rectangle(30, 40, Color.BLACK);
        Rectangle mouth = new Rectangle(120, 20, Color.BLACK);
        Rectangle mouthCheek1 = new Rectangle(15, 30, Color.BLACK);
        Rectangle mouthCheek2 = new Rectangle(15, 30, Color.BLACK);

        //body of Derwin
        Rectangle hands = new Rectangle(700, 100, Color.WHITE);
        Rectangle torso = new Rectangle(300, 100, Color.WHITE);
        Rectangle leftArm = new Rectangle(100, 100, Color.WHITE);
        Rectangle rightArm = new Rectangle(100, 100, Color.WHITE);
        Rectangle leftLeg = new Rectangle(100, 200, Color.WHITE);
        Rectangle rightLeg = new Rectangle(100, 200, Color.WHITE);
        Rectangle rightFoot = new Rectangle(100, 100, Color.WHITE);
        Rectangle leftFoot = new Rectangle(100, 100, Color.WHITE);
        Rectangle flagPole = new Rectangle(10, 150, Color.WHITE);
        Rectangle flag = new Rectangle(150, 100, Color.WHITE);

        //position Derwin's face
        eye1.setTranslateX(1020);
        eye1.setTranslateY(300);
        eye2.setTranslateX(930);
        eye2.setTranslateY(300);
        mouth.setTranslateX(930);
        mouth.setTranslateY(400);
        mouthCheek1.setTranslateX(930);
        mouthCheek1.setTranslateY(370);
        mouthCheek2.setTranslateX(1035);
        mouthCheek2.setTranslateY(370);

        //position Derwin's body
        hands.setTranslateX(640);
        hands.setTranslateY(270);
        torso.setTranslateX(840);
        torso.setTranslateY(370);
        rightArm.setTranslateX(1240);
        rightArm.setTranslateY(170);
        leftArm.setTranslateX(640);
        leftArm.setTranslateY(370);
        leftLeg.setTranslateX(840);
        leftLeg.setTranslateY(470);
        rightLeg.setTranslateX(1040);
        rightLeg.setTranslateY(470);
        leftFoot.setTranslateX(740);
        leftFoot.setTranslateY(570);
        rightFoot.setTranslateX(1140);
        rightFoot.setTranslateY(570);
        flagPole.setTranslateX(1290);
        flagPole.setTranslateY(20);
        flag.setTranslateX(1300);
        flag.setTranslateY(20);

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

        pane.getChildren().addAll(hands, leftArm, rightArm, torso, leftLeg, rightLeg, leftFoot, rightFoot, flagPole, flag, eye1, eye2, mouth, mouthCheek1, mouthCheek2);
        pane.getChildren().add(title);
        pane.getChildren().add(buttons);
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
