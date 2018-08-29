import java.util.Random;

public class RandomUsedOnce
{
    public void twice()
    {
        // In the following example, generating a series of pseudo-random numbers, such as
        // rn1 and rn2, by creating a new instance of Random each time is unlikely to result
        // in a good distribution of pseudo-random numbers. In contrast, generating a series
        // of pseudo-random numbers, such as random1 and random2, by calling nextInt each time
        // is likely to result in a good distribution. This is because the numbers are based
        // on only one Random object.
        // References:
        // Rule doc: https://lgtm.com/rules/3960075/
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Arithmetic/RandomUsedOnce.ql

        // BAD
        Random r1 = new Random();
        int rn1 = r1.nextInt();
        Random r2 = new Random();
        int rn2 = r2.nextInt();

        // GODO
        Random r = new Random();
        int random1 = r.nextInt();
        int random2 = r.nextInt();
    }
}