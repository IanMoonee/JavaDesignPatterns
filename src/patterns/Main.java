package patterns;
import patterns.factory.TCPConnection;
import patterns.factory.TCPConnectionFactory;
import patterns.proxy.Node;
import patterns.proxy.ProxyNode;
import patterns.singleton.HwConnection;

public class Main {

    public static void main(String[] args)
    {
        // Factory Pattern Implementation

        TCPConnection tcp_connection = TCPConnectionFactory.getInstance("Unix");
        tcp_connection.connect();

        // Singleton Pattern Implementation
        HwConnection hw_connection = HwConnection.getInstance();

        // the object below cannot be created because we already have one open connection!
        HwConnection hw_connection2 = HwConnection.getInstance();

        //Proxy pattern Implementation
        Node node = new ProxyNode(("192.168.1.1"));
        node.displayNodeIp();
        node.displayNodeIp();
        node.displayNodeIp();
    }
}
