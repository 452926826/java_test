package hand;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入工资：");
	int d=sc.nextInt()-3500;
	if(d<=0)
	{
		System.out.println("所需要缴纳的税费为："+0);
	}else if(d<=1500)
	{
		System.out.println("所需要缴纳的税费为："+d*0.03);
	}else if(d>1500&&d<=4500)
	{
		System.out.println("所需要缴纳的税费为："+(1500*0.03+(d-1500)*0.1));
	}else if(d>4500&&d<=9000)
	{
		System.out.println("所需要缴纳的税费为："+(1500*0.03+3000*0.1+(d-4500)*0.2));
	}else if(d>9000&&d<=35000)
	{
		System.out.println("所需要缴纳的税费为："+(1500*0.03+3000*0.1+4500*0.2+(d-9000)*0.25));
	}else if(d>35000&&d<=55000)
	{
		System.out.println("所需要缴纳的税费为："+(1500*0.03+3000*0.1+4500*0.2+27000*0.25+(d-35000)*0.1));
	}else if(d>55000&&d<=80000)
	{
		System.out.println("所需要缴纳的税费为："+(1500*0.03+3000*0.1+4500*0.2+27000*0.25+20000*0.3+(d-55000)*0.35));
	}else
	{
		System.out.println("所需要缴纳的税费为："+(1500*0.03+3000*0.1+4500*0.2+27000*0.25+20000*0.3+25000*0.35+(d-80000)*0.45));

	}
		
}
}
