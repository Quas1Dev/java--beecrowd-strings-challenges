package contractrevision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ContractRevision {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        Collection<String[]> input = new ArrayList<>();

        while (true) {
            String temp = k.nextLine().trim();
            if (temp.equals("0 0")) {
                break;
            }
            input.add(temp.split(" "));
        }

        for (String[] entry : input) {
            String digit = entry[0];
            String[] expected = entry[1].split("");
            String[] real = new String[expected.length];
        
            for (int i = 0; i < expected.length; i++) {
                if (expected[i].equals(digit)) {
                    real[i] = "";
                    continue;
                }  
                real[i] = expected[i];
            }
                   
            for (int i = 0; i < real.length; i++) {
                if (real[i].equals("0") || real[i].equals("")) {
                    real[i] = "";
                } else {
                    break;
                }
            }
            
            if (String.join("", real).equals("")) {
                System.out.println("0");
            } else{
                System.out.println(String.join("", real));
            }
           

        }

    }
}
