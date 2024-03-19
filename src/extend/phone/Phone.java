

package extend.phone;

//Phoneのインターフェースの宣言
public interface Phone {
//	フィールドの宣言(定数)
	int MAX_NUMBER_DIGITS = 11;

//	public abstractが自動で追加される(抽象メソッド)
    void call(String number);
}

//インターフェースとは、定数と抽象メソッドだけを持つクラスのようなもの。
//インターフェースはクラスで実装して利用する
//実装したクラスはインターフェース内の抽象メソッドをすべて実装する必要がある。
