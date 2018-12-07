public class Game {
	public static void main(String[] args) {
		int computerNumber = 45;
		int userNumber = 50;

		while (userNumber != computerNumber) {
			if (userNumber > computerNumber) {
				System.out.println("Число пользователя больше");
				userNumber--;
			} else if (userNumber < computerNumber) {
				System.out.println("Число пользователя меньше");
				userNumber++;
			} else if (userNumber == computerNumber) {
				System.out.println("вы угадали");
				break;
			}
		}		
	}
}