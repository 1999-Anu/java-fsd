package practise.projects_1;

import java.util.*;
public class calculator {
    public static void main(String[] args) {
    	double num1;
    	double num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();
        System.out.print("Enter operation (Addition(+),Subtraction(-),Multiplication(*),Division(/): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double result;
        switch(operator)
        {
            case'+':
            	result=num1+num2;
                break;
            case'-':
            	result=num1-num2;
                break;
            case'*':
            	result=num1*num2;
                break;
            case'/':
            	result=num1/num2;
                break;
            default:
                System.out.printf("Enter correct operator");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+result);
    }
}
