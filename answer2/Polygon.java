
import java.util.*;
/**
 *
 * @author Saeed & Maryam
 */
public class Polygon extends Shape{
    
    public Polygon(int ...a){
        super(a);
    }
    
    @Override
    public String toString(){
        String s="";
        for(int i=0;i<super.getSides().size();i++){
            s=s+"Side"+i+"="+super.getSides().get(i);
        }
        return s+super.toString();
    }
    
    /**
     *
     * @return
     */
    @Override
    public ArrayList getSides(){
        return super.getSides();
    }

    
    
    
}
