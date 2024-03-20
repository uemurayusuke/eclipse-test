
package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
		
//		MobilePhoneインスタンス生成
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

//		Phoneインターフェースのフィールド(定数)を参照
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
//		Phoneインターフェースの抽象メソッドを実装したメソッドを呼び出し
		mobilePhone.call("99-8888-7777");
//		classTaskPictureメソッドの呼び出し
		Interface01.classTakePicture(mobilePhone);
	}

	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}
}
