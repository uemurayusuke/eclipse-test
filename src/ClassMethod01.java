
public class ClassMethod01 {
	
		public static void main(String[] args) {
//			Human01クラスのインスタンスを生成
			Chapter11 yamada = new Chapter11(); 
			System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
			
			Chapter11 sato = new Chapter11("佐藤", 25);
			System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
			
		}
}

//クラスをグループ分けして管理する仕組みが「パッケージ」です。
//クラスが増えてくると一覧に表示されるクラスが増えてしまい、目的のクラスを探すのが難しくなる

//package パッケージ;
//import パッケージ.クラス名;
//import パッケージ.*;
