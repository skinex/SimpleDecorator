package Logic;

/**
 * Created by User on 25.03.2018.
 */
public class TrackBar implements Component {
    public int value = 50;

    @Override
    public void addValueOperation(int value) {
        this.value += value;
        System.out.println(String.format("This is trackbar has value - %s", value));
    }

    @Override
    public void setValueOperation(int value) {
        this.value = value;
        System.out.println(String.format("This is trackbar has value - %s", value));
    }


}
