package day03;

/**
 * @description: 
 *               ��Ա�ڲ��࣬������Ϊ�ⲿ��ĳ�Ա������ֱ��ʹ���ⲿ������г�Ա�ͷ�������ʹ��private
 *               �ġ� ͬʱ�ⲿ��Ҫ�����ڲ�������г�Ա����/����������Ҫͨ���ڲ���Ķ�������ȡ��
 * @author Administrator
 *
 */
public class InnerClassDemo {
	private String name = "joan";
	int score = 69;

	public class Inner {
		String name = "joan.liu";

		public void show() {
			System.out.println("�ⲿ���name:" + InnerClassDemo.this.name);
			// ����ⲿ����ڲ��������ͬ�ĳ�Ա�����򷽷����ڲ���Ĭ�Ϸ����Լ��ĳ�Ա�����򷽷���
			// ���Ҫ�����ⲿ��ĳ�Ա����������ʹ�� this �ؼ���
			System.out.println("�ڲ����name:" + name);
			System.out.println("�˴����ڲ���ķ���");
		}
	}

	public void outerShow() {
		InnerClassDemo outer = new InnerClassDemo();
		Inner inner = outer.new Inner();
		// �ⲿ���ǲ���ֱ��ʹ���ڲ���ĳ�Ա�ͷ���,
		// ���ȴ����ڲ���Ķ���Ȼ��ͨ���ڲ���Ķ������������Ա�����ͷ�����
		inner.show();
		System.out.println("�����ⲿ��ķ������������ڲ���ķ���");
	}

	public static void main(String[] args) {
		InnerClassDemo innerTest = new InnerClassDemo();
		Inner inner = innerTest.new Inner();
		// �����˳�Ա�ڲ���󣬱���ʹ���ⲿ������������ڲ������
		// ������ֱ��ȥ new һ���ڲ�����󣬼����ڲ��� ������ = �ⲿ�����.new �ڲ���( );
		inner.show();
		innerTest.outerShow();
	}

}
