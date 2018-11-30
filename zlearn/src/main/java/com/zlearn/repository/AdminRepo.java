/**
 * 
 */
package com.zlearn.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.zlearn.model.AdminModel;

/**
 * @author ZESTECH IT
 *
 */
public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

	
}
