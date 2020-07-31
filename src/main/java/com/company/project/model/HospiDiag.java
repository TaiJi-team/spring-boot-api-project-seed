package com.company.project.model;

import java.io.Serializable;


import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  HospiDiag 
 * @author SWJ
 * @date 2020-07-30 16:46:16
 */
public class HospiDiag implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	private Long id;
		
	/** 医保编号 **/
	private String ybbm;
		
	/** 病案号 **/
	private String babm;
		
	/** 住院医院类型 **/
	private Integer zyyllx;
		
	/** 入院途径 **/
	private Integer rytj;
		
	/** 治疗类别 **/
	private Integer zllb;
		
	/** 入院时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date rysj;
		
	/** 入院科别 **/
	private Integer rykb;
		
	/** 转科科别 **/
	private Integer zkkb;
		
	/** 出院时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date cysj;
		
	/** 出院科别 **/
	private Integer cykb;
		
	/** 实际住院天数 **/
	private Integer sjzyts;
		
	/** 诊断代码计数 **/
	private String zddmjs;
		
	/** 手术及操作代码计数 **/
	private String ssczjs;
		
	/** 呼吸机使用时间 **/
	private String hxjsysj;
		
	/** 输血量 **/
	private String sxl;
		
	/** 输血计量单位 **/
	private String jldw;
		
	/** 特级护理天数 **/
      
	private String tjhlts;
		
	/** 一级护理天数 **/
	private String yjhlts;
		
	/** 二级护理天数 **/
	private String ejhlts;
		
	/** 三级护理天数 **/
	private String sjhlts;
		
	/** 离院方式 **/
	private String lyfs;
		
	/** 是否再住院 **/
	private String sfzzy;
		
	/** 主诊医师姓名 **/
	private String zysmc;
		
	/** 主诊医师代码 **/
	private String zzysdm;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date createTime;
		
	/** 更新时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date updateTime;
		
	/** 输血品种 **/
	private String sxbz;
		
	/**  **/
	private String cyxyzy;
		
	/**  **/
	private String cyzyzb;
		
	/**  **/
	private String sjczzy;
		
	/**  **/
	private String lnsshmsj;
		
	/**  **/
	private String yzzy;
		
		
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
	 
			
	public Integer getZyyllx() {
        return zyyllx;
    }

    public void setZyyllx(Integer zyyllx) {
        this.zyyllx = zyyllx;
    }
	 
			
	public Integer getRytj() {
        return rytj;
    }

    public void setRytj(Integer rytj) {
        this.rytj = rytj;
    }
	 
			
	public Integer getZllb() {
        return zllb;
    }

    public void setZllb(Integer zllb) {
        this.zllb = zllb;
    }
	 
			
	public Date getRysj() {
        return rysj;
    }

    public void setRysj(Date rysj) {
        this.rysj = rysj;
    }
	 
			
	public Integer getRykb() {
        return rykb;
    }

    public void setRykb(Integer rykb) {
        this.rykb = rykb;
    }
	 
			
	public Integer getZkkb() {
        return zkkb;
    }

    public void setZkkb(Integer zkkb) {
        this.zkkb = zkkb;
    }
	 
			
	public Date getCysj() {
        return cysj;
    }

    public void setCysj(Date cysj) {
        this.cysj = cysj;
    }
	 
			
	public Integer getCykb() {
        return cykb;
    }

    public void setCykb(Integer cykb) {
        this.cykb = cykb;
    }
	 
			
	public Integer getSjzyts() {
        return sjzyts;
    }

    public void setSjzyts(Integer sjzyts) {
        this.sjzyts = sjzyts;
    }
	 
			
	public String getZddmjs() {
        return zddmjs;
    }

    public void setZddmjs(String zddmjs) {
        this.zddmjs = zddmjs;
    }
	 
			
	public String getSsczjs() {
        return ssczjs;
    }

    public void setSsczjs(String ssczjs) {
        this.ssczjs = ssczjs;
    }
	 
			
	public String getHxjsysj() {
        return hxjsysj;
    }

    public void setHxjsysj(String hxjsysj) {
        this.hxjsysj = hxjsysj;
    }
	 
			
	public String getSxl() {
        return sxl;
    }

    public void setSxl(String sxl) {
        this.sxl = sxl;
    }
	 
			
	public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }
	 
			
	public String getTjhlts() {
        return tjhlts;
    }

    public void setTjhlts(String tjhlts) {
        this.tjhlts = tjhlts;
    }
	 
			
	public String getYjhlts() {
        return yjhlts;
    }

    public void setYjhlts(String yjhlts) {
        this.yjhlts = yjhlts;
    }
	 
			
	public String getEjhlts() {
        return ejhlts;
    }

    public void setEjhlts(String ejhlts) {
        this.ejhlts = ejhlts;
    }
	 
			
	public String getSjhlts() {
        return sjhlts;
    }

    public void setSjhlts(String sjhlts) {
        this.sjhlts = sjhlts;
    }
	 
			
	public String getLyfs() {
        return lyfs;
    }

    public void setLyfs(String lyfs) {
        this.lyfs = lyfs;
    }
	 
			
	public String getSfzzy() {
        return sfzzy;
    }

    public void setSfzzy(String sfzzy) {
        this.sfzzy = sfzzy;
    }
	 
			
	public String getZysmc() {
        return zysmc;
    }

    public void setZysmc(String zysmc) {
        this.zysmc = zysmc;
    }
	 
			
	public String getZzysdm() {
        return zzysdm;
    }

    public void setZzysdm(String zzysdm) {
        this.zzysdm = zzysdm;
    }
	 
			
	public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
	 
			
	public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
	 
			
	public String getSxbz() {
        return sxbz;
    }

    public void setSxbz(String sxbz) {
        this.sxbz = sxbz;
    }
	 
			
	public String getCyxyzy() {
        return cyxyzy;
    }

    public void setCyxyzy(String cyxyzy) {
        this.cyxyzy = cyxyzy;
    }
	 
			
	public String getCyzyzb() {
        return cyzyzb;
    }

    public void setCyzyzb(String cyzyzb) {
        this.cyzyzb = cyzyzb;
    }
	 
			
	public String getSjczzy() {
        return sjczzy;
    }

    public void setSjczzy(String sjczzy) {
        this.sjczzy = sjczzy;
    }
	 
			
	public String getLnsshmsj() {
        return lnsshmsj;
    }

    public void setLnsshmsj(String lnsshmsj) {
        this.lnsshmsj = lnsshmsj;
    }
	 
			
	public String getYzzy() {
        return yzzy;
    }

    public void setYzzy(String yzzy) {
        this.yzzy = yzzy;
    }
	 
			
	public HospiDiag() {
        super();
    }
    
																																																																																																																																																																							
	public HospiDiag(Long id,String ybbm,String babm,Integer zyyllx,Integer rytj,Integer zllb,Date rysj,Integer rykb,Integer zkkb,Date cysj,Integer cykb,Integer sjzyts,String zddmjs,String ssczjs,String hxjsysj,String sxl,String jldw,String tjhlts,String yjhlts,String ejhlts,String sjhlts,String lyfs,String sfzzy,String zysmc,String zzysdm,Date createTime,Date updateTime,String sxbz,String cyxyzy,String cyzyzb,String sjczzy,String lnsshmsj,String yzzy) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.zyyllx = zyyllx;
		this.rytj = rytj;
		this.zllb = zllb;
		this.rysj = rysj;
		this.rykb = rykb;
		this.zkkb = zkkb;
		this.cysj = cysj;
		this.cykb = cykb;
		this.sjzyts = sjzyts;
		this.zddmjs = zddmjs;
		this.ssczjs = ssczjs;
		this.hxjsysj = hxjsysj;
		this.sxl = sxl;
		this.jldw = jldw;
		this.tjhlts = tjhlts;
		this.yjhlts = yjhlts;
		this.ejhlts = ejhlts;
		this.sjhlts = sjhlts;
		this.lyfs = lyfs;
		this.sfzzy = sfzzy;
		this.zysmc = zysmc;
		this.zzysdm = zzysdm;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.sxbz = sxbz;
		this.cyxyzy = cyxyzy;
		this.cyzyzb = cyzyzb;
		this.sjczzy = sjczzy;
		this.lnsshmsj = lnsshmsj;
		this.yzzy = yzzy;
		
	}
	
}