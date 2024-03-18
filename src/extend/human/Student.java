
package extend.human;


//修飾子  class クラス名 extends スーパークラス名
public class Student extends Human {
	private int score;

//	nameとageはHuman(スーパークラス)から持ってきた
	public Student(String name, int age, int score) {
		
//		親インスタンスのフィールド参照
//		super.フィールド;
		super(name, age);
		this.score = score;
	}

//	このコードがよく分からん。
//	これはメソッド定義
//	操作の部分
		public String getStudentProfile() {
//			                           親クラスのHumanのageを使用
			String profile = "年齢は" + super.age + "です。";
//			これは点数情報を追加してる
			profile += "学生で、テストの点数は" + this.score + "点です。";
			return profile;
		}
	}