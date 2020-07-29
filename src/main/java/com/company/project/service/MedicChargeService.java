package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.MedicChargeMapper;
import com.company.project.model.MedicCharge;
import com.company.project.model.MedicChargeExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 *  MedicChargeService
 * @Title: MedicChargeService.java 
 * @Package com.fc.test.service 
 * @author SWJ
 * @date 2020-07-29 10:21:37  
 **/
@Service
public class MedicChargeService implements BaseService<MedicCharge, MedicChargeExample>{
	@Autowired
	private MedicChargeMapper medicChargeMapper;
	
      	   	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<MedicCharge> list(Tablepar tablepar,MedicCharge record){
	        MedicChargeExample testExample=new MedicChargeExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<MedicCharge> list= medicChargeMapper.selectByExample(testExample);
	        PageInfo<MedicCharge> pageInfo = new PageInfo<MedicCharge>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			MedicChargeExample example=new MedicChargeExample();
			example.createCriteria().andIdIn(stringB);
			return medicChargeMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public MedicCharge selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return medicChargeMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(MedicCharge record) {
		return medicChargeMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(MedicCharge record) {
				
		record.setId(null);
		
				
		return medicChargeMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(MedicCharge record, MedicChargeExample example) {
		
		return medicChargeMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(MedicCharge record, MedicChargeExample example) {
		
		return medicChargeMapper.updateByExample(record, example);
	}

	@Override
	public List<MedicCharge> selectByExample(MedicChargeExample example) {
		
		return medicChargeMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(MedicChargeExample example) {
		
		return medicChargeMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(MedicChargeExample example) {
		
		return medicChargeMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param medicCharge
	 * @return
	 */
	public int checkNameUnique(MedicCharge medicCharge){
		MedicChargeExample example=new MedicChargeExample();
		example.createCriteria().andYbbmEqualTo(medicCharge.getYbbm());
		List<MedicCharge> list=medicChargeMapper.selectByExample(example);
		return list.size();
	}


}
