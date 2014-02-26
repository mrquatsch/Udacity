// BlueJ project: lesson7/gallery6

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/degas1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/guigou1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/gaugin1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/monet1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/seurat1.jpg"));

        // Your code here
        int last = 0;
        Picture tallest = gallery.get(0);
        for(Picture pic : gallery) {
            if(pic.getHeight() > last) {
                tallest = pic;
            }
            last = pic.getHeight();
        }

        System.out.println("Tallest height: " + tallest.getHeight());
        tallest.draw();
    }
}
