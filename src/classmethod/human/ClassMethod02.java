

package classmethod.human;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Human02 sato = new Human02("佐藤", 25);
		System.out.println("名前" + sato.name + "で、年齢は" + sato.age + "です。");
	}

}

//メソッドが戻り値を返さない場合は、「戻り値の型」に「void」を指定します。
//引数がない場合は()の中に何も書きません。
