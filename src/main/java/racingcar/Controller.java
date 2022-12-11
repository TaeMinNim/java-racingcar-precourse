package racingcar;

import java.util.List;

public class Controller {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    private CarList carList = null;
    private Integer count = null;

    public void createCarList() {
        while (carList == null) {
            try {
                carList = inputView.carInfo();
            } catch (IllegalArgumentException e) {
                outputView.printErrorMessage(e);
            }
        }
    }

    public void createCount(){
        while (count == null) {
            try {
                count = inputView.inputCount();
            } catch (IllegalArgumentException e) {
                outputView.printErrorMessage(e);
            }
        }
    }

    public void startRacing(){
        System.out.println("실행 결과");
        for(int i = 0; i < count; i++){
            carList.tryMoveAll();
            outputView.printMoveResult(carList.getCarList());
        }

        outputView.printWinner(carList.winner());
    }
}
