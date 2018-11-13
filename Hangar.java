

public class Hangar {

    public static void main(String... args){
        Car myCar = new Car("Cadillac");
        Boat myBoat = new Boat("Carolina Skiff");

        System.out.println(myCar.doStuff());
        System.out.println(myBoat.doStuff());
    }
}
