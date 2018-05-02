import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class User{
    public String avatar;
    public String username; //
    public String firstname;
    public String lastname;
    public String email;
    public ArrayList posts = new ArrayList();


    public void addPost(Post p){
        posts.add(p);
    }


    public User(){
        setUser();
    }


    public void setUser(){
        Scanner keyboard = new Scanner(System.in);
        out.println("What is the users avatar url? ");
        this.avatar = keyboard.nextLine();
        out.println("What is the username? ");
        this.username = keyboard.nextLine();
        out.println("What is the users first name? ");
        this.firstname = keyboard.nextLine();
        out.println("What is the users last name? ");
        this.lastname = keyboard.nextLine();
        out.println("What is the users email address? ");
        this.email = keyboard.nextLine();
    }
}