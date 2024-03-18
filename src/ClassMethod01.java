
public class ClassMethod01 {

	public static void main(String[] args) {
//		yamadaは変数
		Human01 yamada = new Human01(); //Human01クラスのインスタンスを生成
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human01 sato = new Human01("佐藤", 25); //Human01クラスのインスタンスを生成
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
	
//	Human01.javaの内容を引用してるって事やな。
//	publicを使用して、どこからでもアクセスできるクラスHuman01を定義する。
//	publicを用いてどこからでもアクセスできるメンバー変数nameとageを定義する。属性＝メンバー変数。
	
}
