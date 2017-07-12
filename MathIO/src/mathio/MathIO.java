/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathio;
import java.io.*;
/**
 *
 * @author Education Unlimited
 */
public class MathIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        
        String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "7 \n";
            String line2 = "9 \n";
            String line3 = "4 \n";
            String line4 = "3 \n";
            String line5 = "10 \n";

            //here is where you should write your numbers to the file
            
            writer.write(line1);
            writer.write(line2); 
            writer.write(line3);
            writer.write(line4);
            writer.write(line5);
            System.out.println("Done");

	} 
        catch (IOException e) {
            e.printStackTrace();

	}
        
        //Part 2
    
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            int sum=0;
            while (currentLine != null) {
		System.out.println(currentLine);
                sum += Double.parseDouble(currentLine);
                currentLine = reader.readLine();
            }
System.out.println("sum " + sum);
	}
        catch (IOException e) {
            e.printStackTrace();
	}
        
        
        
        
        
        
    }
    
}

    

