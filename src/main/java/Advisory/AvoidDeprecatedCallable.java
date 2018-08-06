public class AvoidDeprecatedCallable
{
    @Deprecated
    public void theOldWayOfDoingThings()
    {
        // ...
    }

    public void dowork()
    {
        theOldWayOfDoingThings();
        // ...
    }
}