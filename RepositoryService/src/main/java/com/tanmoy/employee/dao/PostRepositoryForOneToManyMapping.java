package com.tanmoy.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.tanmoy.employee.domain.Post;

public interface PostRepositoryForOneToManyMapping extends CrudRepository<Post, Long>{

}
