package MicroBlog;

import java.util.ArrayList;

public class User {

    private String urlToPic;
    private String userName;
    private String fullName;
    private String email;
    public ArrayList posts = new ArrayList();

    public User(String urlToPic, String userName, String fullName, String email) {
        this.urlToPic = urlToPic;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
    }

    public String getUserInfo() {
        String prettyName = userName;
        String userInfo = urlToPic + "\n" + userName + "\n" + fullName + "\n" + email + "\n";
        return userInfo;

    }
    public String getUserName() {
        return userName;
    }

    public void add(Post p) {
        posts.add(p);
    }

    public void getLastPost() {
        if(posts.size() > 0){
            Post p = (Post) posts.get(posts.size() - 1);
            System.out.println(p.getPost());
        }
    }

    public void printAllPosts(){
        for (int i = 0; i < posts.size(); i++){
            Post p = (Post) posts.get(i);
            System.out.println(p.getPost());

        }
    }


}
