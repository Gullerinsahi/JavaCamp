package dayThreeWorkTwo;


	public class Instructor extends User {

		private String createdCourse;

		public Instructor(int id, String firstName, String lastName, String createdCourse) {
			super(id, firstName, lastName);
			this.createdCourse = createdCourse;
		}

		public String getCreatedCourse() {
			return createdCourse;
		}

		public void setCreatedCourse(String createdCourse) {
			this.createdCourse = createdCourse;
		}

}
