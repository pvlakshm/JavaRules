public class TypeCheck
{
    public String getKind(Animal a)
    {
        // Contradictory dynamic type checks in `instanceof` expressions and casts may cause dead code
        // or even runtime errors, and usually indicate a logic error.
        // References:
        // Rule: https://lgtm.com/rules/5970069/

        // Since Tiger is a subclass of Mammal, the second instanceof check can never evaluate to true!
        if (a instanceof Mammal)
            return "Mammal";
        else if (a instanceof Tiger)
            return "Tiger";
        else
            return "unknown";
    }
}