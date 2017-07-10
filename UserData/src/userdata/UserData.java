
package userdata;

import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name = keyboard.nextLine();
        
       System.out.println("Hi Ethan, how old are you?");
       String age = keyboard.nextLine();
       
       System.out.println("When is you birthday?");
       String day = keyboard.nextLine();
       String month = keyboard.nextLine();
       String year = keyboard.nextLine();
       
       System.out.println("What is your favorite book?");
       String book = keyboard.nextLine();
       
       System.out.println("What is your hometown?");
       String hometown = keyboard.nextLine();
       
       System.out.println("Whatr is your Lucky Number?");
       String luckynumber = keyboard.nextLine();
       
       System.out.println("W hat is your shoe size?");
       String shoesize = keyboard.nextLine();
       
       System.out.println("On a scale of 1 to 5, how excited you are to learn Java");
       String scale = keyboard.nextLine();
       
       System.out.println("One cool fact about you.");
       String fact = keyboard.nextLine();
       
       System.out.println("name + age + day + month + year + book + hometown + luckynumber + shoesize + scale + fact");
       String everything = keyboard.nextLine();
       
    }
    
}
