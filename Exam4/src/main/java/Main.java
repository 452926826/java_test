import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;


public class Main {
public static void main(String[] args) {
	Random r=new Random();
	List<Integer> list=new ArrayList<Integer>();
	for (int i = 0; i < 50; i++) {
		list.add(r.nextInt(100));	
	}
	Map<Integer,List> m=new TreeMap<Integer,List>();
	for (int i = 0; i < 10; i++) {
		List<Integer> l=new ArrayList<Integer>();
	for (Integer num : list) {
		
			if(num/10==i)
			{
				
				l.add(num);
				
			}
			m.put(i, l);
		}
	}
	System.out.print("Map中的数据为：");
	System.out.println(m.toString().replace("=","=>"));
	
	
	//排序
	//give(list);
	Map<Integer,List> m2=new TreeMap<Integer,List>();
	for (int i = 0; i < 10; i++) {
	if(m.containsKey(i))
	{
		m2.put(i, give(m.get(i)));
	}
	}
	//System.out.println(give(list));
	System.out.print("【排序后的Map中的数据为：");
	System.out.println(m2.toString().replace("=","=>"));
	
}
public static List<Integer> give(List<Integer> list)
{
	
	List<Integer> l2=new ArrayList<Integer>();
	int[]num=new int[list.size()];
	for (int i = 0; i < list.size(); i++) {
		num[i]=list.get(i);
	}
	
	for (int i = 0; i < list.size(); i++) {
		for (int j = 1; j < list.size(); j++) {
			int temp;
			if(num[i]<=num[j])
			{
				temp=num[j];
				num[j]=num[i];
				num[i]=temp;
			}
		}
	}
	for (int i = 0; i < list.size(); i++) 
	{
		if(i>0)
		{
			l2.add(num[i]);
		}
	}
	l2.add(num[0]);
	
	return l2;
}
}
