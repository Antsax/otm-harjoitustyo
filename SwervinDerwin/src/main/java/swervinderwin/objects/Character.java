package swervinderwin.objects;

import javafx.geometry.Point2D;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author ahommy
 */
public abstract class Character {

    private Rectangle character;

    public Character(Rectangle shape, int x, int y) {
        this.character = shape;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
    }

    public Rectangle getCharacter() {
        return character;
    }

    public void moveRight() {
        this.character.setTranslateX(this.character.getTranslateX() + 1);
    }

    public void moveLeft() {
        this.character.setTranslateX(this.character.getTranslateX() - 1);
    }
    
    public void jump() {
    }
    
    public void crouch() {
    }

    public void drop() {
    }
}
