package com.company.project.model;

import java.io.*;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Table(name = "ex_result")
// @XmlAccessorType(XmlAccessType.FIELD)
// @XmlRootElement(name="exResult")
// @JacksonXmlRootElement(localName = "exResult")
public class ExResult implements Serializable {
    /**
     * id
     */
    @Id
    @GeneratedValue(generator = "UUID")
    //@JacksonXmlProperty(localName = "id")
    private String id;

    /**
     * 任务定义id  
     */
    @Column(name = "taskID")
    // @XmlElement(name = "task_id")
    @JacksonXmlProperty(localName = "task_id")
    private String taskid;

    /**
     * 资源目录ID  
     */
    @Column(name = "resourceID")
    // @XmlElement(name = "resource_id")
    @JacksonXmlProperty(localName = "resource_id")
    private String resourceid;

    /**
     * 交换数据总量  
     */
    @Column(name = "exTotal")
    // @XmlElement(name = "ex_total")
    @JacksonXmlProperty(localName = "ex_total")
    private String extotal;

    /**
     * 交换成功的数据量  
     */
    @Column(name = "sucCnt")
    // @XmlElement(name = "suc_cnt")
    @JacksonXmlProperty(localName = "suc_cnt")
    private Integer succnt;

    /**
     * 交换状态   0：交换失败，1：交换成功
     */
    @Column(name = "exState")
    // @XmlElement(name = "ex_state")
    @JacksonXmlProperty(localName = "ex_state")
    private String exstate;

    /**
     * 获取id
     *
     * @return id - 任务定义id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id 任务定义id
     */
    public void setId(final String id) {
        this.id = id;
    }
    
    /**
     * 获取任务定义id  
     *
     * @return taskID - 任务定义id  
     */
    public String getTaskid() {
        return taskid;
    }

    /**
     * 设置任务定义id  
     *
     * @param taskid 任务定义id  
     */
    public void setTaskid(final String taskid) {
        this.taskid = taskid;
    }

    /**
     * 获取资源目录ID  
     *
     * @return resourceID - 资源目录ID  
     */
    public String getResourceid() {
        return resourceid;
    }

    /**
     * 设置资源目录ID  
     *
     * @param resourceid 资源目录ID  
     */
    public void setResourceid(final String resourceid) {
        this.resourceid = resourceid;
    }

    /**
     * 获取交换数据总量  
     *
     * @return exTotal - 交换数据总量  
     */
    public String getExtotal() {
        return extotal;
    }

    /**
     * 设置交换数据总量  
     *
     * @param extotal 交换数据总量  
     */
    public void setExtotal(final String extotal) {
        this.extotal = extotal;
    }

    /**
     * 获取交换成功的数据量  
     *
     * @return sucCnt - 交换成功的数据量  
     */
    public Integer getSuccnt() {
        return succnt;
    }

    /**
     * 设置交换成功的数据量  
     *
     * @param succnt 交换成功的数据量  
     */
    public void setSuccnt(final Integer succnt) {
        this.succnt = succnt;
    }

    /**
     * 获取交换状态   0：交换失败，1：交换成功
     *
     * @return exState - 交换状态   0：交换失败，1：交换成功
     */
    public String getExstate() {
        return exstate;
    }

    /**
     * 设置交换状态   0：交换失败，1：交换成功
     *
     * @param exstate 交换状态   0：交换失败，1：交换成功
     */
    public void setExstate(final String exstate) {
        this.exstate = exstate;
    }
}