import java.util.Random;
 
public class arbNum{

	
	public static void main(String args[]){
 
		int[] randarray = new int [50];
		Random random = new Random();
 
 
		
		for (int i = 0; i< randarray.length; i++)
		{
			randarray[i] = random.nextInt(100) +1;
		}
 
		int[] histo = new int[10];
		for (int i = 0; i<randarray.length; i++){
			if (randarray[i] < 10) 
			{

				
				histo[0] = histo[0] + 1;
 
			}
			else if (randarray[i] <= 20){
				
				histo[1] = histo[1] + 1;
			}
			else if ( randarray[i] <= 30){
				
				histo[2] += 1;
			}
			else if ( randarray[i] <= 40){
				
				histo[3]++;
			}
			else if ( randarray[i] <= 50){
				
				histo[4]++;
			}
			else if ( randarray[i] <= 60){
				
				histo[5]++;
			}
			else if ( randarray[i] <= 70){
				
				histo[6]++;
			}
			else if ( randarray[i] <= 80){
				
				histo[7]++;
			}
			else if ( randarray[i] <= 90){
				
				histo[8]++;
			}
			else if ( randarray[i] <= 100){
				
				histo[9]++;
	}
}
 

 
for(int i = 0; i < 10; i++) 
{
	System.out.print("\n" + i*10 + "-" + (i+1)*10 + "\t");
 
	for(int j=0;j<histo[i];j++)
		System.out.print("* ");
 
	System.out.print("\n");
	}
 
	}
}