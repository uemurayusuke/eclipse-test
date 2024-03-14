public class Chapter9 {
	
//	while文とは、指定の条件が「true」の間、繰り返し処理を行う制御文。
	
	
	    public static void main(String[] args) {
//	    	argsは変数名、他の名前に変更する事も可能。
//	    	String[] args　
//	    	String配列を引数として受け取る
//	    	(例)
//	    	java MyClass arg1 arg2 arg3
//	    	arg1,arg2,arg3という値が格納される。
//	    	args配列という名前で格納される。
//	    	つまり、
//	    	args配列として、["arg1","arg2","arg3"]という値が格納された。
	    	
	        int number = 1;
	        while (number < 50) {
	            number *= 2;
	            System.out.println("While01 = " + number);
	        }
	        main2(args);
	    }

//while (条件式) {
//	ブロック(繰り返し処理)
//}
//条件式で失敗したら、また、同じ条件式に戻る。

//public class While01 {
//    public static void main(String[] args) {
//        int number = 1;
//        // while文：ループ開始
//        // numberが50未満の場合、ブロックの処理を行なう
//        while (number < 50) {
//        // ブロック：
//        // numberにnumber * 2 を代入して、numberを出力
//        number *= 2;
//            System.out.println("While01 = " + number);
//        }
//    }
//}
//ブロック内の処理が完了した後に、再度、条件式を評価して結果が「false」になるまで、ブロック内の処理を
//ループして実行します。

//do-while文
//while文の違いは何？
//繰り返し文に関しては、trueの間は繰り返す。
//falseになれば終了するという事。


    public static void main2(String[] args) {
        int number = 1;
        
        do {
        	number *= 2;
        	System.out.println("DoWhile01 = " + number);
//        	1に2を掛ける
//        	その結果を出力する。
        } while (number < 50);
//        50未満の数字なら、繰り返すって事やな。
    }
}

//do-while文の基本構文
//do {
//	ブロック(繰り返し処理)
//}while (条件式);

//whileの基本構文
//while文 (条件式){
// ブロック(繰り返し処理)
//}
//
//do-while文の基本構文
//do {
//	ブロック(繰り返し処理)
//} while (条件式);
//
//条件式が先にくるか後にくるかの違いしかない気がする。

































