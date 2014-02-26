// Write code for the shorten(String longPost) method.   
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten(String longPost) 
    {
        // YOUR CODE HERE
	String newPost = "";

	for (int i = 0; i < longPost.length(); i++) {
		String letter = longPost.substring(i,i + 1);
		if (!"aeiouAEIOU".contains(letter)) {
		//if (!"aeiouAEIOU".contains(longPost.substring(i,i + 1))) {
			newPost = newPost + letter;
			//newPost = newPost + longPost.substring(i,i + 1);
		}
	}
	return newPost;
    }
}
