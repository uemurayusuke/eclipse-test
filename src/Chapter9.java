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
//	        argsにはコマンド入力した物が入る。
	        main3(args);
	        main4(args);
	        main5(args);
	        main6(args);
	        main7(args);
	        
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
    
    
    
    public static void main3(String[] args) {
    	
    	
    	
        for (int number = 1; number <= 5; number++) {
//        	for文
//        	初期化式でnumberを1で初期化
//        	条件式でnumberが5未満の場合、ブロックの処理を行う
//        	変化式でブロックの処理後に、numberをインクリメント
        	
//        	まとめ
//        	初期化式でnumberを1で初期化
//        	numberが5未満の場合、ブロック処理を行う条件式
//        	ブロック処理は、出力する処理
//        	その後に、変化式で、numberをインクリメント
//        	インクリメントは、数値を1つ増やす操作を指す。
//        	インクリメント演算子をが使用される。
//        	"++"が使用される1つ増やすという意味。
        	
            System.out.println("For01 = " + number);
        }
    }
    
//    for (初期化式; 条件式; 変化式) {
//    	ブロック(繰り返し処理)
//    }
    
    
        public static void main4(String[] args) {
            int[] array = { 1, 2, 3, 4, 5 };
//            配列の要素を順番にnumberに代入し、要素分繰り返す
//            int型の配列 arrayを宣言している。
//            変数の前に型がきてるだけ。
//            int[]が型
//            arrayが変数
//            この配列には、1〜5までの整数が格納されている
            
            for (int number : array) {
//            	for (要素の型 変数名 : 反復可能なオブジェクト)
//            		int型の変数numberを使って、配列arrayの各要素に順番にアクセスする。
//            	intが型
//            	numberが変数名
//            	arrayが配列やコレクションの変数
                System.out.println("For02 = " + number);
            }
        }
            
        
            
            
           
                public static void main5(String[] args) {
                    for (int count = 0; count < 5; count++) {
                        if (count == 2) {
                        // countが2の場合、for文を終了
                            break;
                        }
                        System.out.println("Break01 = " + count);
                    }
                }
                
                
                    public static void main6(String[] args) {
                        for (int count = 0; count < 5; count++) {
                            if (count == 2) {
                            // countが2の場合、この後の処理をスキップ
//                            	スキップするのは、
//                            	System.out.println("Continue01 = " + count);だけ
//                            	追加式はスキップしない。
                           
                            	
                            continue;
                        }
                            System.out.println("Continue01 = " + count);
                        }
                    }
                    
                    
                    
                    
                        public static void main7(String[] args) {
                            int number = 1;
                            printNum(number);
                            
//                            printNumメソッド
//                            与えらた数値を２倍にして出力する
//                            数値を2倍にし続ける処理を行う。
                        }

                        public static int printNum(int number) {
//                        	staticの後のintは、戻り値の型がintである事を示す。                        	
//                        	これは、printNumという名前のメソッドを定義している
//                        	int型の引数numberを取り、int型の値を返す。
                        	
                            if (number < 50) {
                                number *= 2;
                                System.out.println("While01 = " + number);
                                // 条件にマッチしたら自分自身を再度呼び出す
                                printNum(number);
                            }
                            return number;
                        }
                        
//                        このコードでやってること、1から始まる数値を2倍にして出力し続け、その結果が50を超えるまで
//                        繰り返す。
                        
                       
                        
                        
                   
                
                    
                
            
        
//        拡張for文の基本構文
//        
//        for (型 変数名:配列やコレクションの変数) {
//        	ブロック(繰り返し処理)
//        }   
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
//条件式が最初にくるから、1番目でfalseだった場合は、繰り返し処理が実行されない。

//do-while文の基本構文
//do {
//	ブロック(繰り返し処理)
//} while (条件式);
//
//条件式が先にくるか後にくるかの違いしかない気がする。
//条件式が後に来るから、最低1回は繰り返し処理を行う。


//for文
//whileと同じように指定の条件が「true」の間、繰り返し処理を行う制御文
//そこは同じ。
//違いは、
//指定した回数分ループして処理を行いたい時に使用する。

//拡張for文

//配列やコレクションの全要素に対して、繰り返し処理を行う制御文
//コレクションとは、複数の要素をまとめて管理するためのデータ構造です。
//配列などは、コレクションに含まれる。


//break文
//ループ処理の途中でループ処理を終了させたい場合に使用する制御文

//continue文
//ループ処理の途中でその後の処理をスキップして、
//ループ処理の最初から実行させたい場合に使用する制御文。


//再帰処理




























