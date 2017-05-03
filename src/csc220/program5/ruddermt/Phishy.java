/*
*  CSC 220 Program 5
*  May 2, 2017
*  Megan Rudder

   Description: This subclass implements the drawable method to create a fish to display in Stage Frame. This class 
                This class also holds a list of points for the animation of the game character in the main frame. 

   Acknowledgements: The phishy class was reworked from a Program 3 object.


*/
package csc220.program5.ruddermt;
import java.awt.*;
import csc220.program5.ruddermt.List;
import csc220.drawing.Drawable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author ruddermt2020
 */
public class Phishy extends csc220.program5.GameCharacter{

    private Integer over;
    private Integer down;
    private Color color;

    public Phishy(int over, int down,int width, int height, int moveInterval,Color color) {
        super(over, down, width, height, 1000, new List<Point>());
        this.over = over;
        this.down = down;
        this.color = color;
        this.animationPath.add(new Point(over, down));
        this.animationPath.add(new Point(over, down + 200));
        this.animationPath.add(new Point(over + 350, down + 200));
        this.animationPath.add(new Point(over + 350, down ));

    }
    

    @Override
    public void draw(Graphics g) {
        //body 
        g.setColor(color);
        g.fillOval(getOver(),getDown(),40,25);
        
        
        //tail
        Polygon tail = new Polygon();
        tail.addPoint(getOver() + 40, getDown() + 15);
        tail.addPoint(getOver() + 55, getDown());
        tail.addPoint(getOver() + 55, getDown() + 25);
        g.setColor(color);
        g.fillPolygon(tail);
        
        
        //eye
        g.setColor(Color.WHITE);
        g.fillOval(getOver() + 10, getDown() + 5, 8, 8);
        g.setColor(Color.BLACK);
        g.fillOval(getOver() + 11, getDown() + 6, 4, 4);
                
    } 
    
}
