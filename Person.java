package fsestuff.usefulclasses;

public class Person
{
	public String firstName;
	public String otherName;
	public String surname;

	public Person()
	{
		this.firstName = "unknown";
		this.otherName = "unknown";
		this.surname = "unknown";
		}

	public Person(String name1, String name2)
	{
		this.firstName = name1;
		this.otherName = "unknown";
		this.surname = name2;
		}
	}