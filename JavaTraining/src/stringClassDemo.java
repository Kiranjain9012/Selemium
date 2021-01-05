
public class stringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String a = "Java Training";
//		System.out.println(a.charAt(3));
//		System.out.println(a.indexOf("l"));
//		System.out.println(a.substring(3, 6));
//		System.out.println(a.substring(2));
//		System.out.println(a.concat("Demo"));
//		String arr[]= a.split(" ");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World");
		System.out.println(sb);
		sb.insert(2,"She");
		System.out.println(sb);
		sb.replace(3, 8, "me");
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
//		int k=1;
		for(int i=1; i<5;i++) {
			for(int j=1; j<=i;j++) {
				
				System.out.print(j);
				System.out.print("\t");
//				k++;
			}
			System.out.println("");
		}
		
	}

}
