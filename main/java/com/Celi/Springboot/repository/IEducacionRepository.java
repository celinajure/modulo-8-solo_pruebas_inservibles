
package com.Celi.Springboot.repository;

import com.Celi.Springboot.entity.EducacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository  extends JpaRepository<EducacionEntity, Long>{
    
}
