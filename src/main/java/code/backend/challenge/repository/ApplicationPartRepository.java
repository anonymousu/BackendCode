package code.backend.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import code.backend.challenge.models.ApplicationDetail;

@Repository
public interface ApplicationPartRepository extends JpaRepository<ApplicationDetail, String>{

	@Query("select a from ApplicationDetail a where CONCAT(a.ApplicationPartDetail.FilePN,'') =:FilePN and CONCAT(a.SubType,'') =:SubType")
	public List<ApplicationDetail> FindAllWithFilePNAndSubType(@Param("FilePN") String FilePN,@Param("SubType") String SubType);
	
	
	

}
