import java.awt.geom.QuadCurve2D;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        double media = (num1 + num2) / 2;

        System.out.println("A media é " + media);

        scanner.close();
    }
}