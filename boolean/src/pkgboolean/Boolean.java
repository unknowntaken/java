/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgboolean;

/**
 *
 * @author Education Unlimited
 */
public class Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int x,y;
        boolean a,b,c,d,e,f;
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
        String s1= "Good Morning";
        String s2= "Hi there";
        String s3= "Howdy, partner";
        System.out.println(s1.equals(s1));
        System.out.println(s2.compareTo(s1));
        System.out.println(s3.compareTo(s2));
        
        boolean b1=true;
        boolean b2=false;
        
        System.out.println(b1&&!b2);
        System.out.println(b1 && b1);
        System.out.println(b2 && b2);
        System.out.println(b2 || !b1);
        System.out.println(b2 && b2);
    }
    
}

    
    

