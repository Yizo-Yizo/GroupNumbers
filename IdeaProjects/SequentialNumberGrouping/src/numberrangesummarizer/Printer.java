package numberrangesummarizer;

public class Printer {

    public void print(String input, NumberRangeSummarizer numberRangeSummarizer) {

        var collected = numberRangeSummarizer.collect(input);
        var rangedNumbers = numberRangeSummarizer.summarizeCollection(collected);

        System.out.println(rangedNumbers);
    }
}
