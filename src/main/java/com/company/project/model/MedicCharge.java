package com.company.project.model;

import java.io.Serializable;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  MedicCharge 
 * @author SWJ
 * @date 2020-07-29 10:21:37
 */

public class MedicCharge implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	private Long id;
		
	/** 医保编号 **/
	private String ybbm;
		
	/** 病案号 **/
	private String babm;
		
	/** 业务流水号 **/
	private String ywlsh;
		
	/** 结算开始时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date jsqjksrq;
		
	/** 结算结束时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")

	private Date jsqjjsrq;
		
	/** 医保支付方式 **/

	private Integer ybzffs;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")

	private Date createtime;
		
	/** 更新时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")

	private Date updatetime;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getYbbm() {
        return ybbm;
    }

    public void setYbbm(String ybbm) {
        this.ybbm = ybbm;
    }
	 
			
	public String getBabm() {
        return babm;
    }

    public void setBabm(String babm) {
        this.babm = babm;
    }
	 
			
	public String getYwlsh() {
        return ywlsh;
    }

    public void setYwlsh(String ywlsh) {
        this.ywlsh = ywlsh;
    }
	 
			
	public Date getJsqjksrq() {
        return jsqjksrq;
    }

    public void setJsqjksrq(Date jsqjksrq) {
        this.jsqjksrq = jsqjksrq;
    }
	 
			
	public Date getJsqjjsrq() {
        return jsqjjsrq;
    }

    public void setJsqjjsrq(Date jsqjjsrq) {
        this.jsqjjsrq = jsqjjsrq;
    }
	 
			
	public Integer getYbzffs() {
        return ybzffs;
    }

    public void setYbzffs(Integer ybzffs) {
        this.ybzffs = ybzffs;
    }
	 
			
	public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
	 
			
	public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
	 
			
	public MedicCharge() {
        super();
    }
    
																																															
	public MedicCharge(Long id,String ybbm,String babm,String ywlsh,Date jsqjksrq,Date jsqjjsrq,Integer ybzffs,Date createtime,Date updatetime) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.ywlsh = ywlsh;
		this.jsqjksrq = jsqjksrq;
		this.jsqjjsrq = jsqjjsrq;
		this.ybzffs = ybzffs;
		this.createtime = createtime;
		this.updatetime = updatetime;
		
	}
	
}