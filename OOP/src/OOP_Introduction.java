class Car {
    String brand;
    String color;
    int speed;
    String model;

    // Parameterized Constructor
    Car(String brand, String color, int speed, String model) {
        System.out.println("Parameterized Constructor");
        this.brand = brand;
        this.color=color;
        this.speed = speed;
        this.model=model;
    }

   // Default Constructor
    Car(){
        System.out.println("Default Constructor");
        this.color = "Black";
        this.brand= "Tata";
        this.speed = 80;
        this.model= "Safari";
    }

    Car(Car newCar){
        this.color = "Black"; 
        this.brand= "Tata";
        this.speed = 80;
        this.model= "Safari";
        System.out.println("Copy constructor involved");
    }



    public void drive() {
        System.out.println("High performance");
    }
    public void speedUp() {
        System.out.println("Speed Up");
    }
}




public class OOP_Introduction {
    public static void main(String[] args) {
        Car car1 = new Car(); // object allocated in heap
        // System.out.println(car1.brand);

        Car car2 = new Car("Mahindra","blue",60,"xuv");
//        System.out.println(car2.brand);

        Car car3= new Car(car2);
        System.out.println(car3.speed);
    }
}



