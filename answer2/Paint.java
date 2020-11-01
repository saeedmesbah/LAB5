
import java.util.*;


/**
 *
 * @author Saeed & Maryam
 */
public class Paint {
    
    private ArrayList<Shape> shape;
    
    public Paint(){
        shape=new ArrayList<Shape>();
    }
    
    public void addShape(Shape shape){
        this.shape.add(shape);
    }
    
    public void drawAll(){
        for(Shape s:shape){
            s.draw();
            System.out.println("|||||||||||||");
        }
    }
    
    public void printAll(){
        for(Shape s:shape){
            System.out.println(s.toString());
            System.out.println("|||||||||||||");
        }
    }
}
