public class EqualityTestOnFP
{
    private static boolean isEqual()
    {
        // Comparing results of floating-point computations with '==' or '!=' is likely to yield surprising results 
        // References:
        // Rule: https://lgtm.com/rules/2165170566/

        boolean retval = ((0.1 + 0.2) == 0.3);
        return retval;
    }
}