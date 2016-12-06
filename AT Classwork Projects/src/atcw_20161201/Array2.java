package atcw_20161201;

public class Array2 {
	
	private int[] nums = new int[0];
	String name;
	
	Array2() {}
	
	// adds a number at the end of the array and increases its size by 1
	void push(int val) {
		int[] temp = new int[nums.length + 1];
		for (int i=0;i<nums.length;i++) {
			temp[i] = nums[i];
		}
		temp[nums.length] = val;
		// the next statement is not really an assignment it is having nums
		// point to a different memory location.
		nums = temp;
	}
	
	int pop() {}
	
	// returns the value at index i in the array
	int getValue(int i) {}
	
	//adds a number into the array at postion index and increases its size 1
	void insert(int val,int index){}
	
	void changeName(String n) {}
	
	//finds the sum of all the values in the array
	int sum() {}
	
}
