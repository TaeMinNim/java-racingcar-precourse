package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public CarList carInfo(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String nameString = Console.readLine();
        List<String> nameList = toName(nameString);

        List<Car> carList = new ArrayList<>();
        for(String name: nameList){
            carList.add(new Car(name));
        }
        return new CarList(carList);
    }

    private List<String> toName(String nameString){
        String[] strings;
        strings = nameString.split("/");
        return Arrays.asList(strings);
    }
}
