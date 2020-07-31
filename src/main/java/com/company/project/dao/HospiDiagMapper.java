package com.company.project.dao;

import java.util.List;
import com.company.project.model.HospiDiag;
import com.company.project.model.HospiDiagExample;
import org.apache.ibatis.annotations.Param;

/**
 *  HospiDiagMapper
 * @author SWJ
 * @date 2020-07-30 16:46:16
 */
public interface HospiDiagMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(HospiDiagExample example);

    int deleteByExample(HospiDiagExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(HospiDiag record);

    int insertSelective(HospiDiag record);

    List<HospiDiag> selectByExample(HospiDiagExample example);
		
    HospiDiag selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") HospiDiag record, @Param("example") HospiDiagExample example);

    int updateByExample(@Param("record") HospiDiag record, @Param("example") HospiDiagExample example); 
		
    int updateByPrimaryKeySelective(HospiDiag record);

    int updateByPrimaryKey(HospiDiag record);
  	  	
}