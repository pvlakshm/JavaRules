public class DangerousNonCircuitLogic
{
    // Using a bitwise logical operator on a boolean where a conditional-and or conditional-or operator is intended
    // may yield the wrong result or cause an exception.
    // References:
    // Rule doc: https://lgtm.com/rules/7900077/
    // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Likely%20Typos/DangerousNonCircuitLogic.ql

    private String forename;
    private String surname;

    public boolean hasForename()
    {
        return forename != null && forename.length() > 0;   // GOOD: Conditional-and operator
    }

    public boolean hasSurname()
    {
        return surname != null & surname.length() > 0;      // BAD: Bitwise AND operator
    }
}