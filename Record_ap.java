/** Record models a Library Book */
public class Record_ap
{ // the names of the fields describe their contents:
   private Key_ap catalog_number;
  private String emri_i_personit;
  private String data_e_takimit;
  private String ora_e_takimit;

    /** Constructor Record constructs the book.
     * @param n - name of a sale item
     * @param num - the item's ID-number
     * @param wp - wholeprice of the item
     * @param rp - retailprice of the item
     * @param  q - the quantity in stock     */
   public Record_ap(Key_ap num, String e, String t, String ora)
   {  catalog_number = num;
     emri_i_personit = e;
     data_e_takimit = t;
     ora_e_takimit = ora;
   }

    /** getkey  returns the key that identifies the record
     * @return the key  */
   public Key_ap getKey() { 
      return catalog_number; }

   public String getName() { 
      return emri_i_personit; }


   public String getDate() { 
      return data_e_takimit; }


   public String getHour() { 
      return ora_e_takimit; }
}