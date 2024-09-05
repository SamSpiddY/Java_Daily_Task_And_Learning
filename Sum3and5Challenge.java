public class Sum3and5Challenge {
    public static void main(String[] args) {

        int count = 0;
        int sumOfTheNumber = 0;

        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                count++;
                sumOfTheNumber += i;
                if (count == 5){
                    break;
                }

            }

        }

        System.out.println("Sum of The Number is " + sumOfTheNumber);

    }
}
