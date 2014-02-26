// BlueJ project: lesson8/carshare6

import java.util.ArrayList;
import java.util.Scanner;

public class Simulation
{
    private ArrayList<Car> cars;
    private ArrayList<Person> people;

    public Simulation()
    {
        cars = new ArrayList<Car>();
        people = new ArrayList<Person>();
    }

    /**
       Reads the car and person data. Each row has the format
       n    Driver or Passenger Name   Destination
       where n is the number of seats for a car,
       0 for a passenger, -1 to signify the end of input.
       @param in the scanner to read from
    */
    public void read(Scanner in)
    {
        boolean done = false;
        System.out.println("Enter input of the form n Name Destination");
        System.out.println("n > 0: Car with n seats, n = 0: Passenger, n = -1: End of input");
        while (!done)
        {
            int capacity = in.nextInt();
            if (capacity == -1)
            {
                done = true;
            }
            else
            {
                String name = in.next();
                int destination = in.nextInt();
                if (capacity == 0)
                {
                    people.add(new Person(name, destination));
                }
                else
                {
                    cars.add(new Car(name, capacity, destination));
                }
            }
        }
    }

    /**
       Load all passengers into cars.
    */
    public void loadPassengers()
    {
        for (Person p : people)
        {
            boolean added = false;
            for (int i = 0; !added && i < cars.size(); i++)
            {
                added = cars.get(i).tryToAdd(p);
                // TODO: Add print statement here
                //System.out.println("Trying to add " + p.getName() + " to car number " + i + ", driven by " + cars.get(i).getDriverName() + ".");
            }
        }
    }

    /**
       Drive all cars until they have arrived.
    */
    public void driveCars()
    {
        for (Car c : cars) {
            boolean arrived = false;
            while(!arrived) {
                if(c.hasArrived()) {
                    arrived = true;
                } else {
                    c.drive();
                }
            }
        }
    }
}
