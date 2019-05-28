public class Key_ap
{
    private int number_code;

    /** Constructor Key constructs a catalog number
     * @param num - the decimal number code, e.g.,  76.884 */
    public Key_ap(int num)
    {
        number_code = num;
    }

    /** equals returns whether the catalog number held within this object
     *  is identical to the catalog number held within  c
     * @param c - the other catalog number
     * @return true, if this catalog number equals  c; return false, otherwise */
    public boolean equals(Key_ap c)
    {
        int d = c.getNumberCode();
        return ( d == number_code );
    }

    /** getNumberCode returns the number code part of this catalog number
      * @return the number code, e.g.,  "76.884"  */
    public int getNumberCode() { return number_code; }
}