package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.DrgsTitleMapper;
import com.company.project.model.DrgsTitle;
import com.company.project.model.DrgsTitleExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 *  DrgsTitleService
 * @Title: DrgsTitleService.java 
 * @Package com.fc.test.service 
 * @author SWJ
 * @date 2020-07-29 10:22:10  
 **/
@Service
public class DrgsTitleService implements BaseService<DrgsTitle, DrgsTitleExample>{
	@Autowired
	private DrgsTitleMapper drgsTitleMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<DrgsTitle> list(Tablepar tablepar,DrgsTitle record){
	        DrgsTitleExample testExample=new DrgsTitleExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<DrgsTitle> list= drgsTitleMapper.selectByExample(testExample);
	        PageInfo<DrgsTitle> pageInfo = new PageInfo<DrgsTitle>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			DrgsTitleExample example=new DrgsTitleExample();
			example.createCriteria().andIdIn(stringB);
			return drgsTitleMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public DrgsTitle selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return drgsTitleMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(DrgsTitle record) {
		return drgsTitleMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(DrgsTitle record) {
				
		record.setId(null);
		
				
		return drgsTitleMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(DrgsTitle record, DrgsTitleExample example) {
		
		return drgsTitleMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(DrgsTitle record, DrgsTitleExample example) {
		
		return drgsTitleMapper.updateByExample(record, example);
	}

	@Override
	public List<DrgsTitle> selectByExample(DrgsTitleExample example) {
		
		return drgsTitleMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(DrgsTitleExample example) {
		
		return drgsTitleMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(DrgsTitleExample example) {
		
		return drgsTitleMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param drgsTitle
	 * @return
	 */
	public int checkNameUnique(DrgsTitle drgsTitle){
		DrgsTitleExample example=new DrgsTitleExample();
		example.createCriteria().andYbbmEqualTo(drgsTitle.getYbbm());
		List<DrgsTitle> list=drgsTitleMapper.selectByExample(example);
		return list.size();
	}


}
