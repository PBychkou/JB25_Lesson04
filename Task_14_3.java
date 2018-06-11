public class Task_14_3 {

	public static void main(String[] args) {
 
        String str = new String("Welcome-to-Tutorialspoint.com");
        System.out.println("Return Value: ");

        for (String retval: str.split("-")) {
            System.out.println(retval);
        }
    }

}