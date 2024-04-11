import java.util.Arrays;

public class Problems {
    /**
     * This method finds the minimum element in an array of integers.
     * It uses an iterative approach.
     * Time complexity: O(n), where n is the number of elements in the array.
     *
     * @param n     The number of elements in the array.
     * @param array The array of integers.
     * @return The minimum element in the array.
     */
    public static int findMin(int n, int[] array){
        if(n==0){
            System.out.println("Массив пуст(");
        }else{
            int min = array[0];
            for (int i=0; i<n; i++){
                if (array[i]<min){
                    min = array[i];
                }
            }
            return min;
        }
        return n;
    }

    /**
     * This method finds the average of elements in an array of integers.
     * It uses an iterative approach.
     * Time complexity: O(n), where n is the number of elements in the array.
     *
     * @param n     The number of elements in the array.
     * @param array The array of integers.
     * @return The average of elements in the array.
     */
    public static int findAVG(int n, int[] array){
        if(n==0){
            return 0;
        }
        else{
            int sum = 0;
            for (int i=0; i<n; i++){
                sum += array[i];
            }
            int avg = sum/n;
            return avg;
        }
    }

    /**
     * This method checks whether a number is prime or composite.
     * It uses an iterative approach to check divisibility up to the square root of the number.
     * Time complexity: O(sqrt(n)), where n is the input number.
     *
     * @param n The number to be checked.
     * @return "Prime" if the number is prime, "Composite" otherwise.
     */
    public static String checkPrime(int n){
        if (n <= 1){
            return "Composite";
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return "Composite";
            }
        }
        return "Prime";
    }

    /**
     * This method calculates the factorial of a given number.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all numbers from n to 1,
     * resulting in linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    /**
     * This method finds the nth element in the Fibonacci sequence using recursion.
     * Fibonacci sequence: Fn = Fn-1 + Fn-2
     * Base cases: F0 = 0, F1 = 1
     * Time complexity: O(2^n), where n is the input number.
     *
     * @param n The index of the element to be found in the Fibonacci sequence.
     * @return The nth element in the Fibonacci sequence.
     */
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    /**
     * This method calculates the power of x raised to the yth degree using recursion.
     * Base case: If y is 0, return 1.
     * Time complexity: O(y), where y is the power.
     *
     * @param x The base number.
     * @param y The exponent.
     * @return The result of x raised to the yth power.
     */
    public static int findDegree(int x, int y){
        if(y==0){
            return 1;
        }
        else{
            return x * findDegree(x, y-1);
        }
    }

    /**
     * This method reverses the order of elements in an array recursively.
     * Time complexity: O(n/2), where n is the number of elements in the array.
     *
     * @param n     The number of elements in the array.
     * @param m     The starting index for reversing.
     * @param array The array of integers.
     */
    public static void reverseOrder(int n, int m, int[] array){
        if(m>=n-1){
            return;
        }
        int temporary = array[m];
        array[m] = array[n-1];
        array[n-1] = temporary;
        reverseOrder(n-1, m+1, array);
    }

    /**
     * This method checks whether a string consists only of digits recursively.
     * It uses a recursive approach to iterate through the characters of the string.
     * Time complexity: O(n), where n is the length of the string.
     *
     * @param string The input string.
     * @param index  The current index being checked.
     * @return "Yes" if the string consists only of digits, "No" otherwise.
     */
    public static String onlyDigits(String string, int index){
        if (index==string.length()){
            return "Yes";
        }
        char checking = string.charAt(index);
        if(Character.isDigit(checking)){
            return onlyDigits(string, index+1);
        }else{
            return "No";
        }
    }

    /**
     * This method calculates the binomial coefficient C(n, k) recursively.
     * It uses a recursive approach to compute combinations.
     * The recursive formula used is C(n, k) = C(n-1, k-1) + C(n-1, k) with base cases C(n, 0) = C(n, n) = 1.
     * Time complexity: O(2^n), where n is the input number.
     *
     * @param n The total number of elements.
     * @param k The number of elements to be selected.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoef(int n, int k){
        if(k==0 || k==n){
            return 1;
        }
        return binomialCoef(n-1, k-1) + binomialCoef(n-1, k);
    }
    public static boolean polyndrome(String str){
        if(str.length()<=1){
            return true;
        }
        System.out.println(str.length());
        char[] arr = new char[str.length()];
        arr = str.toCharArray();

        if (arr[0] != arr[str.length()-1]){
            return false;
        }

        char[] newArr = new char[str.length()-2];
        for (int i=1; i<str.length()-1; i++){
            newArr[i-1] = arr[i];
        }


        String newStr = Arrays.toString(newArr);

        return polyndrome(newStr);
    }
    /**
     * This method calculates the greatest common divisor (GCD) of two numbers using recursion.
     * It uses the Euclidean algorithm to find the GCD.
     * The algorithm repeatedly applies the property gcd(a, b) = gcd(b, a % b) until b becomes 0.
     * This approach efficiently reduces the problem size by finding the remainder of a divided by b.
     * Time complexity: O(log(min(a, b))), where a and b are the input numbers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of the two numbers.
     */
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
