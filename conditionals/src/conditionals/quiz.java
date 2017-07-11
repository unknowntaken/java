/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 1 question.");
        
        System.out.println("Can you say the Alphabet faster than me?");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("the Alphabet")){
            System.out.println("that is correct");
            
        }
        else {
            System.out.println("sucks for you.");
        }
        System.out.println("What is square root of 752?");
        String anwser3 = keyboard.nextLine();
        if (anwser3.equals(27.4)){
            System.out.println("correct");
            
            
        }
        else{
            System.out.println("better luck next time");
        }
        System.out.println("What city has the orental pearl?");
        String anwser4 = keyboard.nextLine();
        if (anwser4.equals(Shanghi)){
            System.out.println("correct");
           
        }
        else{
            System.out.println
        }
    }
    
}
