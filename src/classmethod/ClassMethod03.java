

package classmethod;

import classmethod.human.Human03;

public class ClassMethod03 {
	
	
//	staticを付けたものを、「静的メンバー」と呼ぶ。
	
	public static void main(String[] args) {
//		インポートした内容を使用している
		Human03 yamada = new Human03();

		System.out.println("私の名前は、" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");
		
		
//		Human03で定義したgreetメソッドを使用している。
		yamada.greet("田辺");
		yamada.greet(null);
	}
	

}
