package day3WorkTwo;

public class Main {

	public static void main(String[] args) {
		
		
		Student rosenist=new Student();
		rosenist.setId(1);
		rosenist.setFirstName("G�l�ah");
		rosenist.setLastName("G�l");
		rosenist.setEmail("gullerinsahi@gmail.com");
		rosenist.setCoursesAttended("Java");
		
		System.out.println("*****************************");
		
		
        Instructor engin = new Instructor();
        engin.setId(1);
        engin.setFirstName("Engin");
        engin.setLastName("Demiro�");
        engin.setEmail("engindemirog@gmail.com");
        String[] courses= {"Java+React","C#+Angular","Programlamaya giri� i�in temel kurs"};
        engin.setCourses(courses);
        
       
        
        
        InstructorManager �nstructor =new InstructorManager();
        �nstructor.add(engin);
        StudentManager student =new StudentManager();
        student.add(rosenist);
        
        System.out.println(rosenist.getCoursesAttended());
        
        
        
        
        System.out.println("*****************************");
	}
	

}
