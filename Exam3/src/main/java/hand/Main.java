package hand;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入格式为yyyy-mm-dd的日期：");
		String date=sc.nextLine();
		int y=Integer.valueOf(date.split("-")[0]).intValue();
		int m=Integer.valueOf(date.split("-")[1]).intValue();
		int d=Integer.valueOf(date.split("-")[2]).intValue();
		System.out.println(y+"-"+m+"-"+d);
		
		
	if((y%4==0&&y%100!=0)||y%400==0)
	{
		int sum=0;
		for (int i = 0; i <m; i++) {
			if(i==2)
			{
				sum+=29;
			}else
			{
			sum+=monthofday(i);
			}
		}
		sum=sum+d;
		System.out.println("你输入的日期为当年的第"+sum+"天");
	}else
	{
		int sum=0;
		for (int i = 0; i <m; i++) {
			if(i==2)
			{
				sum+=28;
			}else
			{
			sum+=monthofday(i);
			}
		}
		sum=sum+d;
		System.out.println("你输入的1日期为当年的第"+sum+"天");
	}
	} catch (NumberFormatException e) {
		System.out.println("您输入的日期格式有误！");
	}
	
}
public static int monthofday(int m)
{
	switch(m)
	{
	case 1:
	case 5:
	case 3:
	case 7:
	case 8:
	case 10:
	case 12:
	return 31;
	case 4:
	case 6:
	case 9:
	case 11:
		return 30;
	}
	return 0;
}
}
