public class NullExprDeref
{
    public int getVal(String s)
    {
        // Dereferencing a null value leads to a NullPointerException. An expression may be
        // implicitly dereferenced if its type is a boxed primitive type, and it occurs in a
        // context in which implicit unboxing occurs.
        // In the following example implicit unboxing can cause a NullPointerException if helper is null.
        // If the method is intended to return null, the return type should be changed to Integer.
        // References:
        // Rule doc: https://lgtm.com/rules/1506303947316/
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Nullness/NullExprDeref.ql

        return s == null ? null : s.length();
    }
}