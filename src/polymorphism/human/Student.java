

package polymorphism.human;

//Humanクラスを継承
public class Student extends Human {
	private int score;

	public Student(String name, int age, int score) {
//		スーパークラスのコンストラクタを呼び出し
		super(name, age);
		this.score = score;
	}

//	親クラスのHumanに記述はあるのものの、
//	オーバーライドして、Studentクラス用に処理を変更している
	@Override
	public String getProfile() {
		String profile = "年齢は" + getAge() + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}