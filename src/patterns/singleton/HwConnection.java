package patterns.singleton;

/* An example of a hardware connection( e.g mouse connection )
We want to have only 1 hardware connection (mouse - keyboard).
 */
public class HwConnection
{
    private static HwConnection instance = null;

    private HwConnection() {}

    public static HwConnection getInstance()
    {
        if (instance == null)
        {
            instance = new HwConnection();
        }
        else
        {
            System.out.println("Device is already connected!");
        }
        return instance;
    }
}
