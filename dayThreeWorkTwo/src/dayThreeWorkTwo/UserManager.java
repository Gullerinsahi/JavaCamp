package dayThreeWorkTwo;

public class UserManager {
	

		public void Login(User user) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " Giri� yap�ld� ");
		}

		public void Logout(User user) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " ��k�� yap�ld�");
		}

}
