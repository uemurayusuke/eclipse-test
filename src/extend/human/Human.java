


package extend.human;

public class Human {
	
	private String name;
	protected int age;

	public Human(String name, int age) {
//		中身はこっち
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	

}


//Objectクラスとは、クラス階層のルートのクラス
//Javaのすべてのクラスは、スーパークラスがObjectクラス
//クラスの宣言でexpendsを省略した場合は、extends Objectを宣言したことになる。