package OCP.lms;

public class ContentRedererTest {
    public static void main(String[] args) {
		
    	System.out.println("Content Type : " + new Article().contentType());
    	System.out.println("Content Type : " + new Quiz().contentType());
    	System.out.println("Content Type : " + new Video().contentType());
	}
}
