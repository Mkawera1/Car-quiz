import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CarApp> cars = new ArrayList<>();

        // create an instance or object of a car
        CarApp carOne = new CarApp();

        // (introduce the variables
        String make = "";
        String model = "";
        int year = 0;

        //prompt user to enter info for each variable
        System.out.println("Please enter make: ");
        make = sc.nextLine();
        //set input to the variable names
        carOne.setMake(make);

        System.out.println("Please enter model: ");
        model = sc.nextLine();
        carOne.setModel(model);

        System.out.println("Please enter year: ");
        year = sc.nextInt();//nextInt is for integers
        carOne.setYear(year);


        System.out.println(carOne.displayEverything());
        //or System.out.println(carOne.displayEverything());
        //add car instance or object into an arrayList called cars
        cars.add(carOne);
        int counter = 1;
        for(CarApp car:cars){
            System.out.println("This is your car " + counter);
            System.out.println(carOne.displayEverything());
            counter = counter + 1;
        }
    }

}
