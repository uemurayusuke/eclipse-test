

package exception;

public class Exception01 {
	
	public static void main(String[] args) {
		System.out.println("100 ÷ 0 は？");
//		0で割り算するので、例外が発生
		int result = 100 / 0;
//		例外が発生した以降の処理は実行されない。
		System.out.println("計算結果" + result);
		System.out.println("プログラム終了");
	}
}

//例外とは、プログラム実行中に発生する予想しない事象(エラー)のことです。
//例外発生した時に実行する処理を例外処理と言います。
//例外処理の記述がない場合は、エラーメッセージを出力してプログラムを終了します。

//errorクラス
//致命的なエラーを表すクラスです。
//
//Exceptionクラス
//例外処理を記述する必要がある、一般的な例外を表すクラスです。
//
//RuntimeExceptionクラス
//例外処理を記述しなくてもコンパイルエラーにならない。
//プログラム実行中に発生する例外を表すクラス。
//try-catch文は、例外処理を記述するために使用します。