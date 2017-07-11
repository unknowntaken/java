/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;
        import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class repeater {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it 3 times: " );
       String input = keyboard.nextLine();
           System.out.print( "how many time do you want to repeat it? " );
       int repeat = Integer.parseInt(keyboard.nextLine());
       System.out.println("Here we go!");
       int count = 0;
       while (count < repeat) {
           System.out.println(input);
           count ++;

    }
      int i=0;
       int sum=1;
       while(i<10) {
           sum += i;
           System.out.println("Sum is: " + sum);
           i++;
           
           
    }
    }
}
    

