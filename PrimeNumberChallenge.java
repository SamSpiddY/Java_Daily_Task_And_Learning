public class PrimeNumberChallenge {
    public static void main(String[] args) {
        System.out.println("This Number is" + ( isPrimeNumber(9973) ? "" : " not" ) + " a prime number.");
    }
//prime number check with method with paramitter
    public static boolean isPrimeNumber(int number){
        if (number <= 2){
            return (number == 2);
        }
        for (int i = 2; i < number ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
