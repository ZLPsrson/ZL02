package com.bootdo.maintenance.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author admin
 * @email admin@163.com
 * @date 2018-08-09 20:27:29
 */
public class WordInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//目录Id
	private Long treeid;
	//文件名称
	private String filename;
	//文件路径
	private String path;
	//上传人
	private Long userid;
	//上传时间
	private Date createtime;
	
	//文档目录名
    private String dicName;
    //文档目录值
    private String dicValue;
    //文档类型
    private String dicType;
    //用户账号
    private String userName;
    //用户姓名
    private String name;
 

	public String getDicName() {
		return dicName;
	}
	public void setDicName(String dicName) {
		this.dicName = dicName;
	}
	public String getDicValue() {
		return dicValue;
	}
	public void setDicValue(String dicValue) {
		this.dicValue = dicValue;
	}
	public String getDicType() {
		return dicType;
	}
	public void setDicType(String dicType) {
		this.dicType = dicType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：目录Id
	 */
	public void setTreeid(Long treeid) {
		this.treeid = treeid;
	}
	/**
	 * 获取：目录Id
	 */
	public Long getTreeid() {
		return treeid;
	}
	/**
	 * 设置：文件名称
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * 获取：文件名称
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * 设置：文件路径
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * 获取：文件路径
	 */
	public String getPath() {
		return path;
	}
	/**
	 * 设置：上传人
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：上传人
	 */
	public Long getUserid() {
		return userid;
	}
	/**
	 * 设置：上传时间
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	/**
	 * 获取：上传时间
	 */
	public Date getCreatetime() {
		return createtime;
	}
}
