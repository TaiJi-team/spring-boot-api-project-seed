package com.company.project.common;

import java.util.HashMap;

import org.springframework.ui.ModelMap;


/**
* @ClassName: AjaxResult
* @Description: TODO(ajax操作消息提醒)
* @author SWJ
*
 */
public class AjaxResult extends HashMap<String, Object>
{
    private static final long serialVersionUID = 1L;

    /**
     * 初始化一个新创建的 Message 对象
     */
    public AjaxResult()
    {
    }

    /**
     * 返回错误消息
     * 
     * @return 错误消息
     */
    public static AjaxResult error()
    {
        return error(1, "操作失败");
    }

    /**
     * 返回错误消息
     * 
     * @param msg 内容
     * @return 错误消息
     */
    public static AjaxResult error(String msg)
    {
        return error(500, msg);
    }

    /**
     * 返回错误消息
     * 
     * @param code 错误码
     * @param msg 内容
     * @return 错误消息
     */
    public static AjaxResult error(int code, String msg)
    {
        AjaxResult json = new AjaxResult();
        json.put("code", code);
        json.put("msg", msg);
        return json;
    }

    /**
     * 返回成功消息
     * 
     * @param msg 内容
     * @return 成功消息
     */
    public static AjaxResult success(String msg)
    {
        AjaxResult json = new AjaxResult();
        json.put("msg", msg);
        json.put("code", 200);
        return json;
    }
    
    /**
     * 返回成功消息
     * 
     * @return 成功消息
     */
    public static AjaxResult success()
    {
        return AjaxResult.success("操作成功");
    }
    
    public static AjaxResult successData(int code, Object value){
    	 AjaxResult json = new AjaxResult();
    	 json.put("code", code);
         json.put("data", value);
         return json;
    }
   
    public static AjaxResult toAjax(int rows)
    {
        return rows > 0 ? success() : error();
    }
    /**
     * 返回成功消息
     * 
     * @param key 键值
     * @param value 内容
     * @return 成功消息
     */
    @Override
    public AjaxResult put(String key, Object value)
    {
        super.put(key, value);
        return this;
    }

    public static void setTitle(ModelMap map, TitleVo titleVo) {
    	//标题
    	map.put("title",titleVo.getTitle());
    	map.put("parenttitle",titleVo.getParenttitle());
		//是否打开欢迎语
    	map.put("isMsg",titleVo.isMsg());
		//欢迎语
    	map.put("msgHTML",titleVo.getMsgHtml());
		//小控件
    	map.put("isControl",titleVo.isControl());
		map.put("isribbon", titleVo.isIsribbon());
    }
}
