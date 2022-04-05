package Day_31_Constructor;

public class Triangle {

    public int base;
    public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int calcPerimeter(){
        return base * 3;
    }
    public int calcArea(){
        return (base * height)/2;
    }

    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
