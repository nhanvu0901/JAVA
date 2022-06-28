package Model;

public class Employee extends Person{ // tao mot giao dien co the them thong tin ve nguoi dang lam tai sieu thi
    protected int employee_id;
    protected String employee_password;
    protected String employee_job;
    protected String employee_shift;

    public Employee(int employee_id, String employee_name, String employee_gender, String employee_gmail, String employee_password, String employee_job, String employee_shift) {
        super(employee_name, employee_gender, employee_gmail);
        this.employee_id = employee_id;
        this.employee_password = employee_password;
        this.employee_job = employee_job;
        this.employee_shift = employee_shift;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_password() {
        return employee_password;
    }

    public void setEmployee_password(String employee_password) {
        this.employee_password = employee_password;
    }

    public String getEmployee_job() {
        return employee_job;
    }

    public void setEmployee_job(String employee_job) {
        this.employee_job = employee_job;
    }

    public String getEmployee_shift() {
        return employee_shift;
    }

    public void setEmployee_shift(String employee_shift) {
        this.employee_shift = employee_shift;
    }
}
