
public class If02 {

	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + " は５未満です");
		} else if (number < 10) {
			System.out.println(number + " は５以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + " は10以上、１５未満です");
		} else {
			System.out.println(number + "　は15未満ではないです");
		}
	}

}
