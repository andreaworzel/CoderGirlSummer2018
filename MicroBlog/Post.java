package MicroBlog;

public class Post {
    private int postNumber;
    private static int nextPostNumber = 1;
    private String postContents;
    private String urlToReference;
    String newUserName;

    public Post(User userName, String postContents, String urlToReference) {
        this.postNumber = nextPostNumber;
        nextPostNumber++;
        this.postContents = postContents;
        this.urlToReference = urlToReference;
        this.newUserName = userName.getUserName();

    }

    public String getPost() {
        //String newUserName = userName.getUserName();
        String postInfo = newUserName + "\n" + postNumber + "\n" + postContents + "\n" + urlToReference + "\n";
        return postInfo;
    }
}
