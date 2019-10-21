/*
 * @author：刘桐   李佳欢
 * @data：2019-10-19
 */

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class arithmetic
{
    public static void main(String[] args) throws FileNotFoundException {	
    	
    	PrintStream ps = new PrintStream("d:/result.txt");
    	
		int result;
		
		Scanner in=new Scanner(System.in);
	
		System.out.print("请输入题目个数：");
		int number=in.nextInt();
		//控制题目个数number
		
		System.out.print("请输入操作数的范围（如 100，1000等）:");
		int range=in.nextInt();
		//控制题目范围range
		
		System.out.println("请选择是否有负数：1:有  0:没有");
		int negative=in.nextInt();
		//控制正负数negative
		
		System.out.println("请选择是否包含*或者/：2:否 4:是 ");
		int symbol=in.nextInt();
		//控制符号symbol
		
		System.setOut(ps);
		
		for(int i=0;i<number;i++) //循环控制题目个数 
		{
			//第一个操作数的选择operand1
			int operand1=(int)(Math.random()*range+1);
			
			if(negative==1) //有负数
			{
				int random1=(int) (Math.random()*2);
				switch(random1) 
				{
					case 0:
						operand1=operand1*(-1);//取负数
						System.out.print(operand1);
						break;
					case 1:
						System.out.print(operand1);
						break;
				}
			}
			if(negative==0) //没有负数
			{
				System.out.print(operand1);
			}
			
			if(symbol==2) //选择两个字符‘+’‘-’
			{
				int random2=(int)(Math.random()*2);
				switch(random2) //随机选择运算符
				{
					case 0:
						System.out.print("+");
					    break;
					case 1:
						System.out.print("-");
					    break; 
				}
				
				int random3=(int)(Math.random()*range+1);
				if(negative==1) //有负数
				{
					int random1=(int) (Math.random()*2);
					switch(random1)
					{
						case 0:
							random3=random3*(-1);//取负数
							System.out.print(random3);break;
						case 1:
						    System.out.print(random3);break;
					}
				}
				
				if(negative==0) //没有负数
				{
					System.out.print(random3);
				}
					System.out.println("=");
			}
			
			if(symbol==4) //四个字符的‘+’‘-’‘*’‘/’
			{
				int random2=(int)(Math.random()*4+1);
				switch(random2) //随机选择运算符
			    {
					case 1:
						System.out.print("+");
						break;
					case 2:
						System.out.print("-");
						break;
					case 3:
						System.out.print("*");
						break;
					case 4:
						System.out.print("/");
						break;
			    }
			
			//第二个操作数的选择operand2
			int operand2=(int) (Math.random()*range+1);
			if(negative==1) //有负数
			{
				int random1=(int) (Math.random()*2);
					switch(random1) 
					{
						case 0:
							operand2=operand2*(-1); //取负数
						    System.out.print(operand2);
						    break;
						case 1:
					   	    System.out.print(operand2);
					   	    break;
					}
			}
			
			if(negative==0) //没有负数
			{
				System.out.print(operand2);
			}
			
			//等号
			System.out.print("=");
			
			//运算结果
			if(random2==1) 
			{
				result=operand1+operand2;System.out.println(result);
			}
			if(random2==2)
			{
				result=operand1-operand2;System.out.println(result);
			}
			if(random2==3)
			{
				result=operand1*operand2;System.out.println(result);
			}
			if(random2==4)
			{
				result=operand1/operand2;System.out.println(result);
			}
			
		}	
		}
	
}
}
