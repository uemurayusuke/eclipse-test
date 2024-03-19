
public class Human01 {
    // メンバー変数
	public String name; 
	public int age;  

    // 引数なしのコンストラクタ
	public Human01() {
		name = "山田";
		age = 20;
	}
    // 引数2つのコンストラクタ
	public Human01(String name, int age) {
//		同じnameだから、thisで区別してるって所もあるみたいやな。
		this.name = name;
		this.age = age;
	}
}


//アクセス修飾子にpublicを付ける事でどこからでもアクセスができる。
