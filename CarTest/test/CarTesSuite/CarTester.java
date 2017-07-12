package CarTesSuite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cartest.Car;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlimited
 */
public class CarTester {
    double e = .0000000001;
    Car c = new Car("Toyota", "Camry", 1999, "Stella", "Teal", 8, 189067.9);
    
    @Test
    public void makeGetterTest(){
        assertEquals(c.getMake(), "Toyota");
    }
    @Test
     public void makeSetterTest(){
         c.setMake("Honda");
     }
     @Test
      public void makeBetterTest(){
          c.setMake("Camry");
      }
      @Test
       public void makeKetterTest(){
           c.setMake("Teal");
       }
       @Test
        public void makeHetterTest(){
            c.setMake("Stella");
        }
        
    public CarTester() {
    }
    
}
