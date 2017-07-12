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
public class Variables {

    /**
     * @param args the command line arguments
     */
        int age;
        double height;
        String firstName;
        String lastName;
        boolean isAStudent;
        String phoneNumber;

        public Variables(String first, String last, String phone) {
            firstName=first;
            lastName=last;
            phoneNumber=phone;
        }
        
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isIsAStudent() {
        return isAStudent;
    }

    public void setIsAStudent(boolean isAStudent) {
        this.isAStudent = isAStudent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
       
               
    }
    

