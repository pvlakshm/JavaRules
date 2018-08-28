class WrongPerson implements Cloneable
{
    private String name;

    public WrongPerson(String name)
    {
        this.name = name;
    }

    // A 'clone' method that is overridden in a subclass, and that does not itself call 'super.clone', causes calls to
    // the subclass's 'clone' method to return an object of the wrong type.
    // References:
    // Rule doc: https://lgtm.com/rules/9990076/
    // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Likely%20Bugs/Cloning/MissingCallToSuperClone.ql

    // BAD: 'clone' does not call 'super.clone'.
    @Override
    public WrongPerson clone()
    {
        return new WrongPerson(this.name);
    }
}

class WrongEmployee extends WrongPerson
{
    public WrongEmployee(String name)
    {
        super(name);
    }

    // ALMOST RIGHT: 'clone' correctly calls 'super.clone',
    // but 'super.clone' is implemented incorrectly.
    @Override
    public WrongEmployee clone()
    {
        return (WrongEmployee)super.clone();
    }
}

public class MissingCallToSuperClone
{
    public static void main(String[] args)
    {
        WrongEmployee e = new WrongEmployee("John Doe");
        WrongEmployee eclone = e.clone(); // Causes a ClassCastException
    }
}