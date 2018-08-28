public class ConstantExpAppearsNonConstant
{
    private static void constantExpressions(int i, long l, boolean b)
    {
        // An expression that always evaluates to the same value, but which has a non-constant subexpression, indicates a mistake.
        // References:
        // Rule doc: https://lgtm.com/rules/5970068/
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Arithmetic/ConstantExpAppearsNonConstant.ql

        int iRes = i * 0;           // always evaluates to 0.

/*
        // several other examples:
        iRes = i % 1;               // always evaluates to 0.
        iRes = i << 32;             // always evaluates to 0;
        iRes = i & 0;               // always evaluates to 0. 

        long lRes = l << 64;        // always evaluates to 0.
        boolean bRes = b || true;   // always evaluates to true. 
        bRes = b && false;          // always evaluates to false.
*/
    }
}