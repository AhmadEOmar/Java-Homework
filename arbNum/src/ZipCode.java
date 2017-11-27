public class ZipCode
{
    String first;
    String last;
    int zip;
 
    public ZipCode(String first, String last, int zip)
    {
        this.first = first;
        this.last = last;
        this.zip = zip;
    }
    public String toString()
    {
        return first+"\t"+last+"\t"+zip;
    }
}
