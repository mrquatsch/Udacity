public class test {

    public static void main(String[] args)
    {
	String post = "This is a test";
        String reversePost = "";
	//System.out.println(post.length());
        for (int i = post.length(); i > 0; i--)
        {
		reversePost = reversePost + post.substring(i-1, i);
		//System.out.println(post.substring(i-1, i));
        }
        System.out.println(reversePost);
    }
}
