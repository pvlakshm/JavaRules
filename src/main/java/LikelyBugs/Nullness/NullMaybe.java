public class NullMaybe
{
    public int getVal(Integer i, boolean b)
    {
        // References:
        // Rule doc: 
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Nullness/NullMaybe.ql

        if (b == true)
        {
            i = 5;
        }

        return i.intValue();
    }
}