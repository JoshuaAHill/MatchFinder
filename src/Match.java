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

        Person josh = new Person("Josh");
        Person ethan = new Person("Ethan");
        Person abs = new Person("Abs");
        Person chloe = new Person("Chloe");
        Person ellie = new Person("Ellie");
        Person james = new Person("James");
        Person hannah = new Person("Hannah");

        list.add(josh);list.add(ethan);list.add(abs);list.add(chloe);list.add(ellie);list.add(james);list.add(hannah);

        int complete = 0;
        while(complete < 6) {
            int x = (int)Math.round(Math.random() * 6);
            int y = (int)Math.round(Math.random() * 6);

            if(list.get(x).getGiven() == 0 && list.get(y).getTaken() == 0 && x != y){System.out.println(list.get(x).getName() + " is " +list.get(y).getName()+  "'s Secret Santa!"); complete++; list.get(x).setGiven(1); list.get(y).setTaken(1);}


        }
    }



}
