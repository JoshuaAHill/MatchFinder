import java.util.ArrayList;

/**
 * Models a person with a name, and a status Integer to signal if they have 'given' to another Person, and 'taken'
 * from another Person"
 */
public class Person {

    private String name;
    private int taken;
    private int given;

    /**
     * Person Constructor
     * @param name  - Give the Person a name
     * @param list  - An ArrayList<Person> that the newly created Person should be added to.
     */
    public Person(String name, ArrayList<Person> list){
        this.name = name;
        list.add(this);
        taken = 0;
        given = 0;
    }

    /**
     * returns if the person has taken from another user. 1 = yes. 0 = no.
     * @return
     */
    public int getTaken() {
        return taken;
    }

    /**
     * returns the persons name (String)
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the persons taken value to an input value
     * @param taken - what value 'taken' should be set to. This should be 1 for yes and 0 for no
     */
    public void setTaken(int taken) {
        this.taken = taken;
    }

    /**
     * returns if the person has given to another user. 1 = yes. 0 = no.
     * @return
     */
    public int getGiven() {
        return given;
    }

    /**
     * Sets the persons given value to an input value
     * @param given - what value 'given' should be set to. This should be 1 for yes and 0 for no.
     */
    public void setGiven(int given) {
        this.given = given;
    }
}
