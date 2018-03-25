package Logic;

/**
 * Created by User on 25.03.2018.
 */
public abstract class Decorator implements Component {
    public Component component;

    protected Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public void addValueOperation(int value) {
        if (component != null) {
            component.addValueOperation(value);
        }
    }

    public void setValueOperation(int value) {
        if (component != null) {
            component.setValueOperation(value);
        }
    }
}
