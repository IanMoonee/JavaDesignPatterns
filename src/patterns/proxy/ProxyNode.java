package patterns.proxy;


public class ProxyNode implements Node
{
    private RealNode real_node;
    private String ip_address;

    public ProxyNode(String ip_address)
    {
        this.ip_address = ip_address;
    }

    @Override
    public void displayNodeIp()
    {
        if ( real_node == null)
        {
            real_node = new RealNode(ip_address);
        }
        real_node.displayNodeIp();
    }

}
