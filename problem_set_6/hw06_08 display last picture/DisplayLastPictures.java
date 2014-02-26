//
// Complete the given class to display the last picture in the array list
// The required pictures are in the Blluej project
//

import java.util.ArrayList;

public class DisplayLastPictures
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/problem_set_6/pictures/degas1.jpg"));
      gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/problem_set_6/pictures/gaugin1.jpg"));
      gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/problem_set_6/pictures/monet1.jpg"));
      gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/problem_set_6/pictures/monet2.jpg"));
      gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/problem_set_6/pictures/renoir1.jpg"));

      // TODO display the last picture in the array list
      // your code goes here
      gallery.get(gallery.size() - 1).draw();
   }
}
