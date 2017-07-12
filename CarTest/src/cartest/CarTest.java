
package cartest;

public class CarTest {
   
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1= 1999;
        String nickName1="swag car", color1="blue";
    int yearsOwned1=5;
   double miles1=5970000;
   
   
       Car car1= new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear());
       System.out.println("Nickname: " + car1.getNickName() + ", color: " + car1.getColor());
       System.out.println("Owned: " + car1.getYearsOwned() + ", miles: " + car1.getMiles());
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }
    
}
