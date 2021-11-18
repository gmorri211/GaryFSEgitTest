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

	public String getFirstName()
	{
		return firstName;
		}

	public String getSurname()
	{
		return surname;
		}

	public void setFirstName()
	{
		this.firstName = firstName;
		}

	public void setSurname()
	{
		this.surname = surname;
		}

	public int getAge(int myAge)
	{
		int age = myAge;
		return age;
		}

	public void printFullName()
	{
		}
	}