

package extend.animal;
//                         スーパークラス
public class Dog extends Animal {

	public Dog() {
		this.name = "犬";
	}

//	抽象クラスの中身
	public void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}
}