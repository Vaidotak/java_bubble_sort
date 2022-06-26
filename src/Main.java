import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Įvesk skaičių: ");
            numbers[i] = input.nextInt();

        }
        String masyvas = Arrays.toString(numbers);
        System.out.println("Nerūšiuotas masyvas: " + masyvas);
        System.out.println("Bubble sort: "); //ne geriausias sprendimas, bet tiek to
        int len = numbers.length;
        bubbleSort(numbers,len);
        for(int i = 0; i<len; ++i){
            System.out.print(numbers[i] + ", ");
        }
    }

    public static void bubbleSort(int[] sort_arr, int len){

        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }
    }
}