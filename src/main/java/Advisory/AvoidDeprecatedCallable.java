public class AvoidDeprecatedCallable
{
    @Deprecated
    public void theOldWayOfDoingThings()
    {
        // ...
    }

    public void doWork()
    {
        theOldWayOfDoingThings();
        // ...
    }
}