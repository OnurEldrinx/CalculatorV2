import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*

        1- Addition
        2- Subtraction
        3- Multiplication
        4- Division
        5- Exponentiation
        6- Factorial
        7- Mod
        8- Rectangle Area & Perimeter

        */



        Scanner scanner = new Scanner(System.in);

        String menu = """
                1 - Addition
                2 - Subtraction
                3 - Multiplication
                4 - Division
                5 - Exponentiation
                6 - Factorial
                7 - Mod
                8 - Rectangle Area & Perimeter 
                0 - Exit
                """.indent(1);


        while (true){

            int choice;

            System.out.println("--------------------------------");
            System.out.print(menu);
            System.out.println("--------------------------------");

            System.out.print("\nYour Choice : ");
            choice = scanner.nextInt();

            if (choice == 0){

                System.out.println("!!! Goodbye !!!");
                break;
            }

            switch (choice){

                case 1:
                    sum();
                    break;

                case 2:
                    subtract();
                    break;

                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    exponentiate();
                    break;
                case 6:
                    factorial();
                    break;

                case 7:
                    mod();
                    break;

                case 8:
                    rectangle();
                    break;

                default:
                    System.out.println("Wrong Input");
                    break;

            }


        }

    }

    static void sum(){

        Scanner scanner = new Scanner(System.in);

        int number,result=0,i=1;

        while (true){

            System.out.println("Press 0 to complete the operation.");
            System.out.print(i + ".Number : ");
            number = scanner.nextInt();
            result = result + number;
            i++;

            if (number == 0){

                System.out.println("Result : " + result);
                break;

            }

        }

    }

    static void subtract(){

        Scanner scanner = new Scanner(System.in);

        int number,result=0,i=1;

        while (true){

            System.out.println("Press 0 to complete the operation.");
            System.out.print(i + ".Number : ");
            number = scanner.nextInt();
            if (i==1){

                result = number;

            }else{

                result = result - number;

            }
            i++;

            if (number == 0){

                System.out.println("Result : " + result);
                break;

            }

        }

    }

    static void multiply(){

        Scanner scanner = new Scanner(System.in);

        int number,result=1,i=1;

        while (true){

            System.out.println("Press 1 to complete the operation.");
            System.out.print(i + ".Number : ");
            number = scanner.nextInt();
            result = result * number;
            i++;

            if (number == 1){

                System.out.println("Result : " + result);
                break;

            }

        }

    }

    static void divide(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter : ");
        int counter = scanner.nextInt();
        double number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".Number :");
            number = scanner.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("You can't enter 0 as divider.");
                continue;
            }

            if (i == 1) {
                result = number;
                continue;
            }

            result = result / number;

        }

        System.out.println("Result : " + result);

    }

    static void exponentiate(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base value :");
        int base = scan.nextInt();

        System.out.print("Enter the exponent value :");
        int exponent = scan.nextInt();

        double result = Math.pow(base,exponent);

        System.out.println(base + "^" + exponent + " = " + result);

    }

    static void factorial(){

        Scanner scan = new Scanner(System.in);

        int number,result=1;

        System.out.print("Enter a number : ");
        number = scan.nextInt();

        for (int i=1;i<=number;i++){

            result = result * i;

        }

        System.out.println(number + "! = "+result);

    }

    static void mod(){

        Scanner scan = new Scanner(System.in);

        int x,y,result;

        System.out.println("Pattern --> X % Y = Result\n");

        System.out.print("Enter X : ");
        x = scan.nextInt();

        System.out.print("Enter Y : ");
        y = scan.nextInt();

        result = x%y;

        System.out.println(x+" % "+y+" = "+result);


    }

    static void rectangle(){

        Scanner scan = new Scanner(System.in);

        int longSide,shortSide,area,perimeter;

        System.out.print("Enter the long side : ");
        longSide = scan.nextInt();

        System.out.print("Enter the short side : ");
        shortSide = scan.nextInt();

        area = longSide*shortSide;
        perimeter = 2*(longSide+shortSide);

        System.out.println();

        for (int i=0;i<longSide;i++){

            for (int j=0;j<shortSide;j++){


                System.out.print("* ");


            }

            System.out.println();

        }

        System.out.println("\nLong Side  : " + longSide);
        System.out.println("Short Side : " + shortSide);
        System.out.println("Area       : " + area);
        System.out.println("Perimeter  : " + perimeter);

    }


}

