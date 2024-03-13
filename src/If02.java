
public class If02 {
	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした！");
			break;
		default:
			System.out.println("がんばろう！");
		}
		main2(args);
		main3(args);
		main4(args);
		
	}

enum Vals {
	EXCELLENT,
	GOOD,
	POOR,
};

public static void main2(String[] args) {
	Vals val = Vals.EXCELLENT;
//	Valsが3つの定数を持つ。
//	valという名前の列挙型の変数を宣言する
//	初期値としてEXCELLENTを代入している
	switch (val) {
	case EXCELLENT:
		System.out.println("よくできました！");
		break;
	case GOOD:
		System.out.println("ふつうでした！");
		break;
	default:
		System.out.println("がんばろう！");
	}
}

public static void main3(String[] args) {
	int distance = 12; // 例として12で初期化。他の数値でも良い
	if (distance <= 5) {
		System.out.println("とても近いです");
	} else if (distance <= 10) {
		System.out.println("近いです");
	} else if (distance <= 15) {
		System.out.println("遠いです");
	} else {
		System.out.println("とても遠いです");
	}
}

public static void main4(String[] args) {
	String week = "Sunday"; // 例としてSundayで初期化。
	switch (week) {
//	switch (式(変数や値))
	case "Sunday":
//	case 値:
		System.out.println("日曜日です");
		break;
	case "Monday":
		System.out.println("月曜日です");
		break;
	case "Tuesday":
		System.out.println("火曜日です");
		break;
	case "Wednesday":
		System.out.println("水曜日です");
		break;
	case "Thursday":
		System.out.println("木曜日です");
		break;
	case "Friday":
		System.out.println("金曜日です");
		break;
	case "Saturday":
		System.out.println("土曜日です");
		break;
	default:
		System.out.println("曜日ではありません");
	}
}



















}

//switch文の基本構文
//
//switch (式) {
//case 値:
//	ブロック(処理);
//	break;
//case 値:
//	ブロック(処理);
//	break;
//default:
//	ブロック(処理);
//}
//break文が処理されると、それ以降のcase文は評価されない。
//switch文の分岐処理を終了する。
//break文は使わないといけない。
//全てのcase文の値と一致しない場合、default内のブロックの処理が実行される。
//default分は必須ではない。
//「caseに一致しなければ何もしない」という処理を実現したい場合は書かなくて良いです。

