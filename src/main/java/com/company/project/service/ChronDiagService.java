package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.ChronDiagMapper;
import com.company.project.model.ChronDiag;
import com.company.project.model.ChronDiagExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 *  ChronDiagService
 * @Title: ChronDiagService.java 
 * @Package com.fc.test.service 
 * @author SWJ
 * @date 2020-07-30 16:46:06  
 **/
@Service
public class ChronDiagService implements BaseService<ChronDiag, ChronDiagExample>{
	@Autowired
	private ChronDiagMapper chronDiagMapper;
	
      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<ChronDiag> list(Tablepar tablepar,ChronDiag record){
	        ChronDiagExample testExample=new ChronDiagExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause(" ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<ChronDiag> list= chronDiagMapper.selectByExample(testExample);
	        PageInfo<ChronDiag> pageInfo = new PageInfo<ChronDiag>(list);
	        return  pageInfo;
	 }
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(ChronDiag record) {		
		return chronDiagMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(ChronDiag record, ChronDiagExample example) {
		
		return chronDiagMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(ChronDiag record, ChronDiagExample example) {
		
		return chronDiagMapper.updateByExample(record, example);
	}

	@Override
	public List<ChronDiag> selectByExample(ChronDiagExample example) {
		
		return chronDiagMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ChronDiagExample example) {
		
		return chronDiagMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ChronDiagExample example) {
		
		return chronDiagMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param chronDiag
	 * @return
	 */
	public int checkNameUnique(ChronDiag chronDiag){
		ChronDiagExample example=new ChronDiagExample();
		example.createCriteria().andYbbmEqualTo(chronDiag.getYbbm());
		List<ChronDiag> list=chronDiagMapper.selectByExample(example);
		return list.size();
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ChronDiag selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(ChronDiag record) {
		// TODO Auto-generated method stub
		return 0;
	}


}
