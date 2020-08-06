package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.SjczqtMapper;
import com.company.project.model.Sjczqt;
import com.company.project.model.SjczqtExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 *  SjczqtService
 * @Title: SjczqtService.java 
 * @Package com.fc.test.service 
 * @author SWJ
 * @date 2020-07-29 11:14:10  
 **/
@Service
public class SjczqtService implements BaseService<Sjczqt, SjczqtExample>{
	@Autowired
	private SjczqtMapper sjczqtMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Sjczqt> list(Tablepar tablepar,Sjczqt record){
	        SjczqtExample testExample=new SjczqtExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Sjczqt> list= sjczqtMapper.selectByExample(testExample);
	        PageInfo<Sjczqt> pageInfo = new PageInfo<Sjczqt>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			SjczqtExample example=new SjczqtExample();
			example.createCriteria().andIdIn(stringB);
			return sjczqtMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Sjczqt selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return sjczqtMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Sjczqt record) {
		return sjczqtMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Sjczqt record) {		
		return sjczqtMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Sjczqt record, SjczqtExample example) {
		
		return sjczqtMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Sjczqt record, SjczqtExample example) {
		
		return sjczqtMapper.updateByExample(record, example);
	}

	@Override
	public List<Sjczqt> selectByExample(SjczqtExample example) {
		
		return sjczqtMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(SjczqtExample example) {
		
		return sjczqtMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(SjczqtExample example) {
		
		return sjczqtMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sjczqt
	 * @return
	 */
	public int checkNameUnique(Sjczqt sjczqt){
		SjczqtExample example=new SjczqtExample();
		example.createCriteria().andYbbmEqualTo(sjczqt.getYbbm());
		List<Sjczqt> list=sjczqtMapper.selectByExample(example);
		return list.size();
	}


}
