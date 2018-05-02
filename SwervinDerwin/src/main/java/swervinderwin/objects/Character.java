package swervinderwin.objects;

import javafx.geometry.Point2D;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 * This class provides the basic concept of the characters in the game. All moving objects inherit this class.
 */
public abstract class Character {

    private Rectangle character;

    public Character(Rectangle shape, int x, int y) {
        this.character = shape;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
    }

    /**
     * Returns a rectangle figure, which acts as a character
     */
    public Rectangle getCharacter() {
        return character;
    }

    /**
     * Return the current X-axel position of the character
     */
    public double getX() {
        return this.character.getTranslateX();
    }

    /**
     * Return the current Y-axel position of the character
     */
    public double getY() {
        return this.character.getTranslateY();
    }

    /**
     * Moves the character right
     */
    public void moveRight() {
        this.character.setTranslateX(this.character.getTranslateX() + 4);
    }

    /**
     * Moves the character left
     */
    public void moveLeft() {
        this.character.setTranslateX(this.character.getTranslateX() - 4);
    }

    /**
     * Moves the character up
     */
    public void moveUp() {
        this.character.setTranslateY(this.character.getTranslateX() - 4);
    }

    /**
     * Moves the character down
     */
    public void moveDown() {
        this.character.setTranslateY(this.character.getTranslateX() + 4);
    }

    /**
     * Makes the character jump
     */
    public void jump() {
    }

    /**
     * Makes the character fall down levels
     */
    public void crouch() {
    }

    /**
     * Makes the character fall
     */
    public void drop() {
    }

    /**
     * Checks if a collision has occurred between two characters
     * 
     * @param other  the character to which we check the collision
     * @return boolean value about the occurrence of an collision
     */
    public boolean collision(Character other) {
        Shape area = Shape.intersect(this.character, other.getCharacter());
        return area.getBoundsInLocal().getWidth() != -1;
    }
}
