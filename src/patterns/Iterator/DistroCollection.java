package patterns.Iterator;

public class DistroCollection implements Collection
{
    LinuxDistros[] linuxDistroList;
    static final int max_distros = 100;
    int numberOfDistros = 0;

    public DistroCollection()
    {
        linuxDistroList = new LinuxDistros[max_distros];
        addDistro("Fedora");
        addDistro("Ubuntu");
        addDistro("OpenSUSE");
    }

    public void addDistro(String distroName)
    {
        LinuxDistros linuxDistros = new LinuxDistros(distroName);
        if ( numberOfDistros >= max_distros)
        {
            System.err.println("Full of random distributions");
        }
        else
        {
            linuxDistroList[numberOfDistros] = linuxDistros;
            numberOfDistros = numberOfDistros + 1;
        }
    }

    public CustomIterator createIterator()
    {
        return new DistroIterator(linuxDistroList);
    }
}
