import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

String result = carOne.displayEverything();
        System.out.println(result);
    }

}
