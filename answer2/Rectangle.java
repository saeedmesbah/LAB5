
/**
 *
 * @author Saeed & Maryam
 */
public class Rectangle extends Polygon{
    
    public Rectangle(int side1,int side2,int side3,int side4){
        super(side1,side2,side3,side4);
    }
    
    public String isSquare(){
        if(super.getSides().get(0)==super.getSides().get(1) && super.getSides().get(0)==super.getSides().get(2) && super.getSides().get(0)==super.getSides().get(3)){
            return "Square";
        }
        return "Rectangle";
    }
    
    @Override
    public String toString(){
        return isSquare()+" : "+super.toString();
    }
}
