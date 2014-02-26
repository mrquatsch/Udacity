    public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 60, 90);
        //box.draw();
        System.out.println(box.getX());
        System.out.println(box.getWidth());
        box.translate(25, 40);
        System.out.println(box.getX());
        System.out.println(box.getWidth());
        box.draw();
        Rectangle box2 = box;
        box2.translate(100,100);
        System.out.println(box2.getX());
        box2.draw();
    }
}

/*public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle boxTop = new Rectangle(60,90,20,30);
        boxTop.draw();
        Rectangle boxBottom = new Rectangle(80,120,20,30);
        boxBottom.draw();
    }
}*/