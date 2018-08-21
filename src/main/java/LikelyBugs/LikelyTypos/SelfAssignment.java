public class SelfAssignment
{
    private int i;

    public SelfAssignment(int i)
    {
        // Assigning a variable to itself is useless and very likely indicates an error in the code.
        // References:
        // Rule doc: https://lgtm.com/rules/1506094636069/
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Likely%20Typos/SelfAssignment.ql

        i = i;  // actually, the user meant this.i = i; so this is likely a typo.
    }
}