public class SelfAssignment
{
    private int i;

    public void TestableInt(int i)
    {
        i = i;  // actually, the user meant this.i = i; so this is likely a typo.
    }
}