
package classmethod;

import classmethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		// Human04インスタンスを生成すると、コンストラクタ内の処理が実行される
//		本来はnewを使用する
		Human04 yamada = new Human04("山田");

		// 静的メンバーは、インスタンス生成せずに直接使用できる
//		newを使用せずに使用できる。staticなら。
		Human04.staticMethodPrint();

		// staticなクラス定数もインスタンスを生成せずに参照できる
//		staticなクラス定数もインスタンスを生成せずに参照できる。
		System.out.println(Human04.GREETING);

		// インスタンスメンバーは直接使用できない（コンパイルエラーになる）
		// Human04.instanceMethodPrint();
		// System.out.println(Human04.name);

		// インスタンスメンバーはインスタンス生成してから使用する
//		本来はインスタンス生成して、変数に内容入れて、
//		そこから引き出す流れになる。
		yamada.instanceMethodPrint();
	}
}