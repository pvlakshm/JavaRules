public class NullMaybe
{
    public int getVal(Integer i)
    {
        // References:
        // Rule doc: https://lgtm.com/rules/1954750296/
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Nullness/NullMaybe.ql

        return true ? i : 5;
    }
}