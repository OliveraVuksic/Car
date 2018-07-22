
public class Car {
    
    //definisem atribute za klasu Car
    String model;   //metoda customModel
    int maxSpeed;   //metoda customMaxSpeed
    int minSpeed;   //metoda customMinSpeed
    double weight;  //metoda customWeight
    String license; //metoda customLicense
    int maxFuel;    // metoda customMaxFuel
    int currentFuel; //metoda customCurrentFuel
    int consumption; //metoda customConsumption
// cons.per distab=nce units (km)
    int mileage = 0;
    
    public Car() {
        this.model = "Default";
        this.maxFuel = 100;
        this.consumption = 5;
    }
    
    public Car(String customModel, int customMaxFuel, int custumConsumption) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = custumConsumption; 
    }

    public void changeModel(String customModel) {
        this.model = customModel;
    }   
    
    public void changeMaxSpeed(int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }
    
    public void changeMinSpeed(int customMinSpeed) {
        this.minSpeed = customMinSpeed;
    }    
    
    public void changeWeight(Double customWeight) {
        this.weight = customWeight;
    }    
    
    public void chageLicense(String customLicense) {
        this.license = customLicense;
    }

    public void changeMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
        
    public void changeCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
        
    public void changeConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }
        
    public double maxDistance() {
//        return this.maxFuel / this.consumption;
        double dist = this.maxFuel / this.consumption;
        return dist;
    }
    
    public void printAttributes() {
        System.out.println("Model: " + this.model); 
        System.out.println("Max Speed: " + this.maxSpeed); 
        System.out.println("Min Speed: " + this.minSpeed); 
        System.out.println("Weight: " + this.weight); 
        System.out.println("License: " + this.license);
        System.out.println("Max Fuel: " + this.maxFuel); 
        System.out.println("Current Fuel: " + this.currentFuel);
        System.out.println("Trenutno stanje reyervoara (Consumption): " + this.consumption);
        System.out.println("Ukupna predjena distanca: " + this.mileage);
        System.out.println("");
    }
    
    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }
    
    public void travel(int distance) {
        
        if (this.currentFuel >= distance * this.consumption) {
            this.mileage = this.mileage + distance;
        this.currentFuel = this.currentFuel - distance * this.consumption;
        }
        else {
            System.out.println("Nema dovoljno goriva za taj put.");
        }
        
    }
   
}
