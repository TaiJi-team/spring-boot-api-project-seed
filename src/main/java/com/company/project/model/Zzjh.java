package com.company.project.model;

import java.io.Serializable;


import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  Zzjh 
 * @author SWJ
 * @date 2020-07-29 11:14:17
 */
public class Zzjh implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	private Long id;
		
	/** 医保编号 **/
	private String ybbm;
		
	/** 病案号 **/
	private String babm;
		
	/** 病房类型 **/
	private Integer bflx;
		
	/** 进重症监护室时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date jrsj;
		
	/** 出重症监护室时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date clsj;
		
		
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
	 
			
	public Integer getBflx() {
        return bflx;
    }

    public void setBflx(Integer bflx) {
        this.bflx = bflx;
    }
	 
			
	public Date getJrsj() {
        return jrsj;
    }

    public void setJrsj(Date jrsj) {
        this.jrsj = jrsj;
    }
	 
			
	public Date getClsj() {
        return clsj;
    }

    public void setClsj(Date clsj) {
        this.clsj = clsj;
    }
	 
			
	public Zzjh() {
        super();
    }
    
																																
	public Zzjh(Long id,String ybbm,String babm,Integer bflx,Date jrsj,Date clsj) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.bflx = bflx;
		this.jrsj = jrsj;
		this.clsj = clsj;
		
	}
	
}