package patterns;
import patterns.Composite.Department;
import patterns.Composite.FinancialDepartment;
import patterns.Composite.HeadDepartment;
import patterns.Composite.SalesDepartment;
import patterns.Iterator.DistributionBox;
import patterns.Iterator.DistroCollection;
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


        //Composite Pattern Implementation

        Department salesDep = new SalesDepartment(1, "Sales Department");

        Department financialDep = new FinancialDepartment(2, "Financial Department");

        HeadDepartment headDep = new HeadDepartment(3, "Head Department");

        headDep.addDepartment(salesDep);
        headDep.addDepartment(financialDep);
        headDep.printDepartmentName();
        // TODO : add an implementation of Singleton design pattern with Enum and add it to gitHub.

        // Implementation of Iterator pattern
        DistroCollection distroCollection = new DistroCollection();
        DistributionBox distributionBox = new DistributionBox(distroCollection);
        distributionBox.printAllDistros();

    }
}
