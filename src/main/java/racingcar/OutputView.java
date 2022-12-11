package racingcar;

import java.util.List;

public class OutputView {
    public void printErrorMessage(Exception e){
        System.out.println("[ERROR] " + e.getMessage());
    }

    public void printMoveResult(List<Car> carList){
        System.out.println("실행 결과");
        for(Car car: carList){
            printCar(car);
        }
        System.out.println();
    }

    private void printCar(Car car){
        System.out.print(car.getName() + " : ");
        for(int i = 0; i < car.getPosition(); i++){
            System.out.print("-");
        }
    }
}
