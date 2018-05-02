package swervinderwin.objects;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * Creates the platforms for the game
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

    /**
     * Creates and  returns the floor (lowest part) of the game as an Rectangle object
     * 
     * @return floor of the game
     */
    public Rectangle floor() {
        Rectangle floor = new Rectangle(screenWidth, recHeight, Color.DARKSALMON);
        floor.setTranslateY(screenHeight - recHeight);
        return floor;
    }

    /**
     * Creates and returns a large platform
     * 
     * @return  one large platform
     */
    public Rectangle largePlatform() {
        Rectangle lPlat = new Rectangle(screenWidth / 5, recHeight, Color.DARKSALMON);
        return lPlat;
    }

    /**
     * Creates and returns a medium platform
     * 
     * @return one medium platform
     */
    public Rectangle mediumPlatfrom() {
        Rectangle mPlat = new Rectangle(screenWidth / 10, recHeight, Color.DARKSALMON);
        return mPlat;
    }
    
    /**
     * Creates and returns a small platform
     * 
     * @return one small platform
     */
    public Rectangle smallPlatform() {
        Rectangle sPlat = new Rectangle(screenWidth / 20, recHeight, Color.DARKSALMON);
        return sPlat;
    }

}
