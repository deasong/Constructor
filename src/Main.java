

public class Main {
    public static void main(String[] args) {

        System.out.println("------------FIGURA------------------------------\n");
        Figure figure = new Figure(2, 2.5);

        System.out.println(figure);
        System.out.println("---------ROUND----------------------------------\n");
        Round round = new Round(3, 2.5, 3);
        System.out.println(round);
        System.out.println("-----------RECANGLE-----------------------------\n");
        Rectangle rectangle = new Rectangle(4, 4.5);
        System.out.println(rectangle);
        System.out.println("-----------TRIANGLE----------------------------\n");
        Triangle triangle = new Triangle(6, 4.5);
        System.out.println(triangle);

    }

}