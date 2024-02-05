package com.lab3.assignment2;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of the tree,");
		int size = sc.nextInt();

		BST bst = new BST();
		Node root = null;
		Node result = null;

		for (int i = 1; i <= size; i++) {
			System.out.println("Insert value " + i);
			int data = sc.nextInt();

			if (root == null)
				root = bst.insertValue(root, data);
			else {
				result = bst.insertValue(root, data);
				if (result.data == data)
					i -= 1;
			}
		}
		SumPair sumpair = new SumPair();
		sumpair.inOrder(root);
		System.out.println("Inorder traversal :" + sumpair.dataList);

		System.out.println("\nPlease enter sum");
		int sum = sc.nextInt();

		sumpair.sumValues(sum);

		sc.close();
	}

}
