package ch.usi.inf.ajp22.flyable;

/**
 * 4 Points
 * TODO: Let the class implement Flyable and Comparable<Flyable>.
 *       The comparison should be done using the method getSpeed.
 */
public class Wizard extends People {

    private int speed;
    public Wizard(String name, int age) {
        super(name, age);
        this.speed = 100;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
