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
        // MAKE FASTER
        if (getCharacter().getTranslateX() < 1155) {
            getCharacter().setTranslateX(getCharacter().getTranslateX() + 1.5);
        }
    }

    @Override
    public void moveLeft() {
        // MAKE FASTER
        if (getCharacter().getTranslateX() > 0) {
            getCharacter().setTranslateX(getCharacter().getTranslateX() - 1.5);
        }
    }

    @Override
    public void drop() {
        // REFACTOR AND MAKE FASTER
        if (jumpHeight == 0) {
            if (getY() == 605 && getX() > 435 && getX() < 720 || (getY() == 735) || (getY() == 605 && getX() > 75 && getX() < 360) || (getY() == 605 && getX() > 795 && getX() < 1080)
                || (getY() == 435 && getX() > 315 && getX() < 480) || (getY() == 435 && getX() > 675 && getX() < 840) || (getY() == 265 && getX() > 435 && getX() < 720)
                || (getY() == 265 && getX() < 240) || (getY() == 265 && getX() > 915) || (getY() == 95 && getX() > 525 && getX() < 630)) {
                return;
            } else if (getY() == 0) {
                getCharacter().setTranslateY(getY() + 3);
            } else {
                getCharacter().setTranslateY(getY() + 2);
            }
        }
    }

    @Override
    public void jump() {
        //REFACTOR AND MAKE FASTER
        if (getY() == 605 && getX() > 435 && getX() < 720 || (getY() == 735) || (getY() == 605 && getX() > 75 && getX() < 360) || (getY() == 605 && getX() > 795 && getX() < 1080)
                || (getY() == 435 && getX() > 315 && getX() < 480) || (getY() == 435 && getX() > 675 && getX() < 840) || (getY() == 265 && getX() > 435 && getX() < 720)
                || (getY() == 265 && getX() < 240) || (getY() == 265 && getX() > 915) || (getY() == 95 && getX() > 525 && getX() < 630)) {

            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    getCharacter().setTranslateY(getY() - 3);
                    jumpHeight++;
                    if (jumpHeight > 35 || getY() <= 0) {
                        jumpHeight = 0;
                        stop();
                    }
                }
            }.start();
        }
    }

    @Override
    public void crouch() {
        if (getY() == 0) {
            getCharacter().setTranslateY(getY() + 3);
        } else if (getCharacter().getTranslateY() < 735) {
            getCharacter().setTranslateY(getCharacter().getTranslateY() + 2);
        }
    }
}
