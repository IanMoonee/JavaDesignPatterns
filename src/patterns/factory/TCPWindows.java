package patterns.factory;

public class TCPWindows implements TCPConnection
{
    // We should override each method of TCPConnection as TCPConnection is the interface!!
    @Override
    public void connect()
    {
        System.out.println("Windows tcp connection established.");
    }

}
