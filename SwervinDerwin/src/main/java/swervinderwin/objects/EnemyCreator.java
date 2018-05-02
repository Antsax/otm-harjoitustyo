package swervinderwin.objects;

import java.util.ArrayDeque;
import java.util.Random;
import javafx.scene.layout.Pane;

/**
 *
 * @author antsax
 */
public class EnemyCreator {

    private ArrayDeque<Enemy> enemies;
    Random rnd = new Random();
    Pane pane;
    Derwin derwin;

    public EnemyCreator(Pane pane, Derwin derwin) {
        enemies = new ArrayDeque();
        this.pane = pane;
        this.derwin = derwin;
    }

    public void addEnemy() {
        if (Math.random() < 0.03) {
            Enemy enemy = new Enemy(startingPointX(), startingPointY(), derwin);
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
