public class InformationLoss
{
    private static int narrowingConversion()
    {
        int x = 100;
        long y = 200;
        return x *= y;
    }
}