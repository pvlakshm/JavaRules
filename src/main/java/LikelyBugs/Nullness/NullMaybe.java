public class NullMaybe
{
    public int getVal(Integer i)
    {
        // References:
        // Rule doc: 
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Nullness/NullMaybe.ql

        return false? 0 : i;
    }
}