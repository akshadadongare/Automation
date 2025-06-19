package strings;

public class VowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="How Are you doing today?";
int count=0;
str=str.toLowerCase();
for(int i=0;i<str.length();i++)
{
	char ch =str.charAt(i);
	if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		count++;
	}
	
}
System.out.println("Number Of vowels:" +count);

	}

}
