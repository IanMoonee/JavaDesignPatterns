package patterns.Iterator;

public class DistributionBox
{
    DistroCollection distroCollection;

    public DistributionBox(DistroCollection distroCollection)
    {
        this.distroCollection = distroCollection;
    }

    public void printAllDistros()
    {
        CustomIterator iterator = distroCollection.createIterator();
        System.out.println("[+] LINUX DISTROS [+]");
        while ( iterator.hasNext())
        {
            LinuxDistros ln = (LinuxDistros)iterator.next();
            System.out.println(ln.getDistroName());
        }
    }
}
