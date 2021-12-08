package com.esc.patterns.facade;

public class SortingManager {

	private Algorithm bubbleSort;
	private Algorithm quickSort;
	private Algorithm mergeSort;

	public SortingManager() {
		this.bubbleSort = new BubbleSort();
		this.quickSort = new QuickSort();
		this.mergeSort = new MergeSort();
	}

	public void doBubbleSort() {
		this.bubbleSort.sort();
	}

	public void doQuickSort() {
		this.quickSort.sort();
	}

	public void doMergeSort() {
		this.mergeSort.sort();
	}

}
