package growingstrings;

import java.util.*;

public class GrowingStrings {

    

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();
        lines.add(k.nextLine());

        while (!lines.get(lines.size() - 1).endsWith("0")) {
            lines.add(k.nextLine());
        }

        ArrayList<Integer> sizeOfEachCase = new ArrayList<>();

        for (String line : lines) {

            int caseTestSize;

            lines.remove(line);

            ListIterator<Integer> iterator = sizeOfEachCase.listIterator();

            while (iterator.hasNext()) {
                int startIndex = iterator.previousIndex();
                if (startIndex < 0) {
                    startIndex = 0;
                }

                int endIndex = iterator.next();

                List<String> subSequence = lines.subList(startIndex, endIndex);

                int largestSubSequence = findLargest(subSequence);
            }

        }
    }
    
    private static int findLargest(List subSequence) {
        
        return 3;
    }
}
