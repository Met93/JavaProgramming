package src.Day39_EncapsulationAndInheritancePractice.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square=new Square(10);
        System.out.println(square);
        square.setSide(15);
        System.out.println(square);
        square.area();
        System.out.println(square);
        Rectangle rectangle=new Rectangle(15.5,21);
        System.out.println(rectangle);
        rectangle.setLength(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        System.out.println("----------------------------");
        Circle circle=new Circle(2.5);
        System.out.println(circle);
        circle.setRadius(5.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());

    }
}
