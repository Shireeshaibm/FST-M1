
public class MyBook extends Book{

	@Override
	public void setTitle(String s) {
		Title=s;
		
	}
	
	public static void main(String[] args) {
		
		MyBook newNovel = new MyBook();
		
		newNovel.setTitle("new novel name is sihreesha");
		
		System.out.println(newNovel.getTitle());
		
	}
	
	

}
