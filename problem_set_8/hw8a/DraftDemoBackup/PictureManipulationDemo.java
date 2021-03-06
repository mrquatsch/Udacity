
public class PictureManipulationDemo
{
    public static void main(String[] args)
    {
        final int SPACER = 10;
        Picture pic = new Picture("/Volumes/Data/git/Udacity/ps8/hw8a/draft_files/renoir1.jpg");
        pic.draw();
        Picture flipped = PictureUtil.grayAndFlipLeftToRight(pic);
        flipped.translate(pic.getWidth() + SPACER, 0);
        flipped.draw();
        Picture rotated =  PictureUtil.grayAndRotate90(pic);
        rotated.translate(2 * pic.getWidth() + 2 * SPACER, 0);
        rotated.draw();
    }


}