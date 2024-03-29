// group 4 IT 103 computer programming 2
// Members: Wilson Co, Leoncio Pineda,
package first;

import java.util.Date;
import java.util.Scanner;

public class Employee {

    private String name;
    private int employee_id;
    private Date dob;
    private String address;
    private String contact_number;
    private String position;
    private int sl_Credits;
    private int vl_Credits;
    
    // default constructor
    public Employee() {
        this.name = null;
        this.employee_id = 0;
        this.dob = null;
        this.address = "";
        this.contact_number = "";
        this.position = "";
        this.sl_Credits = 5;
        this.vl_Credits = 5;
        //standard sl and vl credits here in the Philippines, although it's management perogative and distinct per company.
        
    }
    
    public Employee (String name, int id, Date dob, String address, String number,
            String position, int sl_Credits, int vl_Credits) {
        this.name = name;
        this.employee_id = id;
        this.address = address;
        this.contact_number = number;
        this.position = position;
        this.sl_Credits = sl_Credits;
        this.vl_Credits = vl_Credits;
    }
    

    // getters

    public String getName() {
        return name;
    }
    
    public int getId() {
        return employee_id;
    }
    
    public Date getDate() {
        return dob;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getContactNumber() {
        return contact_number;
    }
    
    public String getPosition() {
        return position;
    }
    
    public int getSlCredits() {
        return sl_Credits;
    }
    
    public int getVlCredits() {
        return vl_Credits;
    }
    
    //setters
    //public Employee (String name, int id, Date dob, String address, String number,
    //        String position, int sl_Credits, int vl_Credits)

    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(int id ) {
        this.employee_id = id;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setNumber(String number) {
        this.contact_number = number;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public void setSlCredits(int sl) {
        this.sl_Credits = sl;
    }
    
    public void setVlCredits(int vl) {
        this.vl_Credits = vl;
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
       // @SuppressWarnings("resource")
        //Scanner user_input = new Scanner(System.in);
        //System.out.println("Enter the employee's name");
        
        //String employee_name = user_input.nextLine();
        //Employee firstEmployee = new Employee();
        //firstEmployee.setName(employee_name);
        //System.out.println(firstEmployee.getName());

    }

}