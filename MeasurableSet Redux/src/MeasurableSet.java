import java.util.*;

public class MeasurableSet {
	ArrayList<Measurable> measureList = new ArrayList<Measurable>();
	private Measurable min;
	private Measurable max;
	
	public void add(Measurable m)
	{
		if(measureList.size() == 0)
		{
			min = m;
			max = m;
		}
		if(m.getMeasure() < min.getMeasure())
		{
			min = m;
		}
		if(m.getMeasure() > max.getMeasure())
		{
			max = m;
		}
		measureList.add(m);
	}
	
	public Measurable getMax()
	{
		return max;
	}
	
	public Measurable getMin()
	{
		return min;
	}
	
	public int getMiddle(int floor, int ceil)
	{
		int counter = 0;
		for(int i = 0; i < measureList.size(); i++)
		{
			
			if(measureList.get(i).getMeasure() >= floor && measureList.get(i).getMeasure() <= ceil)
			{
				counter ++;
				
		
			}
		}
		return counter;
	}
	
	public int getBelow(int floor)
	{
		int counter = 0;
		for (int i = 0; i < measureList.size(); i++)
		{
			if(measureList.get(i).getMeasure() < floor)
			{
				counter ++;
			}
		}
		return counter;
	}
	public int getAbove(int ceil)
	{
		int counter = 0;
		for (int i = 0; i < measureList.size(); i++)
		{
			if(measureList.get(i).getMeasure() > ceil)
				
			{
				counter ++;
			}
		}
		return counter;
	}
}