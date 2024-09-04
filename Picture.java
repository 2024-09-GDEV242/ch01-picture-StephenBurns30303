/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Stephen M. Burns
 * @version 2024.09.3
 */
public class Picture
{

    private boolean drawn;
    
    private Square background1, background2, background3, background4;
    private Triangle fractal1, fractal2, fractal3, fractal4;
    private Circle circle1, circle2, circle3, circle4;
    private Person person1, person2, person3, person4;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background1 = new Square();
        background2 = new Square();
        background3 = new Square();
        background4 = new Square();
        
        circle1 = new Circle();
        circle2 = new Circle();
        circle3 = new Circle();
        circle4 = new Circle();
        
        fractal1 = new Triangle();
        fractal2 = new Triangle();
        fractal3 = new Triangle();
        fractal4 = new Triangle();
        
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        

        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {

            
            background1.changeColor("black");
            background1.moveHorizontal(-102);
            background1.moveVertical(40);
            background1.changeSize(40);
            background1.makeVisible();

    

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
   

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {

    }
}
