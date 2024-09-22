public class Main {
    public static void main(String[] args) {
        int SwitchValue = 3;

        switch (SwitchValue){
            case 1:
            System.out.println("The Switch Value is 1");
            break;
            case 2:
                System.out.println("The Switch value is 2");
                break;
            default:
                System.out.println("The Switch value is more then 1 and 2");
        }
//        switch (SwitchValue) {
//            case 1 -> System.out.println("The Switch Value is 1");
//            case 2 -> System.out.println("The Switch value is 2");
//            default -> System.out.println("The Switch value is more then 1 and 2");
//        }
    }
}