package com.lab3.assignment2;

import java.util.ArrayList;

public class SumPair {
	ArrayList<Integer> dataList = new ArrayList<>();

	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			dataList.add(root.data);
			inOrder(root.right);
		}
	}

	void sumValues(int sum) {
		int n1;
		int n2;
		boolean flag = false;
		for (int i = 0; i < dataList.size(); i++) {
			n1 = dataList.get(i);
			n2 = sum - n1;
			for (int j = i + 1; j < dataList.size(); j++) {
				if (n2 == dataList.get(j)) {
					System.out.println("pair found [" + n1 + "," + n2 + "]");
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Pair not found");
		}
	}

}
