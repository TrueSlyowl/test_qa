public class FirstTest {
	
	public static void main (String[] args) {
		helloTest();
		helloTest2( "для примера");
		System.out.println(helloTest3(3,5));
	}
	public static void helloTest ()
		{
			System.out.println("Текст");

		}


	public static void helloTest2(String text)
	{
		System.out.println("Текст " + text);

	}
	public static String helloTest3(int value1, int value2)
	{
		return "Числа для примера "+value1+"+"+value2;
	}



}
