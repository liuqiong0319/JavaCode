package learn.self.demo;

/**
 * 定义功能，将{34,12,67}数组中的元素转成字符串  [34,12,67]
 * @author Administrator
 *
 */
public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={34,12,67};
		String result=toString(array);
		System.out.println(result);
	}

	
	public static String toString(int[] array){
		String str="[";
		for(int i=0;i<array.length;i++){
			
			if(i==array.length-1)
				str=str+array[i]+"]";
			else
				str=str+array[i]+",";
		}
		return str;
	}
}
