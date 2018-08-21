public class InformationLoss
{
    private static int narrowingConversion()
    {
        // Compound assignment statements (for example 'intvar += longvar') that implicitly cast a value of
        // a wider type to a narrower type may result in information loss and numeric errors such as overflows.
        // References:
        // Rule: https://lgtm.com/rules/1780084/

        int x = 100;
        long y = 200;
        return x *= y;
    }
}