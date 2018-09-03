public class ImpossibleJavadocThrows
{
    /**
    * @throws Exception if a problem occurs.
    */
    public void noThrow()
    {
        // Javadoc that incorrectly claims a method or constructor can throw an exception is misleading.
        // References:
        // Rule doc: https://lgtm.com/rules/2043890479/
        // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Advisory/Documentation/ImpossibleJavadocThrows.ql

        System.out.println("this method does not throw.");
    }
}