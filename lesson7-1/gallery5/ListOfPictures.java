// BlueJ project: lesson7/gallery5

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/degas1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/gaugin1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/monet1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/monet2.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/renoir1.jpg"));

        // Your code here
        int sum = 0;
        for(Picture pic : gallery) {
            sum = sum + pic.getWidth();
        }

        System.out.println("Sum of widths: " + sum);
    }
}
