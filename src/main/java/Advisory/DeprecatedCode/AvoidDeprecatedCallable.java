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
        // Rule doc: https://lgtm.com/rules/2052340541/
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Advisory/Deprecated%20Code/AvoidDeprecatedCallableAccess.ql

        theOldWayOfDoingThings();
        // ...
    }
}