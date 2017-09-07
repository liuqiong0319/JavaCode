package learn.self.demo;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seasonInfo(52);
		seasonIf(4);

	}
	
	public static  void seasonInfo(int mouth){
		switch (mouth){		
		case 1:
		case 2:
		case 3:
			System.out.println(mouth+"月是春季");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println(mouth+"月是夏季");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println(mouth+"月是秋季");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println(mouth+"月是冬季");
			break;
		default:
			System.out.println("您输入的月份不存在");
		}
	}
	
	public static void seasonIf(int mouth){
		if(mouth>=1 && mouth<=3)
			System.out.println(mouth+"月是春季");
		else if(mouth>=4 && mouth<=6)
			System.out.println(mouth+"月是夏季");
		else if(mouth>=7 && mouth<=9)
			System.out.println(mouth+"月是秋季");
		else if(mouth>=10 && mouth<=12)
			System.out.println(mouth+"月是冬季");
		else
			System.out.println("您输入的月份不存在");
	}

}
