
import java.util.Date; //imports the time
import java.util.InputMismatchException;

public class Meal {
    //Instance Variables
    private int id;
    private String userName;
    private String mealName;
    private double calories;
    private double proteins;
    private double carbohydrates;
    private double fibers;
    private double fats;
    private double sugars;
    private Date timeStamp;

    public Meal(){} //used for JSON library

    /*--------------------------------------------------------
        Meal Constructor returns all @params listed below
        @param int id returns database id of user
        @param String userName returns name of user
        @param String mealName returns name of meal
        @param double calories returns number of calories
        @param double proteins returns number of proteins
        @param double carbohydrates returns number of carbs
        @param double fibers returns number of fibers
        @param double fats returns number of fats
        @param double sugars returns number of sugars
        @param Date timeStamp returns time logged for meal
        @throws InputMismatchException if @params null or empty
     --------------------------------------------------------*/
    public Meal(int id, String userName, String mealName,
                double calories, double proteins, double carbohydrates,
                double fibers, double fats, double sugars, Date timeStamp) {
        //Check for null or empty


        //Set default values
        this.id = id;
        this.userName = userName;
        this.mealName = mealName;
        this.calories = calories;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fibers = fibers;
        this.fats = fats;
        this.sugars = sugars;
        this.timeStamp = timeStamp;
    } //Meal constructor

    /*--------------------------------------------------------
        getUserName() returns user's name
     --------------------------------------------------------*/
    public String getUserName(){
        return userName;
    } //getUserName() method


    /*--------------------------------------------------------
        getMealName() returns meal's name
    --------------------------------------------------------*/
    public String getMealName(){
        return mealName;
    } //getMealName() method

    /*--------------------------------------------------------
        getCalories() returns calories
    --------------------------------------------------------*/
    public double getCalories(){
        return calories;
    } //getCalories() method

    /*--------------------------------------------------------
        getProteins() returns proteins
    --------------------------------------------------------*/
    public double getProteins(){
        return proteins;
    } //getProteins() method

    /*--------------------------------------------------------
        getCarbohydrates() returns carbohydrates
    --------------------------------------------------------*/
    public double getCarbohydrates(){
        return carbohydrates;
    } //getCarbohydrates() method

    /*--------------------------------------------------------
        getFibers() returns fibers
    --------------------------------------------------------*/
    public double getFibers(){
        return fibers;
    } //getFibers() method

    /*--------------------------------------------------------
        getFats() returns fats
    --------------------------------------------------------*/
    public double getFats(){
        return fats;
    } //getFats() method

    /*--------------------------------------------------------
        getSugars() returns sugars
    --------------------------------------------------------*/
    public double getSugars(){
        return sugars;
    } //getSugars() method

    /*--------------------------------------------------------
        getTimeStamp() returns time meal was logged
    --------------------------------------------------------*/
    public Date getTimeStamp(){
        return timeStamp;
    } //getTimeStamp() method


}
