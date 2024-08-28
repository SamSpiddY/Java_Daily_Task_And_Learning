public class Main {
    public static void main(String[] args) {

        boolean GameOver= true;
        int Score = 800;
        int CompleteLevel = 5;
        int Bonus = 100;

        if (Score < 5000 && Score > 1000){
            System.out.println("The Score was less than 5000 and greater then 1000");
        }else if (Score < 1000) {
            System.out.println("Your score was less then 1000");
        }else {
            System.out.println("Got here");
        }
// **************************************** This line was written for the Hacker rank coding ****************
//        Scanner sc = new Scanner (System.in);
//
//        int n = sc.nextInt();
//
//        if(n % 2 == 1){
//            System.out.println("Weird");
//        }
//        else if(n % 2 == 0 && n > 2 && n < 5){
//            System.out.println("Not Weird");
//        }else if(n % 2 == 0 && n > 6 && n < 20){
//            System.out.println("Weird");
//        }else {
//            System.out.println("Not Weird");
//        }

//        scanner();
//        printMegaBytesAndKiloBytes(2500);

    }
                                 /***********To give something input in java programming*************/
//    public static void scanner(){
//        Scanner sam = new Scanner(System.in);
//        String a = sam.next();
//        int b = sam.nextInt();
//        double c = sam.nextDouble();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//    }

    /********************Udemy Codding Practice************************/
//    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//        int megaBytes = (kiloBytes / 1024);
//        int remainingKB = (kiloBytes % 1024);
//
//        if (kiloBytes < 0){
//            System.out.println("Invalid Value");
//        }else{
//            System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + remainingKB + " KB");
//        }
//
//    }
    
}