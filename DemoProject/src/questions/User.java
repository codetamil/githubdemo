package questions;

public class User {
	
	String name;
	String email;
	
	User(String name,String email)
	{
		
		this.name=name;
		this.email=email;
		
	}
	@Override
	public String toString()
	{
		return name+" "+email;
	}
	
	public static void main(String args[])
	{
		System.out.println(new User("admin","admin@123"));
	}

}
