package day04;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number={12,53,68,27,14,8};
		int result=arrayAdd(number);
		int max=arrayMax2(number);
		int min=arrayMin(number);
		System.out.println(result);
		System.out.println(max);
		System.out.println(min);

	}
	
	public static int arrayAdd(int[] num){
		int sum = 0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		return sum;
	}
	
	public static int arrayMax(int[] num){
		int max=num[0];
		for(int i=1;i<num.length;i++)
		{
			max=max>num[i]?max:num[i];
		}
		return max;
	}
	public static int arrayMax2(int[] num){
		int max=0;
		for(int i=0;i<num.length;i++)
		{
			max=num[max]>num[i]?max:i;
		}
		return num[max];
	}
	public static int arrayMin(int[] num){
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			min=min<=num[i]?min:num[i];
		}
		return min;
	}

}
