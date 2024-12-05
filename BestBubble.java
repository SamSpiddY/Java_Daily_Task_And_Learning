import java.util.Scanner;

public class BestBubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int elements = input.nextInt();
        int[] array =new int[elements];

        for(int i = 0; i < elements; i++) {
            array[i] = input.nextInt();

        }
        int swapsAscending = bubbleSortSwapsAscending(array);
        int swapsDescending = bubbleSortSwapsDescending(array);

        System.out.println(Math.min(swapsAscending, swapsDescending));
    }

        //ascending order
        public static int bubbleSortSwapsAscending(int[] arr) {
            int n = arr.length;
            int swapCount = 0;
            int[] tempArr = arr.clone();

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (tempArr[j] > tempArr[j + 1]) {
                        int temp = tempArr[j];
                        tempArr[j] = tempArr[j + 1];
                        tempArr[j + 1] = temp;
                        swapCount++; // Increment
                    }
                }
            }
            return swapCount;
        }

        //descending order
        public static int bubbleSortSwapsDescending(int[] arr) {
            int n = arr.length;
            int swapCount = 0;
            int[] tempArr = arr.clone();

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (tempArr[j] < tempArr[j + 1]) {
                        int temp = tempArr[j];
                        tempArr[j] = tempArr[j + 1];
                        tempArr[j + 1] = temp;
                        swapCount++;
                    }
                }
            }
            return swapCount;
        }

    }