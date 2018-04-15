package swervinderwin.objects;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author ahommy
 */
public class Derwin extends Character {

    boolean jump = false;

    public Derwin(int x, int y) {
        super(new Rectangle(45, 45, Color.WHITE), x, y);
    }

    @Override
    public void moveRight() {
        if (getCharacter().getTranslateX() < 1155) {
            getCharacter().setTranslateX(getCharacter().getTranslateX() + 1);
        }
    }

    @Override
    public void moveLeft() {
        if (getCharacter().getTranslateX() > 0) {
            getCharacter().setTranslateX(getCharacter().getTranslateX() - 1);
        }
    }

    @Override
    public void drop() {
        if (getCharacter().getTranslateY() != 605 && (getCharacter().getTranslateX() < 435 || getCharacter().getTranslateX() > 720)) {
            if (getCharacter().getTranslateY() != 735) {
                getCharacter().setTranslateY(getCharacter().getTranslateY() + 0.5);
            }
        }
    }

    @Override
    public void jump() {
        jump = true;
        while (jump == true) {
            getCharacter().setTranslateY(getCharacter().getTranslateY() - 0.5);
            if (getCharacter().getTranslateY() < 300) {
                jump = false;
            }
        }
    }

}
