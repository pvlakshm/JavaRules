public class IntMultToLong
{
    private void overflow()
    {
        int i = 2000000000;
        long j = i * i;     // will cause an overflow.
                            // to avoid overflow, use: i * (long) i
    }
}