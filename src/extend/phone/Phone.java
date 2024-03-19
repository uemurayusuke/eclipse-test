

package extend.phone;

public interface Phone {
	int MAX_NUMBER_DIGITS = 11;

	public void call(String number);
}

//インターフェースとは、定数と抽象メソッドだけを持つクラスのようなもの。
//インターフェースはクラスで実装して利用する
//実装したクラスはインターフェース内の抽象メソッドをすべて実装する必要がある。
