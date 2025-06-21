package ex_09_switch;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        System.out.println("Please enter the browser name");
        Scanner scanner = new Scanner(System.in);
        String Browser = scanner.next();
        //Browser = browser.toLowerCase();
        switch (Browser){
            case "chrome":
                System.out.println("Open the browser");
                System.out.println("TC1");
                break;
                case "firefox":
                    System.out.println("Open the browser");
                    System.out.println("TC1");
                    break;

            default:
                System.out.println("invalid browser");
                break;
            }
            }

        }




