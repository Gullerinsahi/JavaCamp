package dayThreeWorkTwo;

public class UserManager {
	

		public void Login(User user) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " Giriþ yapýldý ");
		}

		public void Logout(User user) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " Çýkýþ yapýldý");
		}

}
