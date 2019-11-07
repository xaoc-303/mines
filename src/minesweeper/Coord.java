package minesweeper;

public class Coord {
    public int x;
    public int y;

    public Coord(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coord) {
            Coord to = (Coord) obj;
            return to.x == x && to.y == y;
        }

        return super.equals(obj);
    }
}
