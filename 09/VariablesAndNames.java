public class VariablesAndNames
{
    public static void main(String[] args)
    {
        int cars = 100;
        double SpaceInACar = 4.0;
        int drivers = 30;
        int passengers = 90;
        int CarsNotDriven = cars - drivers;
        int CarsDriven = drivers;
        double CarpoolCapacity = CarsDriven * SpaceInACar;
        double AveragePassengersPerCar = passengers / CarsDriven;
        
        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + CarsNotDriven + " empty cars today." );
        System.out.println( "We can transport " + CarpoolCapacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + AveragePassengersPerCar + " in each car." );
    }
}i
