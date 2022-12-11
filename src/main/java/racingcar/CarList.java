package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private final List<Car> carList;
    private final RandomGenerator randomGenerator = new RandomGenerator();

    public CarList(List<Car> carList){
        this.carList = carList;
    }

    public void tryMoveAll(){
        for(int i =0; i < carList.size(); i++){
            Car car = carList.get(i);
            int random = randomGenerator.createRandom();
            car.move(random);
        }
    }

    public List<Car> getCarList(){
        return carList;
    }

    public List<Car> winner(){
        Car winner = carList.get(0);
        for(Car car: carList){
            winner = winner.compare(car);
        }

        List<Car> winners = new ArrayList<>();
        for(Car car: carList){
            if(winner.equal(car)){
                winners.add(car);
            }
        }

        return carList;
    }
}
