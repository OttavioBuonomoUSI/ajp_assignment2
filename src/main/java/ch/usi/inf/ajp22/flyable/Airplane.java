package ch.usi.inf.ajp22.flyable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 3 Points
 * TODO: Improve the class below by parametrizing it (i.e. using generics).
 *       passengers can be of type People or any other subtype of People.
 * 3 Points
 * TODO: Create the following method:
 *       1) moveToPassengers
 *          Input: a List of People called "dst".
 *          This method must copy all the passengers of the current plane to the "dst" List.
 *          After the copy, the List of passenger of the current plane must be cleared.
 *
 *          Remember to use the get-put principle properly.
 */
public class Airplane<T extends People> implements Flyable{

    private final List<T> passengers;

    @Override
    public int getSpeed() {
        return 740;
    }


    @Override
    public void fly() {
        System.out.println("Check the engines and fly");
    }

    public Airplane() {
        this.passengers = new ArrayList<>();
    }

    public void setPassengers(List<? extends T> list) {
        passengers.addAll(list);
    }

    public List<? extends T> getPassengers() {
        return this.passengers;
    }

    public void moveToPassengers(List<? super People> dst) {
        dst.addAll(passengers);
        passengers.clear();
    }

}
