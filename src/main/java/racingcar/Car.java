package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int random){
        if(random >= 4){
            position++;
        }
    }

    public Car compare(Car other){
        if(this.position > other.position){
            return this;
        }
        return other;
    }
}
