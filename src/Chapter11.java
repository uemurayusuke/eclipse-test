
public class Chapter11 {
	
//	メンバー変数
	public String name;
	public int age;
	
//	引数なしのコンストラクタ
//	newでインスタンスが生成されるときに自動的に呼び出される特別なメソッドを「コンストラクタ」
//	コンストラクタでは、一般的に、フィールドの初期化処理を行います。
//	引数のないコンストラクタをデフォルトコンストラクタと呼ぶ。
	public Chapter11() {
		name = "山田";
		age = 20;
	}
	
//	引数2つのコンストラクタ
	public Chapter11(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


