package encryption;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        // Determine how many entries are to be read.
        int totEntries = Integer.parseInt(k.nextLine());
        String[] lines = new String[totEntries];

        for (int i = 0; i < totEntries; i++) {
            lines[i] = k.nextLine();
        }

        // Loop through each string in lines[],
        // performing the encoding process
        // and then saving the encoded text in place 
        // of the decoded one.
        for (int i = 0; i < lines.length; i++) {
            char[] letters = lines[i].toCharArray();

            // Move all characters 3 places in the unicode standard
            for (int j = 0; j < letters.length; j++) {
                if (Character.toString(letters[j]).matches("[A-Za-z]")) {
                    letters[j] = (char) (letters[j] + 3);
                }
            }

            // Reverse the characters *1
            for (int j = 0; j < (int) Math.ceil((letters.length) / 2); j++) {
                char temp = letters[j];

                letters[j] = letters[letters.length - j - 1];
                letters[letters.length - j - 1] = temp;
            }

            // The second half characters must be 
            for (int j = (int) Math.ceil((letters.length) / 2);
                    j < letters.length;
                    j++) {
                letters[j] = (char) (letters[j] - 1);
            }

            // The encoded string is set on the same 
            // index as its decoded counterpart.
            lines[i] = "";
            for (int j = 0; j < letters.length; j++) {
                lines[i] += letters[j];
            }
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }

}

/*
Dev's comments

*1 - This is done by going through the first half of the
 letters[] array. At each iteration we replace the current 
 element with one from the second half like this: the first 
 element is exchanged with the last element in the second half,
 while the second element is exchanged with the penultimate, etc.

 Foe example, for the array [1 2 3 4] we would iterated until 
 we reach number 2. In the first iteration, 1 is exchanged with
 4, and the array would look like this [4231]. For the second and
 last iteration we would replace 2 with 3, so the array end up
 like this [1 2 3 4].

*/
