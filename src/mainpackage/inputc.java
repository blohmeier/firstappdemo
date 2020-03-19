package mainpackage;
/* by Brett. 
 * To get user info from the console.
 * Without use of scanner.
 */ 
public class inputc {
	public static void main(String[] args)
	{
		// this "take" (i.e. takes) "a" user name from input.
		String name=args[0];
		// this "takes" a providers name.
		String provider=args[1];
		System.out.println("name:"+name);
		System.out.println("Provider:"+provider);
	}

}