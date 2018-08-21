public class UselessParameter
{
    // The param 'z' is not used and is useless
    // While this is a contrived example, it is possible to end up with useless params in the course of refactoring.
    //
    // References:
    // Rule: https://lgtm.com/rules/1506317566749/

    private boolean compare(int x, int y, int z)
    {
        if (x < y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}