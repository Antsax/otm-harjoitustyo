package swervinderwin.objects;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author ahommy
 */
public class PlatformCreator {

    final int screenWidth;
    final int screenHeight;
    final int recHeight;

    public PlatformCreator(int width, int height) {
        this.screenHeight = height;
        this.screenWidth = width;
        this.recHeight = height / 40;
    }

    public Rectangle floor() {
        Rectangle floor = new Rectangle(screenWidth, recHeight, Color.DARKSALMON);
        floor.setTranslateY(screenHeight - recHeight);
        return floor;
    }

    public Rectangle largePlatform() {
        Rectangle lPlat = new Rectangle(screenWidth / 5, recHeight, Color.DARKSALMON);
        return lPlat;
    }

    public Rectangle mediumPlatfrom() {
        Rectangle mPlat = new Rectangle(screenWidth / 10, recHeight, Color.DARKSALMON);
        return mPlat;
    }

    public Rectangle smallPlatform() {
        Rectangle sPlat = new Rectangle(screenWidth / 20, recHeight, Color.DARKSALMON);
        return sPlat;
    }

}
