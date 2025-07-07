package in.sp.beans;

public class Employees {
    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    private int EmpID;
    private String name;
    private String CompanyName;


    public void Display(){
        System.out.println("ID: " + EmpID);
        System.out.println("Name: " + name);
        System.out.println("Company Name: " + CompanyName);
    }

}
