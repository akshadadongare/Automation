package strings;

public class NumberOfTimeCharAppears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="sayali";
str=str.toLowerCase();
char ch= 'i';
int count=0;
for(int i=0;i<str.length() ;i++)
{
	if (str.charAt(i)==ch)
	{
		count++;
	}
}
System.out.println("The character '"+ ch +"' appears  "+ count +"  times");
	}

}
