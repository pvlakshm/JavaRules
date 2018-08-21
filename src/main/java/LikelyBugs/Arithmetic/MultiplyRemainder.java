public class MultiplyRemainder
{
    private static void operatorPrecendenceConfusion()
    {
        int d = 75000;          // durationInMillisecs
        int r = d % 60 * 1000;  // remainingDurationInMillisecs after 60 secs have elapsed
                                // Oops: it should have been parenthesized as d % (60 * 1000)
    }
}