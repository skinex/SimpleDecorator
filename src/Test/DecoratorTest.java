package Test;

import Logic.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by User on 25.03.2018.
 */

public class DecoratorTest {
    public Component component;

    @Before
    public void Initialize() {
        component = new TrackBar();
    }

    @Test
    public void TestSize() {
        Decorator sizeDecorator = new SizeDecorator();
        sizeDecorator.component = component;
        sizeDecorator.addValueOperation(20);

        Assert.assertEquals(70, ((TrackBar)component).value);
    }

    @Test
    public void TestPosition() {
        Decorator positionDecorator = new PositionDecorator();
        positionDecorator.component = component;
        positionDecorator.setValueOperation(44);

        Assert.assertEquals(new Position(((TrackBar)component).value), new Position(44));
    }
}
