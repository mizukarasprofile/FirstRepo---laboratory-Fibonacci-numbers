import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int n;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
            System.out.println("Отримано кількість N чисел Фібоначі" + n);
        } else {
            System.out.print("Введіть бажану кількість чисел фібоначі");
            n = scanner.nextInt();
        }
        FibonaciNumber fib[] = new FibonaciNumber[n];
        FibonaciNumber first = new FibonaciNumber();
        FibonaciNumber second = new FibonaciNumber();
        first.setOrder(1);
        first.setValue(1);
        second.setOrder(2);
        second.setValue(1);
        fib[0] = first;
        fib[1] = second;
        for (int i = 2; i < n; i++) {
            long value = fib[i - 2].getValue() + fib[i - 1].getValue();
            fib[i] = new FibonaciNumber();
            fib[i].setOrder(i + 1);
            fib[i].setValue(value);
        }
            while (true) {
                System.out.println("Нажміть 1,щоб вивести всі числа фібоначі ");
                System.out.println("Нажміть 2,щоб вивести числа Фібоначі,які мають квадрати");
                System.out.println("Нажміть 0,для виходу програми");
                System.out.println("Ваш вибір:");
                choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                }
                switch (choice) {
                    case 1:
                        for (int i = 0; i < n; i++) {
                            System.out.println("Число фібоначі: " + fib[i].getValue());
                        }
                        break;
                    case 2:
                        for (int i = 0; i < n; i++) {
                            if (fib[i].isSquare()) {
                                System.out.println("Число фібоначі яке є квадратом певного числа: " + fib[i].getValue());
                            }
                        }
                        break;
                }
            }
        }
    }