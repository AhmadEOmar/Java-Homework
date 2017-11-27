	import java.util.*;
public class Main

{
    public Main(String string, String string2, int parseInt) {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args)
    {
        System.out.println("How many enteries will you be using?");
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        s.nextLine();
        String[] array = new String[length];   
        for(int x = 0; x<array.length; x++)
        {
            System.out.println("Please enter the First name, Last name, and Zip code, all separated by a tab: ");
            array[x]=s.nextLine();
        }
        Main[] zips = new Main[length];      
        String delimiter = "\\t";
        String[] temp;
        for(int x = 0; x<array.length; x++)
        {
            temp = array[x].split(delimiter);
            Main z = new Main(temp[0], temp[1], Integer.parseInt(temp[2]));
            zips[x] = z;
        }
        for (int x = 0; x<zips.length; x++)
            System.out.println(zips[x]);
         
    }
}
