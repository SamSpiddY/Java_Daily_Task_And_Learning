public class SwitchChallenege {
    public static void main(String[] args) {
        char NATO = 'E';
//Old type switch case
        switch (NATO){
            case 'A':
                System.out.println(NATO + " = Able");
                break;
            case 'B':
                System.out.println(NATO + " = Baker");
                break;
            case 'C':
                System.out.println(NATO + " = Charlie");
                break;
            case 'D':
                System.out.println(NATO + " = Dog");
                break;
            case 'E':
                System.out.println(NATO + " = Easy");
                break;
            default:
                System.out.println(NATO + " is Not Found");
                break;
        }
    }
}
