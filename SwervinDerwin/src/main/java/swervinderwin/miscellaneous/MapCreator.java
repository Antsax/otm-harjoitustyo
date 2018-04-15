package swervinderwin.miscellaneous;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import swervinderwin.objects.PlatformCreator;

/**
 *
 * @author ahommy
 */
public class MapCreator {
    
    final int height;
    final int width;
    
    public MapCreator(int width, int height) {
        this.height = height;
        this.width = width;
    }
    
        public void originalMap(Pane pane) {
        PlatformCreator platCreat = new PlatformCreator(width, height);
        
        //create all platforms
        Rectangle floor = platCreat.floor();
        Rectangle lPlat1 = platCreat.largePlatform();
        Rectangle lPlat2 = platCreat.largePlatform();
        Rectangle lPlat3 = platCreat.largePlatform();
        Rectangle lPlat4 = platCreat.largePlatform();
        Rectangle lPlat5 = platCreat.largePlatform();
        Rectangle lPlat6 = platCreat.largePlatform();
        Rectangle mPlat1 = platCreat.mediumPlatfrom();
        Rectangle mPlat2 = platCreat.mediumPlatfrom();
        Rectangle sPlat = platCreat.smallPlatform();
        
        //first level
        lPlat1.setTranslateX(width / 10);
        lPlat1.setTranslateY(height - 150);
        lPlat2.setTranslateX(4*width / 10);
        lPlat2.setTranslateY(height - 150);
        lPlat3.setTranslateX(7*width / 10);
        lPlat3.setTranslateY(height - 150);
        
        //second level
        mPlat1.setTranslateX(width / 3.3333);
        mPlat1.setTranslateY(height - 320);
        mPlat2.setTranslateX(2*width / 3.3333);
        mPlat2.setTranslateY(height - 320);
        
        //third level
        lPlat4.setTranslateY(height - 490);
        lPlat5.setTranslateX(4*width / 10);
        lPlat5.setTranslateY(height - 490);
        lPlat6.setTranslateX(width - width/5);
        lPlat6.setTranslateY(height - 490);
        
        //fourth level
        sPlat.setTranslateX(width/2 - width/40);
        sPlat.setTranslateY(height - 660);
        
        //add levels to the map
        pane.getChildren().addAll(floor, lPlat1, lPlat2, lPlat3, mPlat1, mPlat2, lPlat4, lPlat5, lPlat6, sPlat);
    }
}
