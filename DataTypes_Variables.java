public class DataTypes_Variables {
    void EmployeeInfo(){
        String EmployeeName;
        int EmployeeID;

        EmployeeName= "Sean_Munene";
        EmployeeID= 1234567 ;
        System.out.println("Employee Name: " + EmployeeName);
        System.out.println("EmployeeID: "+EmployeeID);

    }
    public static void main (String[]args) {
        DataTypes_Variables obj = new DataTypes_Variables();
        obj.EmployeeInfo();

    }
}