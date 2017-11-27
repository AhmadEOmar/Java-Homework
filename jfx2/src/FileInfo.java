public class FileInfo{
	private final int MAX_NUM = 25;
	private int num;
	private Individual dataArray[];
	public FileInfo()
	{
		num = 0;
		dataArray = new Individual[MAX_NUM];
	}
	public void addPerson(Individual p)
	{
		if (num<MAX_NUM){
			num++;
			dataArray[num-1] = p;
		}
}
	public String toString()
	{
		String ret="";
		for (int i=0; i<num; i++)
		ret += dataArray[i].toString() + "\n";
		return ret;
	}
}
