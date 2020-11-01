
import java.util.*;
/**
 *
 * @author Saeed & Maryam
 */
public class Shape {
    
    ArrayList<Integer> sides;
    
    public Shape(int ...a){
        sides=new ArrayList<Integer>();
        for(int i:a){
            sides.add(i);
        }
    }
    
    public double calculatePerimeter(){
        if(sides.size()==3){
            return (sides.get(0)+sides.get(1)+sides.get(2));
        }
        
        if(sides.size()==4){
            return (sides.get(0)+sides.get(1)+sides.get(2)+sides.get(3));
        }
        
        else{
            return (sides.get(0)*4*Math.PI);
        }
    }
    
    public double calculateArea(){
        if(sides.size()==4){
            return ( Math.sqrt( (sides.get(1)*sides.get(1))-(sides.get(0)/2)*(sides.get(0)/2) ) * sides.get(0)/2 );
        }
        if(sides.size()==3){
            return (sides.get(0)*sides.get(1));
        }
        else{
            return (sides.get(0)*sides.get(0)*2*Math.PI);
        }
    }
    
    public ArrayList getSides(){
        return sides;
    }
    
    public String toString(){
        return "  ";
    }
    
    public void draw(){
        if(sides.size()==4){
            System.out.println("rectangle");
        }
        if(sides.size()==3){
            System.out.println("triangle");
        }
        else{
            System.out.println("circle");
        }
        System.out.println("Perrimeter: "+calculatePerimeter());
        System.out.println("Area: "+calculateArea());
    }
}
