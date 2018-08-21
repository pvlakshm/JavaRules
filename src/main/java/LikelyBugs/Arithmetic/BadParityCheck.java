public class BadParityCheck
{
    private static boolean isOdd(int x)
    {
        // Using "x % 2 == 1" to check whether x is odd does not work for negative numbers.
        // References:
        // Rule doc: https://lgtm.com/rules/2158300732/
        // QL query: 

        return x % 2 == 1;
    }
}