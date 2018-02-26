package com.company.collections;

public interface SampleListLibrary {

    /**
     * Merge two sorted lists
     * @param input1
     * @param input2
     * @return the merged list
     */
    public SampleNode Merge(final SampleNode input1, final SampleNode input2);

    /**
     * Create a list from array.
     * @param input
     * @return
     */
    public SampleNode createListFromArray(int input[]);

    /**
     * Convert list to string.
     * @param input
     * @return
     */
    public String convertListToString(final SampleNode input);
}
