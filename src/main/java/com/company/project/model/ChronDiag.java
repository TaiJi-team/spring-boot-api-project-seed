package com.company.project.model;

import java.io.Serializable;



import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *  ChronDiag 
 * @author SWJ
 * @date 2020-07-30 16:46:06
 */

public class ChronDiag implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 医保编号 **/
	private String ybbm;
		
	/** 病案号 **/
	private String babm;
		
	/** 诊断科别 **/
	private String zdkb;
		
	/** 就诊日期 **/
	private String jzrq;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date createtime;
		
	/** 更新时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date updateime;
		
		
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
	 
			
	public String getZdkb() {
        return zdkb;
    }

    public void setZdkb(String zdkb) {
        this.zdkb = zdkb;
    }
	 
			
	public String getJzrq() {
        return jzrq;
    }

    public void setJzrq(String jzrq) {
        this.jzrq = jzrq;
    }
	 
			
	public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
	 
			
	public Date getUpdateime() {
        return updateime;
    }

    public void setUpdateime(Date updateime) {
        this.updateime = updateime;
    }
	 
			
	public ChronDiag() {
        super();
    }
    
																																
	public ChronDiag(String ybbm,String babm,String zdkb,String jzrq,Date createtime,Date updateime) {
	
		this.ybbm = ybbm;
		this.babm = babm;
		this.zdkb = zdkb;
		this.jzrq = jzrq;
		this.createtime = createtime;
		this.updateime = updateime;
		
	}
	
}