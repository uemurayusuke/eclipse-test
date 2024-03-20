

package extend;

//アニマルはインポートしなくていいのか？
//ドッグだけインポートしてる
import extend.animal.Dog;

public class Abstract01 {
	public static void main(String[] args) {

		Dog dog = new Dog();
		
//		eatはAnimalクラスのメソッドやな
		dog.eat();
		dog.cry();
	}
}