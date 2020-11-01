
/**
 *
 * @author Saeed & Maryam
 */
public class Circle {
    private int radius;
    
    public Circle(int radius){
        this.radius=radius;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public double calculatePerimeter(){
        return (radius*4*Math.PI);
    }
    
    public double calculateArea(){
        return (radius*radius*2*Math.PI);
    }
    
    public void drawCircle() { 
        int r =radius;
        int N = 2*r+1; 
  
        int x, y; // Coordinates inside the rectangle 
  
        // Draw a square of size N*N. 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) { 
                // Start from the left most corner point 
                x = i-r; 
                y = j-r; 
  
                // If this point is inside the circle, print it 
                if (x*x + y*y <= r*r+1 ) 
                    System.out.print("*"); 
                else 
                    // If outside the circle, print space 
                    System.out.print(" "); 
  
                System.out.print(" "); 
            } 
  
            System.out.println(); 
        } 
    } 
    
    public void draw(){
        System.out.println("Circle");
        System.out.println("Perrimeter: "+calculatePerimeter());
        System.out.println("Area: "+calculateArea());
        drawCircle();
    }
    
    @Override
    public String toString(){
        return "Circle -- Radius: "+radius;
    }
    
}
