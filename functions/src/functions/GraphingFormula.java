/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Education Unlimited
 */
public class GraphingFormula {

   
    
    public static void main(String[] args) {
	
		//this part will test the functions
		System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has slope " + slope(2,8,4,-4) );
                
		System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has distance " + distance(2,8,4,-4) );
                formula(2,8,4,-4);
	}
 
    
        public static double slope( int x1, int y1, int x2, int y2 ){
	
            double m=(y2-y1)/(x2-x1);
            return m;
	}
        
	public static double distance( int x1, int y1, int x2, int y2 )
	{
           double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
            return d;
	}
        
        public static void formula( int x1, int x2, int y1, int y2){
           double m=slope(  x1, x2,  y1, y2 );
           double b= -m*x1 +y1;
           System.out.println("y="+m+"x+"+b);
        }
    }
    

