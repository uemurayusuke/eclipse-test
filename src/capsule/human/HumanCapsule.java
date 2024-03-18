

package capsule.human;

public class HumanCapsule {
	
	private String name;
	private int age;

	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	getNameと定義する事で値が取得できる。
//	privateを使用したら、getNameにしないといけない。
	public String getName() {
//		System.out.を使用しない場合は、returnを使用するというニュアンスかな？
		return name;
	}

	
	public int getAge() {
		return age;
	}
}


