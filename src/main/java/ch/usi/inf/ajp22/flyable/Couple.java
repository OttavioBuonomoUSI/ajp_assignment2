package ch.usi.inf.ajp22.flyable;

/**
 * 3 Points
 * TODO: Improve the class below by parametrizing it (i.e. using generics).
 *       passengers can be of type People or any other subtypes of People.
 *       flyable can be any type that implements the Flyable interface.
 *       This may lead in changing the  type of the fields passenger and flyable.
 */
public class Couple {

    private final Object passenger;
    private final Object flyable;

    public Couple(Object passenger, Object flyable) {
        this.passenger = passenger;
        this.flyable = flyable;
    }

    @Override
    public String toString() {
        return String.format("Passenger :%s On :%s", ((People)this.passenger).getName(),
                this.flyable.getClass().getSimpleName());
    }
}
