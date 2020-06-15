package patterns.Composite;
// leaf-class
public class FinancialDepartment implements Department {
    private int id;
    private String name;
    @Override
    public void printDepartmentName() {
        //getClass().getSimpleName() returns the simple name of the underlying class
        // as given in the source code.
        System.out.println(getClass().getSimpleName());
    }

    public FinancialDepartment(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
