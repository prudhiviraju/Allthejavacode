package patternandstring;

public class RemoveextrajunkfromString {

	
	
	public static void main(String[] args) {
		
		
		String name = "豆贝尔维艾克斯prudhvi razz";
		name =name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(name);
		
		
	}
	
	}
