package ch.usi.inf.ajp22.flyable;

import java.util.Comparator;

/**
 * 3 Points
 * TODO: Create a Comparator, named PeopleComparator, for People and its subtypes.
 *       Comparison should be done first by age and then by name length.
 */
public class PeopleComparator<T extends People> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if (o1.getAge() == o2.getAge()) {
            return o1.getName().length() - o2.getName().length();
        }
        return o1.getAge() - o2.getAge();
    }
}