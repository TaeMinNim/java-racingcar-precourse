package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        validData(name);
        this.name = name;
    }

    private void validData(String name){
        if(name.length() > 5){
            throw new IllegalArgumentException("자동차 이름이 5자를 초과합니다.");
        }
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

    public boolean equal(Car other){
        return this.position == other.position;
    }
}
