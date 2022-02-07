

public class employee{
    private int eno;
    private String ename

    //default constructor
    public employee()
    {
        eno = 0;
        ename = "";
    }

    //mutator method
    public void setvalue(int n, String name)
    {
        eno = n;
        ename = name;
    }

    public void getvalue()
    {
        System.out.println("Employee No : ");
        System.out.println(eno);
        System.out.println("Employee Name : ");
        System.out.println(name);
    }

}


public class classes
{
    public static void main(String[] args)
    {
        employee e = new employee();
        e.setvalue(1001,"Surendhar");
        e.getvalue();
    }
}