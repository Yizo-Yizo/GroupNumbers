package numberrangesummarizer;

import java.util.*;
import java.util.stream.Collectors;

public class SortNGroup {

    public static Collection<Integer> sort(String input) {

        List<String> numbers = Arrays.asList(input.split(","));
        List<Integer> sortedNumbers = new ArrayList<Integer>();

        // Converting from List<String> to List<Integer>
        sortedNumbers.addAll(numbers.stream().map(Integer::valueOf)
                .collect((Collectors.toList())));

        Collections.sort(sortedNumbers);

        return sortedNumbers;
    }

    public static String groupNumbers(Collection<Integer> input) {

        int lengthOfInput = input.size();
        int firstIndex = 0;
        int secondIndex = 0;
        StringBuilder summarizedCollection = new StringBuilder();

        while (firstIndex < lengthOfInput) {
            while ((++secondIndex < lengthOfInput) &&
                    (((List<Integer>) input).get(secondIndex) - ((List<Integer>) input).get(secondIndex - 1) == 1)) ;
            if (secondIndex - firstIndex > 2) {
                //System.out.printf("%s-%s", ((List<Integer>) input).get(firstIndex), ((List<Integer>) input).get(secondIndex - 1));
                summarizedCollection.append(String.format("%s-%s,", (((List<Integer>) input).get(firstIndex)), ((List<Integer>) input).get(secondIndex - 1)));
                firstIndex = secondIndex;
            } else {
                for (; firstIndex < secondIndex; firstIndex++) {
                    //System.out.printf("%s,", ((List<Integer>) input).get(firstIndex));
                    summarizedCollection.append(String.format("%s,", ((List<Integer>) input).get(firstIndex)));
                }
            }
        }
        return summarizedCollection.toString();
    }
}
