public class ImpossibleJavadocThrows
{
    /**
    * @throws exception if a problem occurs.
    */
    public void noThrow()
    {
        // Javadoc that incorrectly claims a method or constructor can throw an exception is misleading.
        // References:
        // Rule: https://lgtm.com/rules/2043890479/

        System.out.println("this method does not throw.");
    }
}