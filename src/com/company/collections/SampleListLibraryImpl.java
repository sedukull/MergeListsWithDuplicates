package com.company.collections;

/**
 *Sample List library implementation.
 */
public class SampleListLibraryImpl implements SampleListLibrary {

    /**
     * Merges two sorted lists in ascending order, contains duplicates.
     * @param input1
     * @param input2
     * @return Merged list in ascending order, contains duplicates.
     */
    @Override
    public SampleNode Merge(SampleNode input1, SampleNode input2)
    {
        if (input1 == null) {
            return input2;
        }
        if (input2 == null) {
            return input1;
        }

        SampleNode head = new SampleNode(0);
        SampleNode result = head;

        SampleNode tempList1 = input1;
        SampleNode tempList2 = input2;

        while (tempList1 != null && tempList2 != null) {
            if (tempList1.getNodeData() <= tempList2.getNodeData()) {
                result.setNextNode(tempList1);
                tempList1 = tempList1.getNextNode();
            } else {
                result.setNextNode(tempList2);
                tempList2 = tempList2.getNextNode();
            }
            result = result.getNextNode();
        }
        if (tempList1 != null) {
            result.setNextNode(tempList1);
        } else {
            result.setNextNode(tempList2);
        }
        return head.getNextNode();
    }

    @Override
    public SampleNode createListFromArray(int input[]) {
        SampleNode result = new SampleNode(0);
        SampleNode head = result;
        for (int data : input) {
            SampleNode newNode = new SampleNode(data);
            result.setNextNode(newNode);
            result = result.getNextNode();
        }
        return head.getNextNode();
    }


    @Override
    public String convertListToString(final SampleNode input) {
        SampleNode tempNode = input;
        StringBuilder sb = new StringBuilder();
        while (tempNode != null) {
            sb.append(tempNode.getNodeData());
            tempNode = tempNode.getNextNode();
        }
        return sb.toString();
    }
}
