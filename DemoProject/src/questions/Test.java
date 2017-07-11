package questions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(test());

	}
	
	static
	{
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static int test()
	{
		try
		{
			return 0;
		}catch(Exception e)
		{
			
		}finally
		{
			System.out.println("finally");
		}
		return 1;
	}

}
