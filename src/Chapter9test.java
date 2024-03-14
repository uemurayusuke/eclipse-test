
public class Chapter9test {
	
	public static void main(String[] args) {
		
//         下記は、ループ処理で、九九の左辺の数値を決定
        for (int i = 1; i < 10; i++) {
        	
//             下記は、ループ処理で、九九の右辺の数値を決定
//        	1行目のforの1に対して、
//        	2行目は9を超えるまで繰り返す。というコード
            for (int j = 1; j < 10; j++) {
            	
                // 左辺と右辺の掛け算を実施。改行なし(System.out.print)で出力
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            // 九九の1段ごとに、改行を出力
            System.out.println();
        }
        
        main2(args);
        
    }
	
	
	public static void main2(String[] args) {
        int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
        
//        gcd(a, b)は2つの整数aとbの最大公約数を計算し、その結果を出力する。
        
    }

    // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
        // b(余り)が0になった時のaが最大公約数
        if (b == 0) {
            return a;
        }
        // 再帰呼び出し
        return gcd(b, a % b);
    }
	
//	gcdメソッドは、ユークリッドの互除法を使用して最大公約数を計算する。
//	ユークリッドの互除法は、2つの整数の最大公約数を求める効率的なアルゴリズム。
	
//    最大公約数は、120個と100個なら、最大公約数は20
    
	
	
	
	

}





//System.out.print
//System.outはJavaの標準出力ストリームを介して、文字列や値を出力するためのメソッド。
//System.outは、出力するメソッド。
//System.out.print
//出力する、かつ、printをつける事で、出力される内容が同じ行に表示される。
//つまり、改行されない。
//Hello,world,yusuke,uemura
//上記のように、改行されない。

//System.out.println
//printlnメソッドの場合は、改行する。
//つまり、
//Hello
//world
//yusuke
//uemura
//上記のように、改行される。
//
//printとprintlnの違いは、改行されるかどうかの違い。

