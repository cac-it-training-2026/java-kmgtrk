package basic.question05;

import java.io.IOException;

/**
 * 第8章 条件分岐
 */

public class Question05_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		System.out.println("年齢を入力してください。");
		int age = 10;
		if (age < 20) {
			System.out.println("20歳未満なので、お酒の提供ができません。");

		} else {
			System.out.println("20歳以上なので、お酒の提供をすることが可能です。");

		}
	}
}