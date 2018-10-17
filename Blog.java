package MicroBlog;
import java.util.ArrayList;
import java.util.Scanner;

public class Blog {
    public static ArrayList allUsers = new ArrayList();

    public static void addUser(User u) {
        //ArrayList allUsers = new ArrayList();
        allUsers.add(u);
    }

    public static void printUsers() {
        for (int i = 0; i < allUsers.size(); i++) {
            User u = (User) allUsers.get(i);
            System.out.println(i + ": " + u.getUserName());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean keepGoing = true;
        User currentUser = new User("", "Example", "", ""); //?

        while (keepGoing) {

            System.out.println("Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");
            System.out.println("You are currently user " + currentUser.getUserName() + ". What would you like to do?");
            String answer = keyboard.nextLine();

            if (answer.equals("1")) {
                currentUser = createUser();
                addUser(currentUser);
            } else if (answer.equals("2")) {
                printUsers();
                System.out.println("Which user would you like to become? ");
                int userChoice = keyboard.nextInt();
                keyboard.nextLine();
                currentUser = (User) allUsers.get(userChoice);
            } else if (answer.equals("3")) {
                currentUser.getLastPost();
                System.out.println();
                Post newPost = createPost(currentUser);
                currentUser.add(newPost);
            } else if (answer.equals("4")) {
                for(int i = 0; i < allUsers.size(); i++){
                    currentUser = (User) allUsers.get(i);
                    currentUser.printAllPosts();
                }
            } else if (answer.equals("5")){
                for(int i = 0; i < allUsers.size(); i++){
                    currentUser = (User) allUsers.get(i);
                    System.out.println(currentUser.getUserInfo());
                }
            } else if (answer.equals("quit")) {
                keepGoing = false;
            } else {
                System.out.println("Sorry, invalid option:");
            }
        }

    }




    public static User createUser(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the URL to your avatar picture: ");
        String urlToPic = keyboard.nextLine();
        System.out.println("Please enter your username: ");
        String userName = keyboard.nextLine();
        System.out.println("Please enter your full name: ");
        String fullName = keyboard.nextLine();
        System.out.println("Please enter your email address: ");
        String email = keyboard.nextLine();
        User newUser = new User(urlToPic, userName, fullName, email);
        return newUser;
    }

    public static Post createPost(User u){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter contents of your post: ");
        String postContents = keyboard.nextLine();
        System.out.println("Enter url to reference: ");
        String urlToReference = keyboard.nextLine();
        Post newPost = new Post(u, postContents, urlToReference);
        return newPost;
    }
}
