package learn.self.demo;

/*
 * 根据用户输入的数据，显示对应的星期。
 */
public class NumToWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result=weekInfo(5);
		System.out.println(result);

	}
	
	public static String weekInfo(int num){
		String[] weeks={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		String info="";
		if(num<=0 || num>7)
		{
			throw new RuntimeException(num+"没有对应的星期");
		}
		else
			info=num+"对应的星期是"+weeks[num-1];
		return info;
		
	}

}
