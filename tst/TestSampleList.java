import com.company.collections.SampleListLibraryImpl;
import com.company.collections.SampleNode;
import com.company.collections.SampleListLibrary;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class TestSampleList {

    public void TestSampleList() {
    }

    private SampleListLibrary sampleListLibrary;

    @Before
    public void setup() {
        sampleListLibrary = new SampleListLibraryImpl();
    }
   /**
    * TestCase1: InputList1: null; InputList2: 1->2->3;
    * Expected: 1->2->3
    */
   @Test
    public void testMergeWithOneEmptyList() {
        int[] myList2 = new int[] {1,2,3};
        SampleNode inputList2 = sampleListLibrary.createListFromArray(myList2);
        SampleNode result = sampleListLibrary.Merge(null, inputList2);
        String listAsString = sampleListLibrary.convertListToString(result);
        Assert.assertEquals("123", listAsString);
    }

    /**
     * TestCase2: InputList1: null; InputList2: null;
     * Expected: null;
     */
    @Test
    public void testMergeEmptyLists() {
        SampleNode result = sampleListLibrary.Merge(null, null);
        Assert.assertEquals(result, null);
    }

    /**
     * TestCase3: InputList1: 1->2->3; InputList2: 2->3->4
     * Expected: 1->2->2->3->4
     */
     @Test
     public void testMergeTwoNonInputListsWithOutDuplicates() {
         SampleNode inputList1 = sampleListLibrary.createListFromArray(new int[] {1,2,3});
         SampleNode inputList2 = sampleListLibrary.createListFromArray(new int[] {2,3,4});
         SampleNode result = sampleListLibrary.Merge(inputList1, inputList2);
         String resultString = sampleListLibrary.convertListToString(result);
         Assert.assertEquals("122334", resultString);
     }

    /**
     TestCase5:
     1. Non empty list(with no duplicates) 1->2
     2. Non empty input list(with duplicates) 3->3->4->5
     Result: 1->2->3->3->4->5
     */
    @Test
    public void testMergeTwoNonInputListsWithAndWithOutDuplicates() {
        SampleNode inputList1 = sampleListLibrary.createListFromArray(new int[] {1,2});
        SampleNode inputList2 = sampleListLibrary.createListFromArray(new int[] {3,3,4,5});
        SampleNode result = sampleListLibrary.Merge(inputList1, inputList2);
        String resultString = sampleListLibrary.convertListToString(result);
        Assert.assertEquals("123345", resultString);
    }

    /**
    *TestCase6:
     1. Non empty list(with duplicates) 1->2->2
     2. Non empty input list(with duplicates) 3->3->4->5
     Result: 1->2->2->3->3->4->5
     */
    @Test
    public void testMergeTwoNonInputListsWithDuplicates() {

        SampleNode inputList1 = sampleListLibrary.createListFromArray(new int[] {1,2,2});
        SampleNode inputList2 = sampleListLibrary.createListFromArray(new int[] {3,3,4,5});
        SampleNode result = sampleListLibrary.Merge(inputList1, inputList2);
        String resultString = sampleListLibrary.convertListToString(result);
        Assert.assertEquals("1223345", resultString);
    }
}



