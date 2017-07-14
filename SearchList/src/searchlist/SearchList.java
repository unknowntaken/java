/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class SearchList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         ArrayList a = new ArrayList();
       ArrayList b = new ArrayList();
       int index=0;
      while (index<10) {
          a.add((int)(Math.random()*50)+1);
          index++;
    
    }
   System.out.println("What number do you want to look for?");
   int search = Integer.parseInt(keyboard.nextLine());
    boolean found = false;
    for (int i=0; i<a.size(); i++){
        if ((int)a.get (i) == search){
            found =true;
        }
    }
    System.out.println(found);
     System.out.println(a);
    int max = -1;
    for (int i=0; i<a.size(); i++){
        if ((int)a.get (i)>max){
            max = (int)a.get (i);
        }
    }
    System.out.println(max);
   
       ArrayList<String> c = new ArrayList<String>();
       c.add("A");
       c.add("bunch");
       c.add("of");
       c.add("revolutionary");
       c.add("manumition");
       c.add("abolitionist,");
       c.add("give");
       c.add("me");
       c.add("your");
       c.add("position");
       c.add("show");
       c.add("me");
       c.add("where");
       c.add("the");
       c.add("ammuntion");
       c.add("is!");
       
       System.out.println(c);
       ArrayList sorted = new ArrayList();
       String first;
       while (c.size() >0){
        first= c.get(0);
        for (int i=0; i<c.size(); i++){
         if (first.compareTo(c.get(i)) >0){
             first = c.get(i);
         }
    }
        c.remove(first);
        sorted.add (first);
       }
       
       System.out.println(sorted);
    }
}