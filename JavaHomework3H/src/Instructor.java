
public class Instructor extends User{



	int courseCount;
	public  Instructor() {
		System.out.println("Instructor �al��t�");
	}
	
	public int getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
}
