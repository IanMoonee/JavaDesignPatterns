package patterns.proxy;

public class RealNode implements Node
{
    private String ip_address;

    public RealNode(String ip_address)
    {
        this.ip_address = ip_address;
    }

    @Override
    public void displayNodeIp()
    {
        System.out.println(ip_address);
    }

}
