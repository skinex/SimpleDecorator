package Logic;

/**
 * Created by User on 25.03.2018.
 */
public class PositionDecorator extends Decorator {
    @Override
    public void addValueOperation(int value) {
        Position currentPosition = new Position(value);
        super.addValueOperation(value);
        System.out.println("The position of object " +currentPosition);
    }

    @Override
    public void setValueOperation(int value) {
        Position currentPosition = new Position(value);
        super.setValueOperation(value);
        System.out.println("The position of object " +currentPosition);
    }
}
