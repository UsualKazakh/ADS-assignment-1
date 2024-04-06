public class Problems {
    /**
     *
     *
     * @param n The total number of digits
     * @param array An array containing all numbers
     * @return The minimum of the giving numbers
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

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int findDegree(int x, int y){
        if(y==0){
            return 1;
        }
        else{
            return x * findDegree(x, y-1);
        }
    }

    public static void reverseOrder(int n, int m, int[] array){
        if(m>=n-1){
            return;
        }
        int temporary = array[m];
        array[m] = array[n-1];
        array[n-1] = temporary;
        reverseOrder(n-1, m+1, array);
    }

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

    public static
}
