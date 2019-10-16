
public class Results {
static int Sub1=70;
static int Sub2=55;
static int Sub3=50;


public static void main(String[] args)
{
	if(Sub1 >=60 && Sub2>=60 && Sub3>=60)
	{
		System.out.println("passed");
	}
	else if(Sub1>60 && Sub2>60 || Sub1>60 && Sub3>60 || Sub2>60 && Sub3>60 ) {
		System.out.println("Promoted");
	}
	else {
		System.out.println("Failed");
	}
	
}
}
