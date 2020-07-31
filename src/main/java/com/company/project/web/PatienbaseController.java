package com.company.project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.project.common.AjaxResult;
import com.company.project.common.TableSplitResult;
import com.company.project.common.Tablepar;
import com.company.project.common.TitleVo;
import com.company.project.model.Patienbase;
import com.company.project.service.PatienbaseService;
import com.github.pagehelper.PageInfo;



@Controller
@RequestMapping("/PatienbaseController")
public class PatienbaseController {
	
	private String prefix = "gen/patienbase";
	@Autowired
	private PatienbaseService patienbaseService;
	
	/**
	 * 分页跳转
	 */

	@GetMapping("/view")
    public String view(ModelMap model)
    {	
		String str="";
		AjaxResult.setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	/**
	 * 分页查询
	 */
	//@Log(title = "集合查询", action = "111")
	@PostMapping("/list")
	@ResponseBody
	public Object list(Tablepar tablepar,Patienbase record){
		PageInfo<Patienbase> page=patienbaseService.list(tablepar,record) ; 
		TableSplitResult<Patienbase> result=new TableSplitResult<Patienbase>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}
	
	/**
     * 新增跳转
     */
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
    }
	
	/**
     * 新增
     */
	//@Log(title = "新增", action = "111")
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult add(Patienbase patienbase){
		int b=patienbaseService.insertSelective(patienbase);
		if(b>0){
			return AjaxResult.success();
		}else{
			return AjaxResult.error();
		}
	}
	
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "删除", action = "111")
	@PostMapping("/remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=patienbaseService.deleteByPrimaryKey(ids);
		if(b>0){
			return AjaxResult.success();
		}else{
			return AjaxResult.error();
		}
	}
	
	/**
	 * 检查Name
	 * @param tsysUser
	 * @return
	 */
	@PostMapping("/checkNameUnique")
	@ResponseBody
	public int checkNameUnique(Patienbase patienbase){
		int b=patienbaseService.checkNameUnique(patienbase);
		if(b>0){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        mmap.put("Patienbase", patienbaseService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Patienbase record)
    {
        return AjaxResult.toAjax(patienbaseService.updateByPrimaryKeySelective(record));
    }

    
    /**
   	 * 根据主键查询
   	 * 
   	 * @param id
   	 * @param mmap
   	 * @return
   	 */
   	@PostMapping("/get/{id}")
   	public Patienbase edit(@PathVariable("id") String id) {
   		return patienbaseService.selectByPrimaryKey(id);
   	}
    

	
}
