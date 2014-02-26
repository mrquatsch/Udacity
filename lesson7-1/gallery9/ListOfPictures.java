// BlueJ project: lesson7/gallery9

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/degas1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/monet1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/monet2.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/renoir1.jpg"));
        gallery.add(new Picture("/Users/msterry/Dropbox/Udacity/lesson7-1/gallery5/seurat1.jpg"));

        ArrayList<Picture> matches = new ArrayList<Picture>();
        for(Picture pic : gallery) {
            if(pic.getHeight() > pic.getWidth()) {
                matches.add(pic);
            }
        }

        int rightmostX = 0;
        for (Picture pic : matches)
        {
            pic.translate(rightmostX + 10, 0);
            rightmostX = pic.getMaxX();
            pic.draw();
        }
    }
}
