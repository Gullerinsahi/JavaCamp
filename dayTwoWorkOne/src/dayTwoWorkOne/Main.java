package dayTwoWorkOne;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C#+Angular Kamp�","Engin DEM�RO�","Kurs Program�","Tamamland�" );
		Course course2 = new Course(2,"Java+React Kamp�","Engin DEM�RO�","Kurs Program�","Tamamland�");
		Course course3 = new Course(3,"Temel Kurs","Engin DEM�RO�","Kurs Program�","Tamamland�");
		
		Course [] courses= {course1,course2,course3};
		for (Course course : courses) {
			
			System.out.println(course.coursename);
		}
		
		System.out.println(courses.length);
		
		Category category1 = new Category();
		category1.id =1;
		category1.coursename = "C#+Angular Kamp�";
		
		Category category2 = new Category();
		category2.id =2;
		category2.coursename = "Java+React Kamp�";
		
		Category category3 = new Category();
		category3.id =3;
		category3.coursename = "Temel Kurs";
		
		CourseManager CourseManager = new CourseManager();
		CourseManager.completed(course1);
		CourseManager.completed(course2);
		CourseManager.completed(course3);
         
		}

}
