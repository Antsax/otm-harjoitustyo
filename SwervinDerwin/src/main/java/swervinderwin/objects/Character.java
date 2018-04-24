package swervinderwin.objects;

import javafx.geometry.Point2D;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

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
    
    public double getX() {
        return this.character.getTranslateX();
    }
    
    public double getY() {
        return this.character.getTranslateY();
    }

    
    // SPEED  GETS FASTER AS GAME PROGRESSES,  REFACTOR
    public void moveRight() {
        this.character.setTranslateX(this.character.getTranslateX() + 4);
    }

    public void moveLeft() {
        this.character.setTranslateX(this.character.getTranslateX() - 4);
    }
    
    public void moveUp() {
        this.character.setTranslateY(this.character.getTranslateX() - 4);
    }
    
    public void moveDown() {
        this.character.setTranslateY(this.character.getTranslateX() + 4);
    }
    
    public void jump() {
    }
    
    public void crouch() {
    }

    public void drop() {
    }
    
    public boolean collision(Derwin other) {
        
        // COLLISION MAKES DERWIN LOSE A LIFE
        Shape area = Shape.intersect(this.character, other.getCharacter());
        return area.getBoundsInLocal().getWidth() != -1;
    }
}
