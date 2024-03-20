
//Humanが親クラス
public class Student extends Human {
	
//	Humanに定義した内容をOverrideしてる
	@Override
	public void work() {
		System.out.println("勉強をします");
	}
}