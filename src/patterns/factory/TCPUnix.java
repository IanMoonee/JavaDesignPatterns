package patterns.factory;

public class TCPUnix implements TCPConnection
{
    // We should override each method of TCPConnection as TCPConnection is the interface!!
    @Override
    public void connect()
    {
        System.out.println("Unix tcp connection established.");
    }

}
