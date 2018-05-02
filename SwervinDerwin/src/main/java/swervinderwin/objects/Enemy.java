package swervinderwin.objects;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author antsax
 */
public class Enemy extends Character {

    private boolean right;
    private boolean left;
    private Derwin derwin;

    public Enemy(int x, int y, Derwin derwin) {
        super(new Rectangle(60, 45, Color.RED), x, y);
        this.right = false;
        this.left = false;
        this.derwin = derwin;
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

    @Override
    public boolean collision(Character other) {
        Derwin derwin = (Derwin) other;
        Shape area = Shape.intersect(this.getCharacter(), derwin.getCharacter());
        return area.getBoundsInLocal().getWidth() != -1;
    }

    public Derwin getDerwin() {
        return derwin;
    }
}
