package dayTwoWorkOne;

public class Course {
	
	public Course() {
		System.out.println("Bitir ve Devam Et");
	}
	public Course(int id,String coursename, String educator, String courseProgram, String completed) {
		  this();
		  this.id = id;
		  this.coursename = coursename;
		  this.educator = educator;
		  this.courseProgram = courseProgram;
		  this.completed =completed;
	}
	int id;
	String coursename;
	String educator;
	String courseProgram;
	String completed;
}
