package com.ntaganda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


import com.ntaganda.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
	
	public List<Review> findReviewsByUserId(Integer userId);
	
	public List<Review> findReviewsByPlace(String place);
}
