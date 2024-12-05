import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int numOfTestCase = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < numOfTestCase; i++){
            String inputNumber = sc.nextLine();
            dataTypeCheck sampad = new dataTypeCheck();
            sampad.whoCanFitTheNumber(inputNumber);
        }
    }
    public static class dataTypeCheck{
        public void whoCanFitTheNumber(String Number){
            try{
            long inputNumber = Long.parseLong(Number);
            if ((inputNumber <= Long.MAX_VALUE) && (inputNumber >= Long.MIN_VALUE)){
                System.out.println(inputNumber +" can be fitted in:");
                if ((inputNumber <=Byte.MAX_VALUE) && (inputNumber >= Byte.MIN_VALUE)) {
                    System.out.println("* Byte");
                }if ((inputNumber <= Short.MAX_VALUE) && (inputNumber >= Short.MIN_VALUE)) {
                    System.out.println("* short");
                }if ((inputNumber <= Integer.MAX_VALUE) && (inputNumber >= Integer.MIN_VALUE)) {
                    System.out.println("* int");
                }if ((inputNumber <= Long.MAX_VALUE) && (inputNumber >= Long.MIN_VALUE)) {
                    System.out.println("* long");
                }
            }
            }catch (NumberFormatException e){
                System.out.println(Number +" can't be fitted anywhere.");


            }
        }
    }
}