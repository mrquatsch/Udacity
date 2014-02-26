//
// Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson.
// You can find the pictures required in in the bluej project
//

import java.util.ArrayList;

public class ShiftFirstToEnd
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/degas1.jpg"));
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/gaugin1.jpg"));
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/monet1.jpg"));
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/monet2.jpg"));
      gallery.add(new Picture("/Users/mike/Dropbox/Udacity/problem_set_6/pictures/renoir1.jpg"));

      // TODO Write code to shift the first picture (the one at index 0)
      // to the end of the array list and  display the pictures object in the modified list
      // horizontally
      gallery.add(gallery.size(), gallery.get(0));
      gallery.remove(0);
      int previousX = 10;
      for(Picture pic : gallery) {
          pic.translate(previousX, 0);
          previousX = pic.getMaxX() + 10;
          pic.draw();
      }
   }
}
