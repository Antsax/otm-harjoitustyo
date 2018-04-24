package swervinderwin.objects;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author antsax
 */
public class Enemy extends Character {
    
    private boolean right;
    private boolean left;
    
    public Enemy(int x, int y) {
        super(new Rectangle(60, 45, Color.RED), x, y);
        this.right = false;
        this.left = false;
    }
    
    public void setRight() {
        this.right = true;
    }
    
    public void setLeft() {
        this.left = true;
    }
    
    public String side() {
        if (right) {
            return "right";
        }
        
        if (left) {
            return "left";
        }
        
        return "none";
    }
}
