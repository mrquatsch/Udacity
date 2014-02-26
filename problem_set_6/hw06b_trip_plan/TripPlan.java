//
//Complete the class TripPlan which describes the cities that are visited by a tour conducted by Java Now Tours.
//Keep an arraylist of cities (just the string name). Have methods to add a city, remove a city,
//to return the names of the cities in a String, and to reverse the order of the elements in the array list.
//
//Notice that the reverse method is void.

//
//For the draft, provide the instance variable and finish the constructor.
//For the toString method simply return the string "TripPlan["
//

import java.util.ArrayList;

/**
 * A TripPlan represents a trip and holds a collection of city names.
 */
public class TripPlan
{
    // TODO: add instance variable here
    ArrayList<String> cities;

    /**
     * Constructs an empty trip.
     */
    public TripPlan()
    {
        // TODO: Initialize the instance variable
        cities = new ArrayList<String>();
    }

    /**
     * Add a city to the list.
     * @param cityName the city to add
     */
    public void addCity(String cityName)
    {
        // TODO: Write code to add a city to the array list instance variable
        cities.add(cityName);
    }

    /**
     * Returns a string describing the object.
     * @return a string in the format "TripPlan[cityName1,cityName2,...]"
     */
    public String toString()
    {
        String list = "";
        boolean first = true;
        for(String city : cities) {
            if(first) {
                list = city;
                first = false;
            } else {
                list = list + "," + city;
            }
        }
        return "TripPlan[" + list + "]";
    }

    /**
     * Removes a city form the this trip
     * @param cityName city to remove
     */
    public void removeCity(String cityName)
    {
        // TODO: Write code to remove a city to the array list instance variable
        cities.remove(cityName);
    }

    /**
     * Reverses the elements in the itinerary.
     */
    public void reverse()
    {
        int size = cities.size();
        for(int i = cities.size(); i > 0; i--) {
            cities.add(i, cities.get(0));
            cities.remove(0);
        }
    }
}