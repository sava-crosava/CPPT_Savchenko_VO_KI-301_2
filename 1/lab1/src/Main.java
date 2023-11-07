import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        int SIZE;
        String filler;
        Scanner in = new Scanner(System.in);
        PrintStream fout = null;

        try {
            fout = new PrintStream("Result.txt");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Введіть розмір матриці: ");
        SIZE = in.nextInt();
        in.nextLine();

        while (SIZE < 12) {
            System.out.println("Ви ввели надто малий розмір матриці. Спробуйте ще раз");
            SIZE = in.nextInt();
        }

        System.out.print("Введіть символ-заповнювач: ");
        filler = in.next();

        while (filler.length() != 1) {
            if(filler.length() > 1) {
                System.out.println("Можна вводити тільки один символ заповнювача. Спробуйте ще раз");
            }
            filler = in.next();
        }

        char[][] arr = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = ' ';
            }
        }

        for (int i = 0; i < SIZE / 2; i++) {
            for (int j = 0; j < SIZE / 2 - i; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
                arr[i][SIZE - j - 1] = (char) filler.codePointAt(0);

            }
        }
        int t = 1;
        for (int i = SIZE / 2; i < SIZE; i++) {
            for (int j = 0; j < t; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
                arr[i][SIZE - j - 1] = (char) filler.codePointAt(0);

            }
            t++;
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }
            System.out.println();
            fout.println();

        }
    }
}
