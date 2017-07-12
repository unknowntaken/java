/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Education Unlimited
 */
public class PhoneBookExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Variables pl = new Variables("Random", "P-Money", "5104089375");
      PhoneBook pb = new PhoneBook();
      pb.addVariable(pl);
      
      
      Variables p2 = new Variables("Unknown", "Pablo", "5108352279");
      pb.addVariable(p2);
      
      Variables p3 = new Variables("Angle", "Arcasta", "4278093759");
      pb.addVariable(p3);
      pb.printEntries();
    }
    
}
