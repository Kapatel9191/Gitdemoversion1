

public class Test1 {

	public static void main(String[] args) {
		        /*String name = "Japneet Singh Sachdeva";
		        String shortForm = getShortForm(name);
		        System.out.println("Short form of the name: " + shortForm);
		    }

		    public static String getShortForm(String name) {
		        StringBuilder shortFormBuilder = new StringBuilder();
		        String[] parts = name.split(" ");
		        for (int i = 0; i < parts.length; i++) {
		            if (i == 0 || i == parts.length - 1) {
		                shortFormBuilder.append(parts[i]).append(" ");
		            } else {
		                shortFormBuilder.append(parts[i].charAt(0)).append(". ");
		            }
		        }
		        return shortFormBuilder.toString().trim();*/
		
		int rows = 5;

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
		    


	    }
	}
}