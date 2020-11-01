
import java.util.*;
/**
 *
 * @author Saeed & Maryam
 */
public class Rectangle {
    
    private ArrayList<Integer> sides;
    
    public Rectangle(int side1,int side2,int side3,int side4){
        sides=new ArrayList<Integer>();
        addSide(side1);
        addSide(side2);
        addSide(side3);
        addSide(side4);
    }
    
    public ArrayList getSides(){
        return sides;
    }
    
    public void addSide(int side){
        sides.add(side);
    }
    
    public String isSquare(){
        if(sides.get(0)==sides.get(1) && sides.get(0)==sides.get(2) && sides.get(0)==sides.get(3)){
            return "Square";
        }
        return "Rectangle";
    }
    
    public double calculatePerimeter(){
        return (sides.get(0)+sides.get(1)+sides.get(2)+sides.get(3));
    }
    
    public double calculateArea(){
        return (sides.get(0)*sides.get(1));
    }
    
    public void drawCircle() { 
        for(int i=0;i<sides.get(0);i++){
            for(int j=0;j<sides.get(1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    } 
    
    
    public void draw(){
        System.out.println("Rectangle");
        System.out.println("Perrimeter: "+calculatePerimeter());
        System.out.println("Area: "+calculateArea());
        drawCircle();
    }
    
    @Override
    public String toString(){
        return ""+isSquare()+" -- side1: "+sides.get(0)+"-- side2: "+sides.get(1)+"-- side3: "+sides.get(2)+"-- side4: "+sides.get(3);
    }
}
