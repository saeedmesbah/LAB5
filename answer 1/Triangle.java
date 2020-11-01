
import java.util.*;


/**
 *
 * @author Saeed & Maryam
 */
public class Triangle {
    private ArrayList<Integer> sides;
    
    public Triangle(int side1,int side2,int side3){
        sides=new ArrayList<Integer>();
        addSide(side1);
        addSide(side2);
        addSide(side3);
    }
    
    public ArrayList getSides(){
        return sides;
    }
    
    public void addSide(int side){
        sides.add(side);
    }
    
    public String isEquilateral(){
        if(sides.get(0)==sides.get(1) && sides.get(0)==sides.get(2)){
           return "Equilateral";
        }
        return "Normal";
    }
    
    public double calculatePerimeter(){
        return (sides.get(0)+sides.get(1)+sides.get(2));
    }
    
    public double calculateArea(){
        return ( Math.sqrt( (sides.get(1)*sides.get(1))-(sides.get(0)/2)*(sides.get(0)/2) ) * sides.get(0)/2 );
    }
    
    public void draw(){
        System.out.println("Triangle");
        System.out.println("Perrimeter: "+calculatePerimeter());
        System.out.println("Area: "+calculateArea());
    }
    
    @Override
    public String toString(){
        return isEquilateral()+" Triangle -- side1: "+sides.get(0)+"-- side2: "+sides.get(1)+"-- side3: "+sides.get(2);
    }
}
