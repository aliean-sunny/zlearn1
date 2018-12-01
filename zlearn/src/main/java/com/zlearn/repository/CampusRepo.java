/**
 * 
 */
package com.zlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zlearn.model.CampusModel;

/**
 * @author ZESTECH IT
 *
 */
public interface CampusRepo extends JpaRepository<CampusModel, Integer>{

}
