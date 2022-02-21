import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculation();
    }
    public static void calculation () {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Введите ваш вес в килограммах: ");
        float weight = inputNumber.nextFloat();
        System.out.println("Введите ваш рост в метрах до сотых: ");
        float growth = inputNumber.nextFloat();
        float result = weight / (growth * growth);
        System.out.println("Ваш индекс массы тела равен " + result);

        if (result <= 16) {
            System.out.println("Выраженный дефицит массы тела! Обратитесь к врачу!");
        }
        else if (result > 16 && result <= 18.5 ) {
            System.out.println("Недостаточная масса");
        }
        else if (result > 18.5 && result <= 24.5 ) {
            System.out.println("Норма");
        }
        else if (result > 25 && result <= 30 ) {
            System.out.println("Избыточная масса тела");
        }
        else if (result > 30 && result <= 35 ) {
            System.out.println("Ожирение первой степени");
        }
        else if (result > 35 && result <= 40 ) {
            System.out.println("Ожирение второй степени");
        }
        else if (result > 40) {
            System.out.println("Ожирение третьей степени. Обратитесь к врачу!");
        }
    }
}
