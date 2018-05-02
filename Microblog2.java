import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.System.out;

public class Microblog2 {
    static String currentusername = "unknown";
    static User currentuser;
    static Post post;
    static String postContent;
    static String postSiteLink;
    static int id = 10;
    static Iterator it;


    public static void displayMenu(String currentuser) {
        out.println("Main Menu");
        out.println("1)  Create a new user");
        out.println("2)  Become an existing user");
        out.println("3)  Create a post as the current user");
        out.println("4)  Print all posts");
        out.println("5)  Print all users");
        out.println("You are currently user " + currentusername + " What would you like to do? ");
    }


    public static void existingUsers(ArrayList<User> users){
        out.println("Here is the list of current users: ");
        for(int x=0; x < users.size(); x++){
            out.print(x + ". ");
            out.println(users.get(x).username);
        }
    }


    public static void printPosts(ArrayList<User> users) {
        for(int x = 0; x < users.size(); x++)
        {
            if (users.get(x).username != null){
                out.println(users.get(x).avatar + " " + users.get(x).username + ": ");
                it = users.get(x).posts.iterator();
                while(it.hasNext()){
                    post = (Post)it.next();
                    out.println(post.content + " " + post.siteLink);
                }
            }
        }
    }

    public static void displayUsers(ArrayList<User> users){
        for(int x=0; x < users.size(); x++){
            out.println(users.get(x).avatar + " " + users.get(x).username + " " + users.get(x).firstname + " " +
                    users.get(x).lastname + " " + users.get(x).email + " ");
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        ArrayList<User> users = new ArrayList();
        int count = 0; // counter for user array

        while (choice != 9)
        {
            displayMenu(currentusername);
            choice = keyboard.nextInt();

            if (choice == 1) {
                users.add(new User());
                currentusername = users.get(count).username;
                currentuser = users.get(count);
                count++;

            } else if (choice == 2) {
                if(currentusername == "unknown"){
                    out.println("No users have been created. Please create a user first.");
                }
                else {
                    existingUsers(users);
                    out.println("Enter the number of your username: ");
                    int y;
                    y = keyboard.nextInt();
                    currentusername = users.get(y).username;
                    currentuser = users.get(y);
                }

            } else if (choice == 3) {
                if(currentusername == "unknown"){
                    out.println("No users have been created. Please create a user first.");
                }
                else {
                    out.println("Enter your post content: ");
                    keyboard.skip("\n");
                    postContent = keyboard.nextLine();

                    out.println("Enter your post sitelink: ");
                    postSiteLink = keyboard.nextLine();
                    keyboard.skip("\n");

                    post = new Post(postContent, postSiteLink);
                    out.println("content: " + post.content + " " + "link: " + post.siteLink);
                    currentuser.addPost(post);
                    id++;
                }
            } else if (choice == 4) {
                printPosts(users);
            } else if (choice == 5) {
                displayUsers(users);
            } else {
                //  exit;
            }
        }
    }
}