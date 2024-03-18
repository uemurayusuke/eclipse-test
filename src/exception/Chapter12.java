
package exception;

import java.sql.SQLException;

public class Chapter12 {
	public static void main(String[] args) {

		try {
			int array[] = { 1, 3, 5 };
			Chapter12.validIndex(array, 2);
			Chapter12.validIndex(array, 3);

			// Exceptionが発生しない場合は出力される
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			// スタックトレースを出力
			e.printStackTrace();
		}

		// tryを記述
		// ・throwSQLExceptionメソッドを呼び出す
		// catchを記述
		// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		try {
			// ・throwSQLExceptionメソッドを呼び出す
			Chapter12.throwSQLException();
		} catch (SQLException e) {
			// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		} finally {
			// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
			// 例外発生しても出力するため、finallyブロックに記述
			System.out.println("throwSQLExceptionの呼び出し終了");
		}

		System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	// ・サイズの範囲外なら、IllegalArgumentExceptionをthrow
	public static void validIndex(int[] array, int index) {
		if (array.length <= index) {
			throw new IllegalArgumentException(index + " はサイズの範囲外です");
		}
		System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
	}

	// スローされる例外が検査例外なので、throws文が必要
	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
		throw new SQLException("SQLエラーです");
	}
}