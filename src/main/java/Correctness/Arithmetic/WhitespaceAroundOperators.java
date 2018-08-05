public class WhitespaceAroundOperators
{
    private void contracdictsOpPrecedence()
    {
        int f = 100;
        if (f +1<10)            // The whitespace around the operators contradics precedence rules.
                                // This is actually evaluated as (f+1) < 10. 
        {
            // do something
        }
    }
}