package racingcar;

import java.util.List;

public class CarList {
    private final List<Car> carList;
    private final RandomGenerator randomGenerator = new RandomGenerator();

    public CarList(List<Car> carList){
        this.carList = carList;
    }

    public void tryMoveAll(int count){
        for(int i =0; i < count; i++){
            Car car = carList.get(i);
            int random = randomGenerator.createRandom();
            car.move(random);
        }
    }
}
