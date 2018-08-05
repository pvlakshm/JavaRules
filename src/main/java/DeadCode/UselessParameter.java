public class UselessParameter
{
    private boolean compare(int x, int y, int z)
    {
        // The param 'z' is not used and is useless
        // While this is a contrived example, it is possible to end up with useless params in the course of refactoring.
        if (x < y) return true;
        else return false;
    }
}