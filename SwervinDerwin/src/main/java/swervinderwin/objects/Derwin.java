package swervinderwin.objects;

import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * The main character of the game Swervin' Derwin
 */
public class Derwin extends Character {

    int jumpHeight;
    private boolean immune;
    int lives;

    public Derwin(int x, int y) {
        super(new Rectangle(45, 45, Color.WHITE), x, y);
        this.immune = false;
        this.lives = 3;
    }

    @Override
    public void moveRight() {
        if (getCharacter().getTranslateX() < 1155) {
            getCharacter().setTranslateX(getCharacter().getTranslateX() + 4.5);
        }
    }

    @Override
    public void moveLeft() {
        if (getCharacter().getTranslateX() > 0) {
            getCharacter().setTranslateX(getCharacter().getTranslateX() - 4.5);
        }
    }

    @Override
    public void drop() {
        // REFACTOR AND MAKE DROP FASTER
        if (jumpHeight == 0) {
            if (getY() == 605 && getX() > 435 && getX() < 720 || (getY() == 735) || (getY() == 605 && getX() > 75 && getX() < 360) || (getY() == 605 && getX() > 795 && getX() < 1080)
                    || (getY() == 435 && getX() > 315 && getX() < 480) || (getY() == 435 && getX() > 675 && getX() < 840) || (getY() == 265 && getX() > 435 && getX() < 720)
                    || (getY() == 265 && getX() < 240) || (getY() == 265 && getX() > 915) || (getY() == 95 && getX() > 525 && getX() < 630)) {
                return;
            } else if (getY() == 0) {
                getCharacter().setTranslateY(getY() + 5);
            } else {
                getCharacter().setTranslateY(getY() + 2);
            }
        }
    }

    @Override
    public void jump() {
        //REFACTOR
        if (getY() == 605 && getX() > 435 && getX() < 720 || (getY() == 735) || (getY() == 605 && getX() > 75 && getX() < 360) || (getY() == 605 && getX() > 795 && getX() < 1080)
                || (getY() == 435 && getX() > 315 && getX() < 480) || (getY() == 435 && getX() > 675 && getX() < 840) || (getY() == 265 && getX() > 435 && getX() < 720)
                || (getY() == 265 && getX() < 240) || (getY() == 265 && getX() > 915) || (getY() == 95 && getX() > 525 && getX() < 630)) {

            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    getCharacter().setTranslateY(getY() - 5);
                    jumpHeight++;
                    if (jumpHeight > 22 || getY() <= 0) {
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

    /**
     * returns the boolean value of the immunity of Derwin
     * 
     * @return Derewin's immunity
     */
    public boolean isImmune() {
        return immune;
    }

    /**
     * Sets the immunity of Derwin or strips him of it
     * 
     * @param value  the wanted boolean value
     */
    public void setImmune(boolean value) {
        this.immune = value;
    }

    /**
     * Removes one health from Derwin
     */
    public void removeHealth() {
        lives--;
    }

    /**
     * Adds health to Derwin
     */
    public void addHealth() {
        if (lives < 3) {
            lives++;
        }
    }

    /**
     * Gives the current lives of Derwin as an Integer value
     * 
     * @return Derwin's lives
     */
    public int getLives() {
        return lives;
    }
}
