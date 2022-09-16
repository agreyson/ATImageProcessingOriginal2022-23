import processing.core.PImage;

public class Panel {

    /* INSTANCE VARIABLES: maintain information about an object/instance.*/
    /* Instance variables are usually private to achieve INFORMATION HIDING.*/
    private PImage img;
    private int x;
    private int y;
    private int w;
    private int h;

    /* CONSTRUCTOR: a method that initializes an object.*/
    /* SHADOWING is avoided by giving the parameters different */
    /* names than their corresponding instance variables.*/
    public Panel(int _x, int _y, int _w, int _h){
        x = _x;
        y = _y;
        w = _w;
        h = _h;
    }

    /* INSTANCE METHODS: methods that define the behavior of an object. */
    /* OVERRIDE: when a subclass implements an instance method differently from its superclass.*/
    public void display(){
        Main.app.image(getImageCopy(), getX(), getY(), getWidth(), getHeight());
    }
    public void setupImage(String imageName){
        img = Main.app.loadImage(imageName);
    }

    public void handleMouseClicked(int _x, int _y) {

    }

    /* GETTERS: special instance methods that returns the value of an instance variable.*/
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getWidth(){
        return w;
    }
    public int getHeight(){
        return h;
    }
    public PImage getImageCopy(){
        return img.copy();
    }

    /* SETTERS: special instance methods that assigns a value to an instance variable.*/
    public void setX(int _x){
        x = _x;
    }
    public void setY(int _y){
        y = _y;
    }
}
