package patterns.Composite;
// leaf-class
public class SalesDepartment implements Department {
    private int id;
    private String name;
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public SalesDepartment(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }
}
