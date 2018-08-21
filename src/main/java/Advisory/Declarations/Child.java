
public class Child extends Parent
{
    // @Override
    public void m1()
    {
        // The @Override annotation serves as a reminder that the intent of the method is to override a parent method.
        // A method that overrides a method in a superclass but does not have an 'Override' annotation cannot take
        // advantage of compiler checks, and makes code less readable.
        // References:
        // Rule: https://lgtm.com/rules/2046390549/

        System.out.println("From child m1()");
    }
}