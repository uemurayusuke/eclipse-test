
public class Chapter8 {
//	上記でクラスを定義
	
	public static void main(String[] args) {
//		上記解説
//		public このメソッドは他のクラスからアクセス可能
//		static メインメソッドはクラスのインスタンス化なしに直接呼び出せる(どういう意味？)
//		void このメソッドは戻り値を返しません。(どういう意味?)
//		main メソッドの名前は"main"
//		(String[] args) このメソッドは1つの引数を取ります。
//		これは文字列の配列です。この引数を使ってプログラムの実行時に外部から情報を受け取ることが
//		できます。
		
		int number = 7;
		if (number < 5) {
			System.out.println(number + " は5未満です");
//			上記は出力するメソッド
		}
		
		if (number < 10) {
			System.out.println(number + " は10未満です");
		}
		
		if (number < 15) {
			System.out.println(number + " は15未満です");
		}
		
//		これでmain2メソッドを呼び出している。
//		Javaでは、プログラムの実行時に'main'メソッドが呼び出される。
//		だから、main2メソッドをmainメソッドの中に記述する。
//		main2メソッドの中身は、以下で記述
//		実行されるのはmainメソッドだけという事。
		
		main2(args);
	}

	
	public static void main2(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + " は5未満です");
		}
		else if (number < 10) {
			System.out.println(number + " は5以上、10未満です");
		}
		else if (number < 15) {
			System.out.println(number + " は10以上、15未満です");
		}
		else {
			System.out.println(number + " は15未満ではないです");
		}
	
	}	
}




//if文の基本構文
//if (条件式) {
//	ブロック(処理文);
//}

//Rubyでいうelsifの文が else if

//テスト


