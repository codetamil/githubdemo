package questions;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username=new String("admin");
		String password=new String("admin");
		
		if(username==password)
		{
			System.out.println("login");
		}
		else
		{
			System.out.println("try again");
		}
		
		System.out.println(username.hashCode());
		System.out.println(password.hashCode());

	}

}
