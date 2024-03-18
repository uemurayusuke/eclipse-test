


package practice;

public class Task {
	
//	インスタンス変数
	private int date; 
	
//	インスタンス変数
	private String content; 
//	インスタンス変数
	private boolean done = false; 
	
//	初期化処理をしている。それがコントラクタ
	public Task(int date, String content) {
		// 引数で指定された値を代入
		this.date = date;
		this.content = content;
	}
	
	public void done() {
        System.out.println("タスク「" + content + "」を完了します。");
//        ここでtrueに変更してる
		done = true;
	}
	
	public void print() {
		if (done) {
			System.out.println(date + "のタスク「" + content + "」は完了しています。");
		} else {
			System.out.println(date + "のタスク「" + content + "」は未完了です。");
		}
	}	
}
