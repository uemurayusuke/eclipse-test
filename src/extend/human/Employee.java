

package extend.human;
//                              親クラス
public class Employee extends Human {
	private String department;

	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	public String getEmployeeProfile() {
		String profile = "年齢は" + this.age + "です。";
//		上記のコードに続いて、下記のコードが来る
//		+=演算子は、左辺の変数に右辺の値を加え、その結果を左辺の変数に代入する
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}

//final修飾子を記述する事で、定数になる。