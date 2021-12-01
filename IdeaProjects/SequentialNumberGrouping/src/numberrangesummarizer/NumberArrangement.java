package numberrangesummarizer;

import java.util.Collection;

public class NumberArrangement {

    public static void main(String[] args) {

        //Collection<Integer> numbers = Arrays.
        //var input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        try {

            var input = "1,3,23,7,15,12,21,14,8,13,22,6,24,31";
            Printer printer = new Printer();

            printer.print(input, new NumberRangeSummarizer() {

                public Collection<Integer> collect(String input) {

                    return SortNGroup.sort(input);
                }

                public String summarizeCollection(Collection<Integer> sortedNumbers) {

                    return SortNGroup.groupNumbers(sortedNumbers);
                }
            });

        } catch (NumberFormatException e) {
            System.out.println("Error: Please input integers only and try again.");
        }


    }
}
