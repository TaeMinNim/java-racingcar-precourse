package racingcar;

public class Count {
    private int count;

    public Count(int count){
        validData(count);
        this.count = count;
    }

    public void validData(int count){
        if(count < 1){
            throw new IllegalArgumentException("자연수만 입력이 가능합니다.");
        }
    }

    public int getCount(){
        return count;
    }
}
