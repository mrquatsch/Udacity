//
// Complete the given class to display the picture object vertically
// (rather than horizontally).
// You can find the pictures required in the bluej project
//

import java.util.ArrayList;

public class ListOfVerticalPictures
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/degas1.jpg"));
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/gaugin1.jpg"));
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/monet1.jpg"));
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/monet2.jpg"));
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/renoir1.jpg"));

      // your code goes here
      // TODO Write the code to display the pictures vertically
      int previousHeight = 10;
      for(Picture pic : gallery) {
          pic.translate(0, previousHeight);
          previousHeight = pic.getMaxY() = 10;
          pic.draw();
      }
   }
}
