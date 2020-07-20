package com.company.project.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.*;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Table(name = "ex_task")
@JacksonXmlRootElement(localName = "exTask")
public class ExTask implements Serializable {
    /**
     * 任务定义id
     */
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(generator = "UUID")
    //@JacksonXmlProperty(localName = "id")
    private String id;

    /**
     * 资源目录ID
     */
    @Column(name = "resourceID")
    @JacksonXmlProperty(localName = "resource_id")
    private String resourceid;

    /**
     * 任务名称
     */
    @Column(name = "taskName")
    @JacksonXmlProperty(localName = "task_name")
    private String taskname;

    /**
     * 任务类型
     */
    @Column(name = "taskType")
    @JacksonXmlProperty(localName = "task_type")
    private Integer tasktype;


    /**
     * 任务执行结果列表
     * 
     */
    @Transient
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "ex_results")
    private List<ExResult> exResults;
    
    /**
     * 获取任务定义id
     *
     * @return id - 任务定义id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置任务定义id
     *
     * @param id 任务定义id
     */
    public void setId(final String id) {
        this.id = id;
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
     * 获取任务名称
     *
     * @return taskName - 任务名称
     */
    public String getTaskname() {
        return taskname;
    }

    /**
     * 设置任务名称
     *
     * @param taskname 任务名称
     */
    public void setTaskname(final String taskname) {
        this.taskname = taskname;
    }

    /**
     * 获取任务类型
     *
     * @return taskType - 任务类型
     */
    public Integer getTasktype() {
        return tasktype;
    }

    /**
     * 设置任务类型
     *
     * @param tasktype 任务类型
     */
    public void setTasktype(final Integer tasktype) {
        this.tasktype = tasktype;
    }

    public List<ExResult> getExResults() {
        return exResults;
    }

    public void setExResults(final List<ExResult> exResults) {
        this.exResults = exResults;
    }

}