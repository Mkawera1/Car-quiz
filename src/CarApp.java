public class CarApp {

    private String make;
    private String model;
    private int year;

    public CarApp() {
    }

    public CarApp(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //make method that displays everything
    public String displayEverything(){
        String displayEverything = "";
        displayEverything = "Make: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear();
        return displayEverything;
    }
}
