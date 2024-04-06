import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose the number from 1 to 10:");
        Scanner sc = new Scanner(System.in);
        int number_of_exercise = sc.nextInt();
        switch (number_of_exercise){
            case 1:
                System.out.println("Enter the total number of digits");
                int n1 = sc.nextInt();
                int[] array = new int[n1];
                for (int i=0; i<n1; i++){
                    System.out.println("Enter " + (i+1)  + " number");
                    array[i] = sc.nextInt();
                }
                int res1 = Problems.findMin(n1, array);
                System.out.println("The minimum number is: " + res1);
                break;
            case 2:
                System.out.println("Enter the total number of digits");
                int n2 = sc.nextInt();
                int[] arr = new int[n2];
                for (int i=0; i<n2; i++){
                    System.out.println("Enter " + (i+1)  + " number");
                    arr[i] = sc.nextInt();
                }
                int res2 = Problems.findAVG(n2, arr);
                System.out.println("The average number is " + res2);
                break;
            case 3:
                System.out.println("Enter the number to check if its Prime or not:");
                int n3 = sc.nextInt();
                String res3 = Problems.checkPrime(n3);
                System.out.println(res3);
                break;
            case 4:
                System.out.println("Enter the number to find its factorial:");
                int n4 = sc.nextInt();
                int res4 = Problems.factorial(n4);
                System.out.println("Factorial of " + n4 + " is: " +res4);
                break;
            case 5:
                System.out.println("Enter the number to find fibonacci:");
                int n5 = sc.nextInt();
                int res5 = Problems.fibonacci(n5);
                System.out.println("The fibonacci number of " + n5 + " is: " + res5);
                break;
            case 6:
                System.out.println("Enter the number:");
                int x = sc.nextInt();
                System.out.println("Enter its degree:");
                int y = sc.nextInt();
                int res6 = Problems.findDegree(x, y);
                System.out.println(x + " with degree " + y + " is equal to: " + res6);
                break;
            case 7:
                System.out.println("Enter the total number of digits:");
                int n7 = sc.nextInt();
                int m7 = 0;
                int[] array7 = new int[n7];
                for(int i=0; i<n7; i++){
                    System.out.println("Enter " + (i+1) + " number:");
                    array7[i] = sc.nextInt();
                }
                Problems.reverseOrder(n7, m7, array7);
                for(int i=0; i<n7; i++){
                    System.out.print(array7[i] + " ");
                }
                break;
            case 8:
                System.out.println("Enter some symbols to check is there only digits:");
                String s = sc.nextLine();
                String st = sc.nextLine();
                String res8 = Problems.onlyDigits(st, 0);
                System.out.println(res8);
                break;
            case 9:
                System.out.println("Enter n:");
                int n9 = sc.nextInt();
                System.out.println("Enter k:");
                int k9 = sc.nextInt();
                int res9 = Problems.binomialCoef(n9, k9);
                System.out.println("binomial coefficent equal to " + res9);
                break;
            case 10:
                System.out.println("Enter first number:");
                int a = sc.nextInt();
                System.out.println("Enter second number:");
                int b = sc.nextInt();
                int res10 = Problems.gcd(a, b);
                System.out.println("GCD of " + a + " and " + b + " is " + res10);
                break;
        }
    }
}

