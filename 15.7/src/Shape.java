public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing Rectangle at (" + x + ", " + y + ") with " + width + " and height " + height);
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing Triangle at (" + x + ", " + y + ") with base " + base + " and height " + height);
    }
}

