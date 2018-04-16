package swervinderwin.objects;

import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author ahommy
 */
public class Derwin extends Character {

    int jumpHeight;

    public Derwin(int x, int y) {
        super(new Rectangle(45, 45, Color.WHITE), x, y);
    }

    @Override
    public void moveRight() {
        if (getCharacter().getTranslateX() < 1155) {
            getCharacter().setTranslateX(getCharacter().getTranslateX() + 1.5);
        }
    }

    @Override
    public void moveLeft() {
        if (getCharacter().getTranslateX() > 0) {
            getCharacter().setTranslateX(getCharacter().getTranslateX() - 1.5);
        }
    }

    @Override
    public void drop() {
        if (jumpHeight == 0) {
            if (y() == 605 && x() > 435 && x() < 720 || (y() == 735) || (y() == 605 && x() > 75 && x() < 360) || (y() == 605 && x() > 795 && x() < 1080)
                    || (y() == 435 && x() > 315 && x() < 480) || (y() == 435 && x() > 675 && x() < 840) || (y() == 265 && x() > 435 && x() < 720)
                    || (y() == 265 && x() < 240) || (y() == 265 && x() > 915) || (y() == 95 && x() > 525 && x() < 630)) {
                return;
            } else if (y() == 0) {
                getCharacter().setTranslateY(y() + 3);
            } else {
                getCharacter().setTranslateY(y() + 2);
            }
        }
    }

    @Override
    public void jump() {
        if (y() == 605 && x() > 435 && x() < 720 || (y() == 735) || (y() == 605 && x() > 75 && x() < 360) || (y() == 605 && x() > 795 && x() < 1080)
                || (y() == 435 && x() > 315 && x() < 480) || (y() == 435 && x() > 675 && x() < 840) || (y() == 265 && x() > 435 && x() < 720)
                || (y() == 265 && x() < 240) || (y() == 265 && x() > 915) || (y() == 95 && x() > 525 && x() < 630)) {

            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    getCharacter().setTranslateY(y() - 3);
                    jumpHeight++;
                    if (jumpHeight > 35 || y() <= 0) {
                        jumpHeight = 0;
                        stop();
                    }
                }
            }.start();
        }
    }

    @Override
    public void crouch() {
        if (y() == 0) {
            getCharacter().setTranslateY(y() + 3);
        } else if (getCharacter().getTranslateY() < 735) {
            getCharacter().setTranslateY(getCharacter().getTranslateY() + 2);
        }
    }

    public double y() {
        return getCharacter().getTranslateY();
    }

    public double x() {
        return getCharacter().getTranslateX();
    }

}
