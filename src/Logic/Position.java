package Logic;

/**
 * Created by User on 25.03.2018.
 */
public class Position {
    public int x;
    public int y;

    public Position() {
        this(10,10);
    }

    public Position (int value) {
        this(value,value);
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position ourPosition) {
        this(ourPosition.x, ourPosition.y);
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", x, y);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Position ? x == ((Position) obj).x && y == ((Position) obj).y : false;
    }
}
