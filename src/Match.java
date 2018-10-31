import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;

public class Match {

    ArrayList<Person> list = new ArrayList<Person>();

    public static void main(String[] args){

        Match system = new Match();
        system.start();
    }

    public void start() {
        int numberOfPeople = 7;
        int complete = 0;
        Person mary = new Person("Mary", list);
        Person adam = new Person("Adam", list);
        Person jarl = new Person("Jarl", list);
        Person sarah = new Person("Sarah", list);
        Person dave = new Person("Dave", list);
        Person manny = new Person("Manny", list);
        Person julie = new Person("Julie", list);

        while(complete < numberOfPeople) {
            int x = (int)Math.round(Math.random() * 6);
            int y = (int)Math.round(Math.random() * 6);

            if(list.get(x).getGiven() == 0 && list.get(y).getTaken() == 0 && x != y){System.out.println(list.get(x).getName() + " is " +list.get(y).getName()+  "'s Secret Santa!"); complete++; list.get(x).setGiven(1); list.get(y).setTaken(1);}


        }
    }



}
