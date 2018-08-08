import java.util.Random;

public class BadAbsOfRandom
{
    private static void absOfRandom()
    {
        int seed = 17;
        Random rng = new Random(seed);
        int val = Math.abs(rng.nextInt());   // gotcha! this is not guaranteed to return a non-negative integer - contradicts programmer intent.
    }
}