public class TypeCheck
{
    // Since Tiger is a subclass of Mammal, the second instanceof check can never evaluate to true!
    public String getKind(Animal a)
    {
        if (a instanceof Mammal)
            return "Mammal";
        else if (a instanceof Tiger)
            return "Tiger";
        else
            return "unknown";
    }
}