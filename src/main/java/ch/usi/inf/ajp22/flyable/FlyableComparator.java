package ch.usi.inf.ajp22.flyable;

import java.util.Comparator;

/**
 * 3 Points
 * TODO: Write a Comparator named FlyableComparator.
 *       Comparison should be done using the speed of types that implement the Flyable interface.
 */
public class FlyableComparator implements Comparator<Flyable> {
    @Override
    public int compare(Flyable o1, Flyable o2) {
        return o1.getSpeed() - o2.getSpeed();
    }
}