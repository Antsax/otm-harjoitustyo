package swervinderwin.gamelogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import swervinderwin.objects.Character;
import swervinderwin.objects.Derwin;
import swervinderwin.objects.Enemy;
import swervinderwin.objects.EnemyCreator;
import static swervinderwin.miscellaneous.SceneSwitcher.switchToMenu;
import swervinderwin.ui.HighScores;
import swervinderwin.ui.MainMenu;

/**
 *
 * @author ahommy
 */
public class AnimationHandler {

    private Character character;
    private Scene scene;
    private EnemyCreator enemyCreator;
    private Pane pane;
    private int timer;
    private ArrayList<Rectangle> lifeCubes;
    private Score score;
    private Text board;

    public AnimationHandler(Character character, Scene scene, Pane pane) {
        this.character = character;
        this.scene = scene;
        this.pane = pane;
        this.enemyCreator = new EnemyCreator(pane, (Derwin) character);
        this.timer = 0;
        this.lifeCubes = new ArrayList<>();
        initiateLives();
        this.score = new Score();
        this.board = new Text(score.toString());
    }

    public void addMovementHandler() {

        /*
        REFACTOR
        REFACTOR
        REFACTOR
        REFACTOR
         */
        
        HashMap<KeyCode, Boolean> pressedButtons = new HashMap<>();

        EventHandler<KeyEvent> move = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                pressedButtons.put(event.getCode(), true);
            }
        };

        EventHandler<KeyEvent> stopMoving = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                pressedButtons.put(event.getCode(), false);
            }
        };

        new AnimationTimer() {

            @Override
            public void handle(long current) {
                if (pressedButtons.getOrDefault(KeyCode.LEFT, false)) {
                    character.moveLeft();
                }

                if (pressedButtons.getOrDefault(KeyCode.RIGHT, false)) {
                    character.moveRight();
                }

                if (pressedButtons.getOrDefault(KeyCode.UP, false)) {
                    character.jump();
                }

                if (pressedButtons.getOrDefault(KeyCode.DOWN, false)) {
                    character.crouch();
                }

                character.drop();
                enemyCreator.addEnemy();

                for (Enemy e : enemyCreator.getEnemies()) {
                    if (e.side().equals("right")) {
                        e.moveRight();
                    }

                    if (e.side().equals("left")) {
                        e.moveLeft();
                    }

                    if (e.collision(character) && !e.getDerwin().isImmune()) {
                        e.getDerwin().removeHealth();
                        if (e.getDerwin().getLives() == 0) {
                            this.stop();
                            gameOver();
                        }
                        e.getDerwin().setImmune(true);
                        e.getDerwin().getCharacter().setFill(Color.YELLOW);
                    }
                }

                enemyCreator.removeEnemy();
                startTimer();
                drawLives();
                drawScores();
                score.raiseScore();

            }
        }.start();

        scene.setOnKeyPressed(move);
        scene.setOnKeyReleased(stopMoving);
    }

    public void drawLives() {
        pane.getChildren().removeAll(lifeCubes.get(1), lifeCubes.get(2), lifeCubes.get(3));
        for (int i = 1; i <= ((Derwin) character).getLives(); i++) {
            pane.getChildren().add(lifeCubes.get(i));
        }
    }
    
    public int getTimer() {
        return timer;
    }

    public void startTimer() {
        if (((Derwin) character).isImmune()) {
            timer++;
            if (timer > 150) {
                timer = 0;
                ((Derwin) character).setImmune(false);
                ((Derwin) character).getCharacter().setFill(Color.WHITE);
            }
        }
    }
    
    public ArrayList getLives() {
        return lifeCubes;
    }

    public void initiateLives() {
        lifeCubes.add(new Rectangle(5, 5));
        for (int i = 1; i <= 3; i++) {
            Rectangle rec = new Rectangle(25, 25, Color.RED);
            rec.setTranslateX(35 * i);
            rec.setTranslateY(20);
            lifeCubes.add(rec);
        }
    }

    public void drawScores() {
        pane.getChildren().remove(board);
        board.setText(score.toString());
        board.setFont(Font.font(30));
        board.setFill(Color.WHITE);
        board.setTranslateX(1050);
        board.setTranslateY(50);
        pane.getChildren().add(board);
    }

    public void gameOver() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.getDialogPane().setPrefSize(500, 200);
        dialog.setTitle("GAME OVER");
        dialog.setHeaderText("You done swerved up! Better luck next time!");
        dialog.setContentText("Enter Username");

        dialog.show();
        
    }

}
