/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker_info;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validate {
    static Scanner input = new Scanner(System.in);
    
    public static int inputInt(String mess,int low,int high){
        int x=0;
        while(true){
            try {
                System.out.print(mess);
                x=Integer.parseInt(input.nextLine());
                if(x<low ||x>high){
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input again");
            }
        }
        return x;
    }
    
     public static String inputString(String mess){
        String x=null;      
        while(true){
            try {
                System.out.print(mess);
                x=input.nextLine();
                if(x.isEmpty() || x.equals("\\s")){
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input again");
            }
        }
        return x;
    }
     
     public static double inputDouble(String mess,int low,int high){
        double x=0;
        while(true){
            try {
                System.out.print(mess);
                x=Double.parseDouble(input.nextLine());
                if(x<low ||x>high){
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input again");
            }
        }
        return x;
    }
}
