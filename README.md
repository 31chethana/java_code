# constructing strings

class print_string
{
	public static void main(String args[])
	{
		char c[] = {'J','A','V','A'};
		byte ascii[] = {65,66,67,68,69,70};
		String s1 = new String (c);
		String s2 = new String (s1);
		String s3 = new String (ascii);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
