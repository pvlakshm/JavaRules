public class SpuriousJavadocParam
{
    // Javadoc @param tags that do not match any parameters in the method or constructor are confusing.
    // Various examples of spurious Javadoc param tags.
    // References:
    // Rule doc: https://lgtm.com/rules/2049510531/
    // QL query: https://github.com/lgtmhq/lgtm-queries/blob/master/java/Advisory/Documentation/ImpossibleJavadocThrows.ql

    /**
     * The following param tag is empty.
     *
     * @param   
     */
    public void emptyParamTag(int p)
    {
        //...
    }
 
 
    /**
     * The following param tag has a misspelled value.
     *
     * @param prameter The parameter's value.
     */
    public void typo(int parameter)
    {
        //...
    }
 
 
    /**
     * The following param tag appears to be outdated
     * since the method does not take any parameters.
     *
     * @param sign The number's sign.
     */
    public void outdated()
    {
        //...
    }
 
 
    /**
     * The following param tag uses html within the tag value.
     *
     * @param <code>ordinate</code> The value of the y coordinate.
     */
    public void html(int ordinate)
    {
        //...
    }
 
 
    /**
     * Invalid syntax for type parameter.
     *
     * @param T The type of the parameter.
     * @param parameter The parameter value.
     */
    public <T> void parameterized(T parameter)
    {
        //...
    }
}