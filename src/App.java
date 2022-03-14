
public class App {
    public static void main(String[] args) throws Exception {
        Car myFerrari = new Car("Ferrari","488"); 
        myFerrari.moveForward();
        myFerrari.brake();
            
        Car myToyota = new Car("Toyota","corolla hybrid");
        myToyota.turnLeft();
        myToyota.moveForward();
    }
}
