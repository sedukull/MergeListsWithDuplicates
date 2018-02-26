package com.company.collections;

/**
 * SampleNode definition with given data and next node reference.
 */
public class SampleNode {

    private int data;
    private SampleNode nextNode;

    public SampleNode(final int data, final SampleNode inputNextNode) {
        this.data = data;
        this.nextNode = inputNextNode;
    }

    public SampleNode(final int data) {
        this.data = data;
        this.nextNode = null;
    }

    public int getNodeData() {
        return this.data;
    }

    public SampleNode getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(final SampleNode inputNextNode) {
        this.nextNode = inputNextNode;
    }
}
