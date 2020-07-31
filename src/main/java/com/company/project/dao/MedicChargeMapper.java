package com.company.project.dao;

import java.util.List;

import com.company.project.model.MedicCharge;
import com.company.project.model.MedicChargeExample;

import org.apache.ibatis.annotations.Param;

/**
 *  MedicChargeMapper
 * @authorSWJ
 * @date 2020-07-30 16:46:21
 */
public interface MedicChargeMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(MedicChargeExample example);

    int deleteByExample(MedicChargeExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(MedicCharge record);

    int insertSelective(MedicCharge record);

    List<MedicCharge> selectByExample(MedicChargeExample example);
		
    MedicCharge selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") MedicCharge record, @Param("example") MedicChargeExample example);

    int updateByExample(@Param("record") MedicCharge record, @Param("example") MedicChargeExample example); 
		
    int updateByPrimaryKeySelective(MedicCharge record);

    int updateByPrimaryKey(MedicCharge record);
  	  	
}