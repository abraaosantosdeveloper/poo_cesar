import cesarschool.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Circle c = new Circle();

        System.out.println("Digite o raio da circunferência: ");
        double radius = scanner.nextDouble();
        c.setRadius(radius);
        scanner.close();

        System.out.println("Dados da circunferência: \n");
        System.out.println("Raio: " + radius);
        System.out.println("Área: " + c.getArea());
        System.out.println("Comprimento: " + c.getLength());
        System.out.println("Adeus!");

    }

}
