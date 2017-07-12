package car;


public class Car {

   String make, model;
   int year;
   boolean isOn;
   
   public Car(String newMake, String newModel, int newYear) {
       make=newMake;
       model=newModel;
       year=newYear;
       isOn = false;
   }
   
       public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   
    public void turnOn() {
        isOn=true;
        System.out.println("The car is now on!");
    }
   
    public void turnOff() {
        if (isOn==true) {
            isOn=false;
            System.out.println("The car is now off!");
        } 
        else {
            System.out.println("The car is already off!");
        }
       
    }
}
