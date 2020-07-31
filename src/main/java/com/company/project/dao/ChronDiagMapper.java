package com.company.project.dao;

import java.util.List;

import com.company.project.model.ChronDiag;
import com.company.project.model.ChronDiagExample;

import org.apache.ibatis.annotations.Param;

/**
 *  ChronDiagMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-30 16:46:06
 */
public interface ChronDiagMapper {
      	      	      	      	      	      	      
    long countByExample(ChronDiagExample example);

    int deleteByExample(ChronDiagExample example);
		
    int insert(ChronDiag record);

    int insertSelective(ChronDiag record);

    List<ChronDiag> selectByExample(ChronDiagExample example);
		
    int updateByExampleSelective(@Param("record") ChronDiag record, @Param("example") ChronDiagExample example);

    int updateByExample(@Param("record") ChronDiag record, @Param("example") ChronDiagExample example); 
	  	
}