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
}
