package ch.usi.inf.ajp22.flyable;

/**
 * 3 Points
 * TODO: Improve the class below by parametrizing it (i.e. using generics).
 *       passengers can be of type People or any other subtypes of People.
 *       flyable can be any type that implements the Flyable interface.
 *       This may lead in changing the  type of the fields passenger and flyable.
 */
public class Couple<T extends People, U extends Flyable> {

    private final T passenger;
    private final U flyable;

    public Couple(T passenger, U flyable) {
        this.passenger = passenger;
        this.flyable = flyable;
    }

    @Override
    public String toString() {
        return String.format("Passenger :%s On :%s", (this.passenger).getName(),
                this.flyable.getClass().getSimpleName());
    }
}
