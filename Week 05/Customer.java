public class Customer
{
	private static int lastUsedId = 100;

	private int id;
	private String name;

	public Customer (String name)
	{
		lastUsedId++;

		id = lastUsedId;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return id + ": " + name;
	}

	public static void main (String[] args)
	{
		Customer c1 = new Customer ("Mike");
		Customer c2 = new Customer ("Frankie");

		System.out.println (c1);
		System.out.println (c2);


	}
}