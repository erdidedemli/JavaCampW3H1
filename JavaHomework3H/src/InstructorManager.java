
public class InstructorManager extends UserManager {

    public void login(Instructor instructor) {
        System.out.println(instructor.getUserName() + " adl� y�netici oturum a�t�");
    }

    public void Exit(Instructor instructor) {
        System.out.println(instructor.getUserName() + " adl� y�netici oturumu kapatt�");

    }

    public void ShowUsers�nfo(User[] users) {
        for (User user : users) {
            System.out.println("kullan�c� ad�: " + user.getUserName() + "\n"
                    + "isim: " + user.getFirstName() + "\n" + "soyisim: " +
                    user.getLastName() +
                    "\n" + "Mail: " + user.getEmail());
        }
    }
}
