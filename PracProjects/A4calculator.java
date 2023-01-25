package PracProjects;

import java.util.Scanner;

public class A4calculator {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("Number 1:");
            double num1 = s.nextDouble();
            System.out.println("|   +   |   -   |   *   |   /   |");
            char operationType = s.next().charAt(0);
            System.out.println("Number 2:");
            double num2 = s.nextDouble();
            double result = 0.0;

            switch(operationType) {

                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println(result);
                    break;

             default:
             System.out.println("INVALID OPERATOR");
             break;
                }

s.close();

}

    
}
