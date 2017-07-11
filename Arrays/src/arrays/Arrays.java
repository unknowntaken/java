/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Education Unlimited
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]unknown = new int [10];
        
        unknown[0] = 1;
        unknown[1] = 3;
        unknown[2] = 5;
        unknown[3] = 7;
        unknown[4] = 9;
        unknown[5] = 11;
        unknown[6] =13;
        unknown[7] =15;
        unknown[8] =17;
        unknown[9] =19;
        
        System.out.println("the element at unknown" + 0 + "is" + unknown[0]);
        System.out.println("the element at unknown" + 1 + "is" + unknown[1]);
        System.out.println("the element at unknown" + 2 + "is" + unknown[2]);
        System.out.println("the element at unknown" + 3 + "is" + unknown[3]);
        System.out.println("the element at unknown" + 4 + "is" + unknown[4]);
        System.out.println("the element at unknown" + 5 + "is" + unknown[5]);
        System.out.println("the element at unknown" + 6 + "is" + unknown[6]);
        System.out.println("the element at unknown" + 7 + "is" + unknown[7]);
        System.out.println("the element at unknown" + 8 + "is" + unknown[8]);
        System.out.println("the element at unknown" + 9 + "is" + unknown[9]);
     
        double[]unknown2 = new double [10];
        
        int index=0;
        while (index<10) {
            unknown2[index] =1.25;
            System.out.println("the element at index" + index + "is" + unknown2[index] + ", ");
            index++;
        }
        index=0;
        int[]unknown3 = new int [1000];
         while(index<1000){
                 unknown3[index] = (int) (Math.random() *1000) +1;
                if (index %20==0){
                    System.out.println(unknown3[index] + " ");
                }
                else{
                    System.out.print(unknown3[index] + " ");
                }
                index++;
                }
}}


    

