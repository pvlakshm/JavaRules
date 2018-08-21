public class IntMultToLong
{
    private void overflow()
    {
        // A multiplication result that is converted to a larger type can be a sign that the result can overflow the type converted from.
        // References:
        // Rule: https://lgtm.com/rules/2157860313/

        int i = 2000000000;
        long j = i * i;     // will cause an overflow.
                            // to avoid overflow, use: i * (long) i
    }
}