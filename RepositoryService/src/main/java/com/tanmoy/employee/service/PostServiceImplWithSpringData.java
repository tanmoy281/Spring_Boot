package com.tanmoy.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tanmoy.employee.dao.PostRepositoryForOneToManyMapping;
import com.tanmoy.employee.domain.Post;

@Service
@Transactional
public class PostServiceImplWithSpringData implements PostService{

	@Autowired
	PostRepositoryForOneToManyMapping postDao;
	
	@Override
	public void insertPost(Post p) {
		postDao.save(p);
		
	}

}
