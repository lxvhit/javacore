import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class phuongtrinh2 {
    // public static void main(String[] args) {
    // for (int i = 0; i < 10; i++) {
    // for (int j = 0; j < 10; j++) {
    // System.out.print("* ");
    // }
    // System.out.println("");
    // }
    // }
    // public static void main(String[] args) {
    // for (int i = 0; i <= 10; i++) {
    // for (int j = 0; j <= 10; j++) {
    // if (i == 0 || i == 10 || j == 0 || j == 10) {
    // System.out.print("* ");
    // }else
    // System.out.print(" ");

    // }
    // System.out.println("");
    // }
    // }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
