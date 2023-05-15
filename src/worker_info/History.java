/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker_info;


/**
 *
 * @author Admin
 */
public class History extends Worker {

    private String status;
    private String date;

    //Constructor:
    public History(String status, String date, String name, String id, int age, double salary, String workLocation) {
        super(name, id, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public History() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%-7s %-10s %-10s %-10s %-10s %-10s",
                super.getId(), super.getName(), super.getAge(), super.getSalary(), status, date);
    }

}
