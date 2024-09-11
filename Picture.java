/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * I was kind of going for different dimensions overlapping each other like 
 * four dioramas. I went with 80's esque color scheme because alot of retro-art
 * being made with it has this otherworldly feel. I was able to squeeze an
 * animation into but if I had more time I would have had the ball change color
 * as it passes through each dimension.
 * 
 * @author  Stephen M. Burns
 * @version 2024.09.3
 */
public class Picture
{

    private boolean drawn;
    
    private Square background1, background2, background3, background4;
    private Triangle fractal1, fractal2, fractal3, fractal4;
    private Circle circle1, circle2, circle3, circle4, animationTest;
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
        animationTest = new Circle();
        
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
            
            animationTest.changeColor("orange");
            
            background1.changeColor("orange");
            background2.changeColor("neon");
            background3.changeColor("gold");
            background4.changeColor("purple");
            
            circle1.changeColor("gold");
            circle2.changeColor("purple");
            circle3.changeColor("orange");
            circle4.changeColor("neon");
            
            fractal1.changeColor("gold");
            fractal2.changeColor("purple");
            fractal3.changeColor("orange");
            fractal4.changeColor("neon");
            
            person1.changeColor("gold");
            person2.changeColor("purple");
            person3.changeColor("orange");
            person4.changeColor("neon");
            
            background1.moveHorizontal(0);
            background1.moveVertical(-120);
            background1.changeSize(120);
            background1.makeVisible();

            background2.moveHorizontal(-100);
            background2.moveVertical(-100);
            background2.changeSize(120);
            background2.makeVisible();
            
            background3.moveHorizontal(-200);
            background3.moveVertical(-80);
            background3.changeSize(120);
            background3.makeVisible();

            background4.moveHorizontal(-300);
            background4.moveVertical(-60);
            background4.changeSize(120);
            background4.makeVisible();
            
            circle1.moveHorizontal(-180);
            circle1.moveVertical(-20);
            circle1.changeSize(40);
            circle1.makeVisible();
            
            circle2.moveHorizontal(-80);
            circle2.moveVertical(-20);
            circle2.changeSize(40);
            circle2.makeVisible();
            
            circle3.moveHorizontal(20);
            circle3.moveVertical(-20);
            circle3.changeSize(40);
            circle3.makeVisible();

            circle4.moveHorizontal(120);
            circle4.moveVertical(-20);
            circle4.changeSize(40);
            circle4.makeVisible();

            fractal1.changeSize(20,20);
            fractal1.moveHorizontal(20);
            fractal1.moveVertical(0);
            fractal1.makeVisible();
            
            fractal2.changeSize(20,20);
            fractal2.moveHorizontal(-80);
            fractal2.moveVertical(20);
            fractal2.makeVisible();

            fractal3.changeSize(20,20);
            fractal3.moveHorizontal(220);
            fractal3.moveVertical(-40);
            fractal3.makeVisible();
            
            fractal4.changeSize(20,20);
            fractal4.moveHorizontal(120);
            fractal4.moveVertical(-20);
            fractal4.makeVisible();
            
            person1.moveHorizontal(-165);
            person1.moveVertical(-30);
            person1.changeSize(20,20);
            person1.makeVisible();
            
            person2.moveHorizontal(-65);
            person2.moveVertical(-50);
            person2.changeSize(20,20);
            person2.makeVisible();
            
            person3.moveHorizontal(35);
            person3.moveVertical(-70);
            person3.changeSize(20,20);
            person3.makeVisible();
            
            person4.moveHorizontal(135);
            person4.moveVertical(-90);
            person4.changeSize(20,20);
            person4.makeVisible();
            
            animationTest.moveHorizontal(40);
            animationTest.moveVertical(160);
            animationTest.changeSize(40);
            animationTest.makeVisible();
            
            int countLoop=1;
            
            while(countLoop>=0)
            {
                animationTest.slowMoveHorizontal(80);
                animationTest.changeColor("purple");
                animationTest.slowMoveHorizontal(-180);
                animationTest.changeColor("gold");
                animationTest.slowMoveHorizontal(80);
                animationTest.changeColor("neon");
                animationTest.slowMoveHorizontal(-180);
                animationTest.changeColor("orange");
                animationTest.slowMoveHorizontal(80);
                --countLoop;
            }

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
        animationTest.changeColor("black");
        
        background1.changeColor("black");
        background2.changeColor("white");
        background3.changeColor("black");
        background4.changeColor("white");
        
        circle1.changeColor("black");
        circle2.changeColor("white");
        circle3.changeColor("black");
        circle4.changeColor("white");
        
        fractal1.changeColor("black");
        fractal2.changeColor("white");
        fractal3.changeColor("black");
        fractal4.changeColor("white");
        
        person1.changeColor("black");
        person2.changeColor("white");
        person3.changeColor("black");
        person4.changeColor("white");

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
        animationTest.changeColor("purple");
        
        background1.changeColor("orange");
        background2.changeColor("neon");
        background3.changeColor("gold");
        background4.changeColor("purple");
            
        circle1.changeColor("gold");
        circle2.changeColor("purple");
        circle3.changeColor("orange");
        circle4.changeColor("neon");
            
        fractal1.changeColor("gold");
        fractal2.changeColor("purple");
        fractal3.changeColor("orange");
        fractal4.changeColor("neon");
            
        person1.changeColor("gold");
        person2.changeColor("purple");
        person3.changeColor("orange");
        person4.changeColor("neon");

    }
}
