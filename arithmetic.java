/*
 * @author����ͩ   ��ѻ�
 * @data��2019-10-19
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
	
		System.out.print("��������Ŀ������");
		int number=in.nextInt();
		//������Ŀ����number
		
		System.out.print("������������ķ�Χ���� 100��1000�ȣ�:");
		int range=in.nextInt();
		//������Ŀ��Χrange
		
		System.out.println("��ѡ���Ƿ��и�����1:��  0:û��");
		int negative=in.nextInt();
		//����������negative
		
		System.out.println("��ѡ���Ƿ����*����/��2:�� 4:�� ");
		int symbol=in.nextInt();
		//���Ʒ���symbol
		
		System.setOut(ps);
		
		for(int i=0;i<number;i++) //ѭ��������Ŀ���� 
		{
			//��һ����������ѡ��operand1
			int operand1=(int)(Math.random()*range+1);
			
			if(negative==1) //�и���
			{
				int random1=(int) (Math.random()*2);
				switch(random1) 
				{
					case 0:
						operand1=operand1*(-1);//ȡ����
						System.out.print(operand1);
						break;
					case 1:
						System.out.print(operand1);
						break;
				}
			}
			if(negative==0) //û�и���
			{
				System.out.print(operand1);
			}
			
			if(symbol==2) //ѡ�������ַ���+����-��
			{
				int random2=(int)(Math.random()*2);
				switch(random2) //���ѡ�������
				{
					case 0:
						System.out.print("+");
					    break;
					case 1:
						System.out.print("-");
					    break; 
				}
				
				int random3=(int)(Math.random()*range+1);
				if(negative==1) //�и���
				{
					int random1=(int) (Math.random()*2);
					switch(random1)
					{
						case 0:
							random3=random3*(-1);//ȡ����
							System.out.print(random3);break;
						case 1:
						    System.out.print(random3);break;
					}
				}
				
				if(negative==0) //û�и���
				{
					System.out.print(random3);
				}
					System.out.println("=");
			}
			
			if(symbol==4) //�ĸ��ַ��ġ�+����-����*����/��
			{
				int random2=(int)(Math.random()*4+1);
				switch(random2) //���ѡ�������
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
			
			//�ڶ�����������ѡ��operand2
			int operand2=(int) (Math.random()*range+1);
			if(negative==1) //�и���
			{
				int random1=(int) (Math.random()*2);
					switch(random1) 
					{
						case 0:
							operand2=operand2*(-1); //ȡ����
						    System.out.print(operand2);
						    break;
						case 1:
					   	    System.out.print(operand2);
					   	    break;
					}
			}
			
			if(negative==0) //û�и���
			{
				System.out.print(operand2);
			}
			
			//�Ⱥ�
			System.out.print("=");
			
			//������
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
