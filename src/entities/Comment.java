package entities;

public class Comment {
	private String text;
	
	public Comment() {
		
	}
	
	public Comment(String text) {
		setComment(text);
	}
	
	public String getComments() {
		return text;
	}
	
	public void setComment(String text) {
		this.text = text;
	}
}