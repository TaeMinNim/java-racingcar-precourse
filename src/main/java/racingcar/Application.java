package racingcar;

public class Application {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createCarList();
        controller.createCount();
        controller.startRacing();
    }
}
