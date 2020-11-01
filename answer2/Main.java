
/**
 *
 * @author Saeed & Maryam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect3 = new Rectangle(6,6,6,6);
        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);
        
        Paint p=new Paint();
        
        p.addShape(tri1);
        p.addShape(tri2);
        
        p.addShape(circle1);
        p.addShape(circle2);
        
        p.addShape(rect1);
        p.addShape(rect2);
        p.addShape(rect3);
        
        p.drawAll();
        //p.printAll();
        
    }
    
}
