
import java.util.*;
/**
 *
 * @author Saeed & Maryam
 */
public class Print {
    private ArrayList<Circle> circle;
    private ArrayList<Triangle> triangle;
    private ArrayList<Rectangle> rectangle;
    
    public Print(){
        circle=new ArrayList<Circle>();
        rectangle=new ArrayList<Rectangle>();
        triangle=new ArrayList<Triangle>();
    }
    
    public void addCircle(Circle c){
        circle.add(c);
    }
    public void addRectangle(Rectangle r){
        rectangle.add(r);
    }
    public void addTriangle(Triangle t){
        triangle.add(t);
    }
    
    public void drawAll(){
        for(Circle c:circle){
            c.draw();
        }
        
        for(Triangle t: triangle){
            t.draw();
        }
        
        for(Rectangle r: rectangle){
            r.draw();
        }
    }
    
    public void printAll(){
        for(Circle c:circle){
            System.out.println(c.toString());
        }
        
        for(Triangle t: triangle){
            System.out.println(t.toString());
        }
        
        for(Rectangle r: rectangle){
            System.out.println(r.toString());
        }
    }
    
}
