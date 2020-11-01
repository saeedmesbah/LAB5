
/**
 *
 * @author Saeed & Maryam
 */
public class Triangle extends Polygon{
    
    public Triangle(int side1,int side2,int side3){
        super(side1,side2,side3);
    }

    
    public String isEquilateral(){
        if(super.getSides().get(0)==super.getSides().get(1) && super.getSides().get(0)==super.getSides().get(2)){
           return "Equilateral";
        }
        return "Normal";
    }
    
    @Override
    public String toString(){
        return isEquilateral()+" Triangle : "+super.toString();
    }
    
}
