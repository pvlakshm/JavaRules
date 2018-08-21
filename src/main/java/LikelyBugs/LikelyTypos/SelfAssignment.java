public class SelfAssignment
{
    private int i;

    public SelfAssignment(int i)
    {
        // Assigning a variable to itself is useless and very likely indicates an error in the code.
        // References:
        // Rule: https://lgtm.com/rules/1506094636069/

        i = i;  // actually, the user meant this.i = i; so this is likely a typo.
    }
}