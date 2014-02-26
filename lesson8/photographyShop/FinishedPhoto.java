// Optional
// Does your design use FinishedPhoto objects?
// If so, fill in this class with your code.

public class FinishedPhoto
{
    private String photo;
    private String signature;

    public FinishedPhoto(String photoFileName, String signature)
    {
        this.photo = photoFileName;
        this.signature = signature;
    }

    public String getPhoto()
    {
        return photo;
    }

    public String getSignature()
    {
        return signature;
    }
}
