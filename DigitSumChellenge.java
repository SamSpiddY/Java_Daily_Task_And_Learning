public class DigitSumChellenge {
    public static void main(String [] args){

        System.out.println("The Sum of the given number is " + sumDigit(1111111));

    }

    public static int sumDigit(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;

        while (number > 9){
            sum += number % 10;
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
