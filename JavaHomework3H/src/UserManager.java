
public class UserManager {

    public  void  add (User user){
        System.out.println( user.getUserName() + " adl� kullan�c� eklendi");
    }

    public void  addMultiple(User[] users) {
        for (User user : users) {
            System.out.println("Kullan�c�lar eklendi: " + user.getFirstName());
        }
    }
}
