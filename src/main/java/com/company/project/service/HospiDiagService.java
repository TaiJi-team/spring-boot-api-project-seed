package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.HospiDiagMapper;
import com.company.project.model.HospiDiag;
import com.company.project.model.HospiDiagExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 *  HospiDiagService
 * @Title: HospiDiagService.java 
 * @Package com.fc.test.service 
 * @author SWJ
 * @date 2020-07-29 10:21:50  
 **/
@Service
public class HospiDiagService implements BaseService<HospiDiag, HospiDiagExample>{
	@Autowired
	private HospiDiagMapper hospiDiagMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<HospiDiag> list(Tablepar tablepar,HospiDiag record){
	        HospiDiagExample testExample=new HospiDiagExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<HospiDiag> list= hospiDiagMapper.selectByExample(testExample);
	        PageInfo<HospiDiag> pageInfo = new PageInfo<HospiDiag>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			HospiDiagExample example=new HospiDiagExample();
			example.createCriteria().andIdIn(stringB);
			return hospiDiagMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public HospiDiag selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return hospiDiagMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(HospiDiag record) {
		return hospiDiagMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(HospiDiag record) {
				
		record.setId(null);
		
				
		return hospiDiagMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(HospiDiag record, HospiDiagExample example) {
		
		return hospiDiagMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(HospiDiag record, HospiDiagExample example) {
		
		return hospiDiagMapper.updateByExample(record, example);
	}

	@Override
	public List<HospiDiag> selectByExample(HospiDiagExample example) {
		
		return hospiDiagMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(HospiDiagExample example) {
		
		return hospiDiagMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(HospiDiagExample example) {
		
		return hospiDiagMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param hospiDiag
	 * @return
	 */
	public int checkNameUnique(HospiDiag hospiDiag){
		HospiDiagExample example=new HospiDiagExample();
		example.createCriteria().andYbbmEqualTo(hospiDiag.getYbbm());
		List<HospiDiag> list=hospiDiagMapper.selectByExample(example);
		return list.size();
	}


}
