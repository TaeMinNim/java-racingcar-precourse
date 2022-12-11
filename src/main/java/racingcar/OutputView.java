package racingcar;

import java.util.List;

public class OutputView {
    public void printErrorMessage(Exception e){
        System.out.println("[ERROR] " + e.getMessage());
    }

    public void printMoveResult(List<Car> carList){
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
        System.out.println();
    }

    public void printWinner(List<Car> winners){
        System.out.print("최종 우승자 : ");
        if(winners.size() == 1){
            System.out.println(winners.get(0).getName());
            return;
        }
        for(int i = 0; i < winners.size(); i++){
            Car winner = winners.get(i);
            System.out.print(winner.getName());
            if(!(i < winners.size() - 1)){
                System.out.print(", ");
            }
        }
    }
}
