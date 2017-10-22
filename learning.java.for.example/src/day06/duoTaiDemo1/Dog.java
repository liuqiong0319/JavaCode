package day06.duoTaiDemo1;

public class Dog extends Animal implements LookHome {

	@Override
	public void lookHome() {
		// TODO Auto-generated method stub
		System.out.println("看家");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃骨头");
	}

}
