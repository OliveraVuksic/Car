
import static java.lang.Double.NaN;


public class Main {

    
    public static void main(String[] args) {
        
        Car myCar = new Car(); //my.Car je objekat
        //myCar.printAttributes();
        
//        myCar.changeModel("myCarmodel123");
//        myCar.changeMaxSpeed(1000);
//        myCar.changeMinSpeed(500);
//        myCar.changeWeight(100.123);
//        myCar.chageLicense("myCar123");
//        myCar.changeMaxFuel(10000);
//        myCar.changeCurrentFuel(555);
//        myCar.changeConsumption(5);
//        
//        double distance = myCar.maxDistance();
//        System.out.println("Max distance is: " + distance);
//        myCar.printAttributes();
                
        Car audi = new Car("Audi", 50, 2); //audi je objekat
//        audi.chageLicense("audi123");
//        System.out.println("Max distance is: " + audi.maxDistance());
//        audi.printAttributes();
        
        audi.fuelUp();        audi.printAttributes();

        audi.travel(20);
        audi.printAttributes();
        audi.travel(30);
        audi.printAttributes();

    }
    
}
