import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int i = 0;
        while (i < numbers.length) { /* buvo for, bet intellij pasiūlė keisti į while. Kažkas panašaus į for, tik veiksmai išmėtyti į tris eilutes */
            System.out.println("Įvesk skaičių: ");
            numbers[i] = input.nextInt();
            i++;
        }

        input.close();

        String masyvas = Arrays.toString(numbers);

        System.out.println("Nerūšiuotas masyvas: " + masyvas);
        System.out.println("Bubble sort išrūšiuotas: "); //ne geriausias sprendimas, bet tiek to

        int numbersLenght = numbers.length;
        bubbleSort(numbers, numbersLenght);
        for (int arrNumber : numbers) { // vietoje įprasto for intellij pasiūlė kažkokį paprastesnį for
            System.out.print(arrNumber + ", ");
        }
    }

    public static void bubbleSort(int[] sort_arr, int numbersLenght) {

        for (int i = 0; i < numbersLenght - 1; ++i) {

            for (int j = 0; j < numbersLenght - i - 1; ++j) {

                if (sort_arr[j + 1] < sort_arr[j]) {

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j + 1];
                    sort_arr[j + 1] = swap;

                }
            }
        }
    }
}