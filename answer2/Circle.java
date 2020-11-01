
import java.util.*;
/**
 *
 * @author Saeed & Maryam
 */
public class Circle extends Shape{
    
    public Circle(int radius){
        super(radius);
    }

    
    
    @Override
    public String toString(){
        return super.toString()+" Circle -- radius:"+super.getSides().get(0);
    }
    
    public ArrayList getRadius(){
        return super.getSides();
    }
}
