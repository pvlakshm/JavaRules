public class NullMaybe
{
    public int getVal(String s)
    {
        // References:
        // Rule doc: 
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Nullness/NullMaybe.ql

        return true ? s.length() : 0;
    }
}