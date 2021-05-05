package dayThreeWorkTwo;


	public class Student extends User {

		private String courseName;

		public Student(int id, String firstName, String lastName, String courseName) {
			super(id, firstName, lastName);
			this.courseName = courseName;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
}
