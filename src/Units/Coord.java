package Units;

public class Coord {
    public int x, y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getDistance(Coord coord) {
        float dx = coord.x - this.x;
        float dy = coord.y - this.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

}
