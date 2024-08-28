public class UdamyClassTask {
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double addANDmult = (firstValue + secondValue) * 100.00d;
        double remainder = addANDmult % 40.00d  ;

        Boolean Remain = (remainder == 0) ? true : false;
        System.out.println("There is no remainder   = " + Remain);

        if (remainder != 0){
            System.out.println("Get some remainder = " + remainder);
        }

    }
}
