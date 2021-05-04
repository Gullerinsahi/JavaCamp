package dayTwoWorkOne;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C#+Angular Kampý","Engin DEMÝROÐ","Kurs Programý","Tamamlandý" );
		Course course2 = new Course(2,"Java+React Kampý","Engin DEMÝROÐ","Kurs Programý","Tamamlandý");
		Course course3 = new Course(3,"Temel Kurs","Engin DEMÝROÐ","Kurs Programý","Tamamlandý");
		
		Course [] courses= {course1,course2,course3};
		for (Course course : courses) {
			
			System.out.println(course.coursename);
		}
		
		System.out.println(courses.length);
		
		Category category1 = new Category();
		category1.id =1;
		category1.coursename = "C#+Angular Kampý";
		
		Category category2 = new Category();
		category2.id =2;
		category2.coursename = "Java+React Kampý";
		
		Category category3 = new Category();
		category3.id =3;
		category3.coursename = "Temel Kurs";
		
		CourseManager CourseManager = new CourseManager();
		CourseManager.completed(course1);
		CourseManager.completed(course2);
		CourseManager.completed(course3);
         
		}

}
