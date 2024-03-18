
package extend.animal;

public abstract class Animal {
	protected String name;

	public void eat() {
		System.out.println(name + "が食事をしました！");
	}

//アクセス修飾子 abstract 戻り値の型 メソッド名(引数)
//	メソッドにabstract修飾子を指定すると抽象メソッドになる
//	抽象メソッドではメソッドブロックの記述をせずに宣言のみを行います。
//	メソッドブロックを記述するとコンパイルエラーになる。
//	サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる
	public abstract void cry();
}

//抽象メソッドが分かってないな。