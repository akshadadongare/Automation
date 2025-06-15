package loops;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =4567;
		int count=0;
				if (num==0) {
					count=1;
				}
				while(num!=0)	{
					num=num/10;
							count++;
				}
				System.out.println(count);
	}

}
