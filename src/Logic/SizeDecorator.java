package Logic;

/**
 * Created by User on 25.03.2018.
 */
public class SizeDecorator extends Decorator {
    @Override
    public void addValueOperation(int value) {
        super.addValueOperation(value);
        System.out.println(String.format("The size of geometry obj = %s", value));
    }

    @Override
    public void setValueOperation(int value) {
        super.addValueOperation(value);
        System.out.println(String.format("The size of geometry obj = %s", value));
    }
}
