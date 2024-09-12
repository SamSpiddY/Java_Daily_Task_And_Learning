public class PrimeNumberCounterVeriable {
    public static void main(String[] args) {
        finder(10);

    }
    //Method with paramitter
    public static void finder(int insidePrimeNumber){
        int count = 0;

        if(insidePrimeNumber <= 2 ){
            System.out.println("Number " +insidePrimeNumber+" a prime Number");
        }else if (insidePrimeNumber > 1000) {
            System.out.println("Please use a number between 1 to 1000");
        }{
            System.out.println("The prime number list are in below");
            for(int i = 2; i <= insidePrimeNumber; i++){
                if (i % 2 == 1){
                    System.out.println(i);
                    count++;
                    if (count == 3){
                        break;
                    }
                }
            }
        }// System.out.println("Total number of prime number is " +count);

    }
}
