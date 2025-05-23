package week12.lectures.livesession.secondgroup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(finallyExample());
        try {
            readFile("becir.txt");
            int a = Integer.parseInt("1");
            System.out.println("");
        } catch (IOException e) {
            System.out.println("Problem happened on line 14 and it is " + e.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Problem happened on line 16 and it is " + nfe.getMessage());
        } finally {
            System.out.println("I WILL EXECUTE NO MATTER WHAT HAPPENS!");
        }

    }

    public static void readFile(String filename) throws IOException{
            BufferedReader reader = new BufferedReader(
                    new FileReader(filename)
            );
    }

    public static int finallyExample(){
        try {
            return 1;
        } catch (Exception e){
            return 2;
        } finally {
            return 3;
        }
    }
}
