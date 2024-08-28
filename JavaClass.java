public class JavaClass {
    public static void main(String[] args) {
        System.out.println("Hello Sam"); //***********just the hello world programming********

        boolean isAlien = false; //********using of a if operator*******
        if ( isAlien == false) {
            System.out.println("The if condition is true");
        }

        int topScore = 99;
        int secoundtopScore = 81;
        if (topScore > secoundtopScore) { //*******using of a >, <, =, =>, =< operator******
            System.out.println("Top score 99 and its currect.(The if condition is true)");
        }
        if ((secoundtopScore < topScore) && (topScore <= 100)){ //*****using of a and (&&) operator******
            System.out.println("Top score and Second top score is correct( both condition must be true in and opration).");
        }
        if ((topScore > 100) || (topScore > secoundtopScore)){   //*****using of a and (||) operator******
            System.out.println("The is also correct.(In or(||) operator one of the statement must be correct.)");
        }


        Boolean isCar = false;
        if (isCar = true){
            System.out.println("This is Error! Program");     //Becouse of the = sign this line of code is error.(it will be correct if i use == sign here)
        }
        Boolean isCar2 = false;
        if (isCar2 == true){
            System.out.println("Now this line of program is right");  //this line of code is correct beocuse of the == sign
        }
        Boolean isCar3 = false;
        if (isCar3 !=true){
            System.out.println("this is also a right code becouse we use not= sign"); //we can use not equal to in 2 ways (!isCar3) and (isCar3 != true)
        }

                                 //*********Ternary Operator****************
        String makeOfBike = "Kawasaki Ninja" ;
        Boolean bikeMaker = (makeOfBike == "Kawasaki Ninja") ? false : true;
        if (bikeMaker){
            System.out.println("This a false statement, so this will not print");
        }
        String Bike = bikeMaker ? "This site true and this will not and it will not be the output" : "This site is false and this will be the output";
        System.out.println(Bike);
    }
}
