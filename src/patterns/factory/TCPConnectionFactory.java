package patterns.factory;

public class TCPConnectionFactory
{
    public static TCPConnection getInstance(String connection_type)
    {
        switch (connection_type)
        {
            case "Windows":
                return new TCPWindows();
            case "Unix":
                return new TCPUnix();
            default:
                return null;
        }
    }
}
