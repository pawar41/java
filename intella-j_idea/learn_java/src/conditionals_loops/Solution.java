package conditionals_loops;

public class Solution {

    public static void main(String[] args) {
        int i = subtractProductAndSum(1);
        System.out.println(i);
    }
    static int subtractProductAndSum(int n) {
        int leangthOfInt = 0, productOfInt = 1, sumOfInt = 0, diffrenceAnswer;

        int temp = 1;
        do {
            leangthOfInt++;
            temp *= 10;
        } while (temp < n);

        temp = n;
        int digit = 0;

        if (leangthOfInt < 2){
            //productOfInt = 0;
        }
        for (int i = 1; i <= leangthOfInt; i++) {
            digit = temp % 10;

            productOfInt *= digit;
            sumOfInt += digit;

            temp /= 10;
        }
        return productOfInt - sumOfInt;
    }
}
