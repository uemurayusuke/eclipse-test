
package practice;

public class Chapter16 {

	public static void main(String[] args) {
		
//		5つのサブクラスのインスタンスを生成
//		5つの異なるサブクラスのインスタンスを生成し、それらをHuman型の配列に格納しています。
		Human[] humans = new Human[] {
				new Student(), 
				new Programmer(), 
				new Driver(), 
				new Teacher(), 
				new Doctor(), 
			};
		
		

//		forループを使って、配列内の各Humanインスタンスに対してworkメソッドを呼び出している
		
		for (Human h : humans) {
			
//			workメソッドを呼び出す
			h.work();
            // instanceof演算子でProgrammerかどうか判定
			if (h instanceof Programmer ) {
                // キャストしつつメソッドを呼び出す
				((Programmer)h).study();
			}
		}
	}
}