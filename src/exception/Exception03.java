

package exception;

public class Exception03 {
	
	
	public static void main(String[] args) {
		try {
//			divisionメソッドを呼び出し
			Exception03.division(100, 0);
//			ArithmeticExceptionクラスの例外が発生した場合の例外処理
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException例外が発生");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("プログラム終了");
	}

	public static void division(int a, int b) {
		System.out.println(a + " ÷ " + b + " は？");
		if (b == 0) {
//			例外インスタンスを生成してスロー
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
	

}

//例外インスタンスをスロー
//throw 例外インスタンス;


//throw文は、意図的に例外を発生させたい場合に使用します。
//スタックトレースとは、例外が発生するまでにメソッドがどのような順序で呼び出されているかが
//記録されたものです。
