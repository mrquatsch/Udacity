// BlueJ project: lesson7/gallery8

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

        int i = 0;
        boolean found = false;
        while (!found && i < gallery.size())
        {
            if(gallery.get(i).getHeight() > gallery.get(i).getWidth()) {
                found = true;
            } else {
                i++;
            }
        }

        if (found)
        {
            gallery.get(i).draw();
        }
    }
}
