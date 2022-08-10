import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand = getInt();
        char operation = getOperation();
        int operand2 = getInt();
        int result = getCalculator(operand, operand2, operation);
        System.out.println("Результат:" + result);
        System.out.println("Завершение.");
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int operand1 = scanner.nextInt();
        return operand1;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int getCalculator(int operand, int operand2, char operation) {
        int res;
        switch (operation) {
            case '+':
                res = operand + operand2;
                break;
            case '-':
                res = operand - operand2;
                break;
            case '*':
                res = operand * operand2;
                break;
            case '/':
                res = operand / operand2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод:");
                res = getCalculator(operand, operand2, getOperation());
        }
        return res;
    }
}
