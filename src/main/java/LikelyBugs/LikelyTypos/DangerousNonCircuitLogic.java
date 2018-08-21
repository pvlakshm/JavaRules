public class DangerousNonCircuitLogic
{
    // Using a bitwise logical operator on a boolean where a conditional-and or conditional-or operator is intended
    // may yield the wrong result or cause an exception.
    // References:
    // Rule: https://lgtm.com/rules/7900077/

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