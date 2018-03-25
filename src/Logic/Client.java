package Logic;

/**
 * Created by User on 25.03.2018.
 */
public class Client {
    public static void main(String[] args) {
        Component trackBar = new TrackBar();
        Decorator sizeDecorator = new SizeDecorator();
        Decorator positionDecorator = new PositionDecorator();

        sizeDecorator.component = trackBar;
        positionDecorator.component = trackBar;

        sizeDecorator.addValueOperation(10);
        positionDecorator.setValueOperation(50);

    }
}
