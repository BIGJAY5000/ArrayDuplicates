import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int j = 0; j < array.length; j++) {
            int current = array[j];
            count = 0;
            for (int i = 0; i < array.length; i++) {
                if (current == array[i]) {
                    count++;
                }
            }
            insert(array, current);
            if (count > 1 && current != 0) {
                System.out.println(current + " occurs " + count + " times in the array");
            }
        }
    }
    public static int [] insert (int [] arr, int element) {
        int [] nums = arr;
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] == element) {
                arr[i] = 0;
            }
        }
        return nums;
    }

}