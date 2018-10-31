import java.util.ArrayList;
import java.lang.*;

/**
 * This class Creates a number of people (must be more than 2) and then matches each one with another so that there are no repeats. This version has been customised for a secret santa draw.
 */
public class Match {

    ArrayList<Person> list = new ArrayList<Person>();

    public static void main(String[] args){

        Match system = new Match();
        system.start();
    }

    public void start() {
        int numberOfPeople = 7; //Enter the number of people to be matched
        int complete = 0;
        //create People here
        Person mary = new Person("Mary", list);
        Person adam = new Person("Adam", list);
        Person jarl = new Person("Jarl", list);
        Person sarah = new Person("Sarah", list);
        Person dave = new Person("Dave", list);
        Person manny = new Person("Manny", list);
        Person julie = new Person("Julie", list);

        //matching algorithm
        while(complete < numberOfPeople) {
            int x = (int)Math.round(Math.random() * 6);
            int y = (int)Math.round(Math.random() * 6);

            if(list.get(x).getGiven() == 0 && list.get(y).getTaken() == 0 && x != y){System.out.println(list.get(x).getName() + " is " +list.get(y).getName()+  "'s Secret Santa!"); complete++; list.get(x).setGiven(1); list.get(y).setTaken(1);}


        }
    }



}
