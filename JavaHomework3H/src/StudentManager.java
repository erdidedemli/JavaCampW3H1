
public class StudentManager extends UserManager{
	
	   public  void CourseRegistered(Student student){

	        System.out.println( student.getUserName() +":kursa kay�t yap�ld�");
	    }

	    public void exit(Student student){
	
	        System.out.println( student.getUserName() +":��k�� yap�ld�");
	    }



}
