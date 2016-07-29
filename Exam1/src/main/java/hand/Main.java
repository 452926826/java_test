package hand;
import java.util.ArrayList;
import java.util.List;


public class Main {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	int num;
	for (int i = 101; i <=200; i++) {
		num=shuju(i);
		if(num!=0)
		l.add(num);
	}
	System.out.print("100-200之间素数有"+l.size()+"个,分别是：");
	for (int i = 0; i <l.size(); i++) {
		System.out.print(l.get(i)+",");
	}
}
	public static int shuju(int a)
	{
		boolean b=true;
		for (int i = 2; i < a; i++) {
			if(a%i==0)
			b=false;	
		}
		if(b)
		return a;
		else
		return 0;
	}
}
