package org.eyedb.benchmark.quicktour.db4o;

public class Person {
	public Person()
	{
		this.firstName = "";
		this.lastName = "";
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName( String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName( String lastName)
	{
		this.lastName = lastName;
	}

	private String firstName;
	private String lastName;
}
