/**
 * 
 */
package com.ntaganda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ntaganda.entity.User;


/**
 * @author adithya956
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	User findByEmailAndPassword(String email, String password);
}


