package com.tanmoy.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tanmoy.employee.domain.Comment;
import com.tanmoy.employee.domain.Post;
import com.tanmoy.employee.service.PostService;

@RestController
@RequestMapping("/post")
public class PostRestService {
	@Autowired
	PostService postService;
	
	private static Logger log = Logger.getLogger(PostRestService.class);
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET, produces="application/json")
	public String ping(){
		return "Hello";
	}
	
	@RequestMapping(value="/savepost", method=RequestMethod.GET, produces="application/json")
	public Post saveAPost(){
		
		log.info("Logger enabled: Entering saveAPost method\n");
		Post p =new Post("Hibernate One-To-Many Mapping Example 5",
                "Learn how to use one to many mapping in hibernate 5",
                "Entire Post Content with sample code 5");
		Comment c1=new Comment("Great Post!");
		c1.setPost(p);
		Comment c2=new Comment("Really helpful Post. Thanks a lot!");
		c2.setPost(p);
		p.getComments().add(c1);
		p.getComments().add(c2);
		
		try{
		postService.insertPost(p);
		log.info("Logger enabled: Exiting saveAPost method");
		
		}catch(Exception e){
			log.error(e);
		}
		return p;
	}
}
