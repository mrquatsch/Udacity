// BlueJ project: lesson7/gallery7
//Find the number of pictures in the ArrayList whose height is bigger than their width (portrait pictures)


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
        int count = 0;
        for(Picture pic : gallery) {
            if(pic.getHeight() > pic.getWidth()) {
                count++;
            }
        }

        System.out.println("Pictures with portrait orientation: " + count);
    }
}
