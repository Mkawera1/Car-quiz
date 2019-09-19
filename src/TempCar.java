import java.util.ArrayList;
import java.util.Scanner;

public class TempCar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInfo = "";
        String make = "";
        String model= "";
        int year = 0;
        ArrayList<CarApp> cars = new ArrayList<>();
        System.out.println("We are creating a list of cars. ");
        int counter = 1;

        while(true){
            CarApp car1 = new CarApp();

            System.out.println("Please enter the make of car " + counter);
            make = input.nextLine();
            car1.setMake(make);

            System.out.println("Please enter the model of car " + counter);
            model = input.nextLine();
            car1.setModel(model);

            System.out.println("Please enter the year of car " + counter);
            year = input.nextInt();
            car1.setYear(year);

            cars.add(car1);
            System.out.println("Do you want to add another car? (y/n)");
            userInfo = input.nextLine();
             if(userInfo.equalsIgnoreCase("n")){
                 break;
             }
             counter = counter+1;

        }
        counter = 1;
        for(CarApp car : cars ){
            System.out.println("Car" + counter);
            System.out.println(car.displayEverything());
            counter = counter + 1;
        }
    }
}
