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
public class PhoneBook {
    Variables[] pb;
    int length;
    
    
    public PhoneBook() {
        length=0;
        pb = new Variables[100];
                
    }
    public void addVariable(Variables p) {
        pb[length++]=p;
    }
    
    public void printEntries() {
        for(int x=0; x<length; x++) {
            
            System.out.println(pb[x] .getFirstName()+" "+pb[x].getLastName()+ ", "+pb[x].getPhoneNumber());
        }
    }
}
