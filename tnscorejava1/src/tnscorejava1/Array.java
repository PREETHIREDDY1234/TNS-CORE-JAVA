package tnscorejava1;


public class Array {

	public static void main(String[] args) {
		//for array we can create objects-yes
		Student arr[]=new Student[5];
		//declaration    //value initialization
		//or
		//Student arr[];//declaration
		//arr=new Student[5];//initialization
		
		arr[0]=new Student("preethi",59);
		arr[1]=new Student("navya",19);
		arr[2]=new Student("anvitha",23);
		arr[3]=new Student("ammu",39);
		arr[4]=new Student("radha",69);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}
}

