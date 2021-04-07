public class StringBuilderDemo
{
	public static void main (String[] args)
	{
		String str = "";

		for (int k = 0; k < 50_000; k++)
		{
			str += k + ", ";
		}
		System.out.println (str);


		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < 50_000; k++)
		{
			sb.append (k + ", ");
		}
		System.out.println (sb.toString() );

	}

}