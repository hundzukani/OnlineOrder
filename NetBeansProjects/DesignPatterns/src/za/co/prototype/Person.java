package za.co.prototype;

/**
 *
 * @author hmanganyi
 */
public class Person implements Cloneable {

    private String name;
    private Car car;

    public Person(String name, String carName) {
        this.name = name;
        this.car = new Car(carName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    protected Object clone()  {
        
        Person person = new Person(name, car.getName());
        return person;
    }

}
