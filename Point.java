final class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }

    void info() {
        System.out.println("x = " + x + ", y = " + y);
    }
}