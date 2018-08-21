public class MultiplyRemainder
{
    private static void operatorPrecendenceConfusion()
    {
        // Using the remainder operator with the multiplication operator without adding parentheses to clarify
        // precedence may cause confusion.
        // References:
        // Rule: https://lgtm.com/rules/7860069/

        int d = 75000;          // durationInMillisecs
        int r = d % 60 * 1000;  // remainingDurationInMillisecs after 60 secs have elapsed
                                // Oops: it should have been parenthesized as d % (60 * 1000)
    }
}