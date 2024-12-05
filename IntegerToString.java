import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str = Integer.toString(number);

        if (number >= -100 && number <= 100){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
    }
}
