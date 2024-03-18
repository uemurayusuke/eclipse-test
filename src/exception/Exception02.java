

package exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exception02 {
	public static void main(String[] args) {
		
		
		try {
//			例外が発生する可能性がある処理
//			try文は必ず記述する
			String allData = Files.readString(Paths.get("c:\\temp\\memo.txt"));
			System.out.println(allData);
		} 
//		catch (例外クラス 変数名)
		catch (IOException e) {
//			catchブロック(例外が発生した時に実行する処理)
			System.out.println("例外が発生");
//			finallyを記述しない場合は、catch文を記載する必要がある。
		} finally {
//			finallyブロック(例外発生の有無にかかわらず必ず実行する処理)
			System.out.println("プログラム終了");
		}
	}
}