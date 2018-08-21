public class WhitespaceContradicsPrecedence
{
    private void contracdictsOpPrecedence(int capacity)
    {
        // below, the spacing around + and >> suggests the grouping
        // capacity + (capacity>>1), i.e., the allocated array should
        // be 50% larger than the given capacity. 
        // However, + has higher precedence than >>, so this code allocates
        // an array of size (capacity + capacity) >> 1, which is the same
        // as capacity. 
        int[] buf = new int[capacity + capacity>>1];
    }
}