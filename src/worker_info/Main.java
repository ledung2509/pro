/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker_info;

import java.util.ArrayList;
import java.util.List;
import worker_info.Validate;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        ManageWorker m = new ManageWorker();
        while (true) {
            m.menu();
            int choice = Validate.inputInt("Enter choice: ", 1, 7);
            switch (choice) {
                case 1:
                    m.addWorker();
                    break;
                case 2:
                    m.upSalary();
                    break;
                case 3:
                    m.downSalary();
                    break;
                case 4:
                    m.getInformationSalary();
                    break;
                case 5:
                    m.sortName();
                    m.getInformationSalary();
                    break;
                case 6:
                    m.sortSalary();
                    m.getInformationSalary();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}
