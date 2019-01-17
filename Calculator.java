Class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		While(true)
		{
			System.out.println("1.Add 2.Subtract");
			int choice=sc.nextInt();
			System.out.println("Enter 2 numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Addition is "+(a+b));
			}
			else if(choice==2)
			{
				System.out.println("Subtraction is "+(a-b));
			}
		}

	}
}
