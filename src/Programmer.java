
//Humanが親クラス
public class Programmer extends Human {
	@Override
	public void work() {
		System.out.println("プログラムを書きます");
	}

//	studyメソッドはProgrammerで定義したメソッド
	public void study() {
		System.out.println("技術書を読みます");
	}
}