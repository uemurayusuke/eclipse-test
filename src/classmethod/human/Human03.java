

package classmethod.human;

public class Human03 {
	
//	メンバー変数=属性
//	メンバー変数を作りましたっていうコードがまず必要
	public String name;
	public int age;
	public String profession;
	
//	これは、メンバー変数に中身を入れる
	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}
	
//	getProfileメソッドを定義する。
//	これはカスタムメソッドやな。
	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}
	
	public void greet(String friend) {
		if (friend == null) { // String型の値はnullの可能性があるのでチェック
			System.out.println("挨拶する友達がわかりません！");
//			returnが実行される事で、そのメソッドが直ちに終了する。
//			returnに続くコードは実行されない。
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
	

}
