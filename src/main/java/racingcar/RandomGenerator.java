package racingcar;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {
    private final static int MIN = 0;
    private final static int MAX = 9;

    public int createRandom(){
        return Randoms.pickNumberInRange(MIN, MAX);
    }
}
