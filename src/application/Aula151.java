package application;

//import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Aula151 {

	public static void main(String[] args) {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Cool");
		Comment c2 = new Comment("Not Cool");
		
		LocalDateTime ldt1 = LocalDateTime.now();
		Date moment1 = Date.from(ldt1.atZone(ZoneId.systemDefault()).toInstant()); // converting from ldt to date
		
//		* add throws declaration
//		Post p1 = new Post(sdf.parse("11/02/2024 19:11:15"), "Traveling to Brazil", "Cool place", 10);
		
		Post p1 = new Post(moment1, "Traveling to Brazil", "Cool place", 10);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		LocalDateTime ldt2 = LocalDateTime.now();
		Date moment2 = Date.from(ldt2.atZone(ZoneId.systemDefault()).toInstant());
		
		Post p2 = new Post(moment2, "Traveling to Thailand", "Cool place", 15);
		p2.addComment(c2);
		p2.addComment(c1);
		
		System.out.println(p2);
	}

}