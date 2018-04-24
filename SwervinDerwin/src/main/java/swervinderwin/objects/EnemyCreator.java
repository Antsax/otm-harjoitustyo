package swervinderwin.objects;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.scene.layout.Pane;
import swervinderwin.objects.Enemy;

/**
 *
 * @author antsax
 */
public class EnemyCreator {
    
    private ArrayDeque<Enemy> enemies;
    Random rnd = new Random();
    Pane pane;
    
    public EnemyCreator(Pane pane) {
        enemies = new ArrayDeque();
        this.pane = pane;
    }
    
    public void addEnemy() {
        //REFACTOR
        if (Math.random() < 0.03) {
            Enemy enemy = new Enemy(startingPointX(), startingPointY());
            if (enemy.getX() == -60) {
                enemy.setRight();
            } else if (enemy.getX() == 1200) {
                enemy.setLeft();
            } 
            enemies.add(enemy);
            pane.getChildren().add(enemy.getCharacter());
        }
    }
    
    public ArrayDeque<Enemy> getEnemies() {
        return this.enemies;
    }
    
    public int startingPointX() {
        
        // REFACTOR
        int num = rnd.nextInt(9) + 1;
        if (num <= 5) {
            return -60;
        }
        
        return 1200;
    }
    
    public int startingPointY() {
        return rnd.nextInt(799) + 1;
    }
    
    public void removeEnemy() {
        for (Enemy e : enemies) {
            if (e.getX() > 1200 || e.getX() < -60) {
                pane.getChildren().remove(e.getCharacter());
                enemies.remove(e);
            }
        }
    }
    
}
