package numberrangesummarizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

class SortNGroupTest {

    private SortNGroup sortNGroup;
    String groupedNumbers;
    Collection<Integer> sortedNumbers;
    Collection<Integer> expectedsortedNumbers;
    Collection<Integer> numbersToBeGrouped;

    @BeforeEach
    void setUp() {
        this.sortNGroup = new SortNGroup();

    }

    @Test
    void shouldSortNumbers() {
        expectedsortedNumbers = new ArrayList<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31));
        sortedNumbers = sortNGroup.sort("1,3,23,7,15,12,21,14,8,13,22,6,24,31");
        assertEquals(expectedsortedNumbers, sortedNumbers);
    }

    @Test
    void shouldGroupNumbers() {
        String expectedGroupedNumbers = "1,3,6-8,12-15,21-24,31,";
        numbersToBeGrouped = new ArrayList<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31));
        groupedNumbers = sortNGroup.groupNumbers(numbersToBeGrouped);
        assertEquals(expectedGroupedNumbers, groupedNumbers);
    }
}
