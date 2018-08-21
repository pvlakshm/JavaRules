public class AvoidDeprecatedCallable
{

    @Deprecated
    public void theOldWayOfDoingThings()
    {
        // ...
    }

    public void doWork()
    {
        // Avoid calling a method or invoking a ctor marked deprecated.
        // References:
        // Rule: https://lgtm.com/rules/2052340541/

        theOldWayOfDoingThings();
        // ...
    }
}