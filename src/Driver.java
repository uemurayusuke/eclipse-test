

//Humanが親クラス
public class Driver extends Human {
	@Override
	public void work() {
		System.out.println("車を運転します");
	}
}

//抽象メソッドが親クラスに定義して、
//それぞれのファイルで、オーバーライドしてるけど、
//使い分けはどうするの？って話やな