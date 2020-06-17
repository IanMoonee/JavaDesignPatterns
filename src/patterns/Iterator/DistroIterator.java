package patterns.Iterator;

public class DistroIterator implements CustomIterator {
    LinuxDistros[] linuxDistroList;
    int position = 0 ;

    public DistroIterator(LinuxDistros[] linuxDistroList)
    {
        this.linuxDistroList = linuxDistroList;
    }

    @Override
    public boolean hasNext() {
        if (position >= linuxDistroList.length || linuxDistroList[position] == null)
        {
            return false;
        }
        else
            return true;
    }

    @Override
    public Object next()
    {
        LinuxDistros linuxDistros = linuxDistroList[position];
        position += 1;
        return linuxDistros;
    }
}
