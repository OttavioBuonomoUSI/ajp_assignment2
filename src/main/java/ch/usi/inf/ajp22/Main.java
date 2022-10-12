package ch.usi.inf.ajp22;

import ch.usi.inf.ajp22.flyable.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 3 Points
     * TODO: Create a public static void function called "callFlyMethods".
     *       input: a List of objects that implement the Flyable interface.
     *       This function calls the method "fly" of every object inside the list.
     */

    /**
     * 3 Points
     * TODO: Create a public static void function called "transformPeople".
     *       input: a List from which People are read, called "src";
     *              a List in which People are inserted, called "dst".
     *       This function iterates over all the elements of "src" and copies them in the "dst" List.
     *       If the element in "src" starts with the "z" or "Z" character then in the "dst" list is
     *       added a Wizard instead of a person. The Wizard's age must be 100 times the person's age.
     *
     *       Remember to use the get-put principle properly.
     */

    /**
     * You can use the main function to help check that you are on the right path for your solution.
     * You don't have to change it yourself.
     */
    public static void main(String[] args) {
        Wizard circe = new Wizard("Circe", 300);
        Wizard merlin = new Wizard("Merlin", 430);
        Airplane<People> firstAirplane = new Airplane<>();
        Airplane<People> secondAirplane = new Airplane<>();
        People joe = new People("Joe", 20);
        People eva = new People("Eva", 18);
        People bill = new People("Bill", 20);
        People fiona = new People("Fiona", 18);
        People zeke = new People("Zeke", 18);


        List<Flyable> flyableList = new ArrayList<>();
        flyableList.add(circe);
        flyableList.add(merlin);
        flyableList.add(firstAirplane);
        callFlyMethod(flyableList);

        List<People> firstPeopleList = new ArrayList<>();
        firstPeopleList.add(joe);
        firstPeopleList.add(eva);

        List<People> secondPeopleList = new ArrayList<>();
        secondPeopleList.add(bill);
        secondPeopleList.add(fiona);
        secondPeopleList.add(zeke);

        firstAirplane.setPassengers(firstPeopleList);

        /*
         * Example usage of the transformPeople function
         */
        transformPeople(secondPeopleList, firstPeopleList);

        /*
         * Example of PeopleComparator usage
         */
        PeopleComparator<People> peopleComparator = new PeopleComparator<>();
        int res = peopleComparator.compare(bill, circe);
        if(res > 0) {
            System.out.printf("%s is greeter than %s\n", bill.getName(), circe.getName());
        } else if (res == 0) {
            System.out.printf("%s is equal to %s\n", bill.getName(), circe.getName());
        } else {
            System.out.printf("%s is less than %s\n", bill.getName(), circe.getName());
        }

        int res2 = peopleComparator.compare(merlin, circe);
        if(res2 > 0) {
            System.out.printf("%s is greeter than %s\n", merlin.getName(), circe.getName());
        } else if (res2 == 0) {
            System.out.printf("%s is equal to %s\n", merlin.getName(), circe.getName());
        } else {
            System.out.printf("%s is less than %s\n", merlin.getName(), circe.getName());
        }

        Couple<People, Airplane<People>> couple1 = new Couple<>(bill, firstAirplane);
        System.out.println(couple1);

        Couple<Wizard, Wizard> wizardCouple = new Couple<>(circe, circe);
        System.out.print(wizardCouple);

        circe.setSpeed(1000);
        merlin.setSpeed(200);

        /*
         * Example of comparing two Wizards
         */
        if ( circe.compareTo(merlin) > 0) {
            System.out.println("Circe is faster than Merlin");
        } else if ( circe.compareTo(merlin) < 0) {
            System.out.println("Circe is slower than Merlin");
        } else {
            System.out.println("Circe has the same speed as Merlin");
        }

        firstAirplane.moveToPassengers(secondAirplane.getPassengers());

    }

    /**
     *
     * Create a public static void function called "transformPeople".
     *       input: a List from which People are read, called "src";
     *              a List in which People are inserted, called "dst".
     *       This function iterates over all the elements of "src" and copies them in the "dst" List.
     *       If the element in "src" starts with the "z" or "Z" character then in the "dst" list is
     *       added a Wizard instead of a person. The Wizard's age must be 100 times the person's age.
     *
     *       Remember to use the get-put principle properly.
     */
    private static void transformPeople(List<? extends People> src, List<? super People> dst) {
        for (People p : src) {
            if (p.getName().startsWith("z") || p.getName().startsWith("Z")) {
                Wizard w = new Wizard(p.getName(), p.getAge() * 100);
                dst.add(w);
            } else {
                dst.add(p);
            }
        }
    }

    // input: a List of objects that implement the Flyable interface.
    // This function calls the method "fly" of every object inside the list.
    public static void callFlyMethod(List<Flyable> flyableList) {
        for (Flyable flyable : flyableList) {
            flyable.fly();
        }
    }
}
