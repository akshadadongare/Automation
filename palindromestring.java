package strings;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev="";
		for (int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
			//System.out.println(str.charAt(i));
			
		}
		if (str.equals(rev))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
			
		}
			}
			
	}


