package swervinderwin.gamelogic;

import java.util.HashMap;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import swervinderwin.objects.Character;

/**
 *
 * @author ahommy
 */
public class MovementHandler {

    private Character character;
    private Scene scene;

    public MovementHandler(Character character, Scene scene) {
        this.character = character;
        this.scene = scene;
    }

    public void addMovementHandler() {
        HashMap<KeyCode, Boolean> pressedButtons = new HashMap<>();

        EventHandler<KeyEvent> move = new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                pressedButtons.put(event.getCode(), true);
            }
        };

        EventHandler<KeyEvent> stopMoving = new EventHandler<KeyEvent>() {
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

            }
        }.start();

        scene.setOnKeyPressed(move);
        scene.setOnKeyReleased(stopMoving);
    }

}
