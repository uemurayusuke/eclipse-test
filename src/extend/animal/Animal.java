
package extend.animal;

//抽象クラス
public abstract class Animal {
	protected String name;

	public void eat() {
		System.out.println(name + "が食事をしました！");
	}

//	抽象メソッド
//	抽象クラスは一般的に、抽象メソッドを1つ以上持っている。
	public abstract void cry();
}


//抽象クラスとは、クラス宣言時にabstract修飾子を指定したクラスのこと。
//抽象クラスは一般的に、抽象メソッドを1つ以上持っている。
//抽象メソッドとは、処理を記述せずにメソッド名や引数、戻り値の型だけを定義したメソッド。