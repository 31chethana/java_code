//program using constructor

import java.util.Scanner;
class sample_time
{
	public static void main(String args[])
	{
		time t = new time();
		t.print();
	}
}
class time
{
	int h,m,s;
	time()
	{
		h=9;
		m=44;
		s=10;
	}
	void print()
	{
		System.out.println("Time:	"+h+":"+m+":"+s+" AM");
	}
}


