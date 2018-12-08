public class Vertex {

    private String color;
    private int dist;
    private Vertex pi;
    private char cell;

    public Vertex(String color, int dist, Vertex pi, char cell) {
        this.color = color;
        this.dist = dist;
        this.pi = pi;
        this.cell = cell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public Vertex getPi() {
        return pi;
    }

    public void setPi(Vertex pi) {
        this.pi = pi;
    }

    public char getCell() {
        return cell;
    }

    public void setCell(char cell) {
        this.cell = cell;
    }
}
