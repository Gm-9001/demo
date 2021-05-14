/** 
 * <pre>项目名称:order_g 
 * 文件名称:TreeBean.java 
 * 包名:com.jk.bean 
 * 创建日期:2021年4月11日下午6:22:34 
 * Copyright (c) 2021, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.bean;

import lombok.Data;

import java.util.List;

/** 
 * <pre>项目名称：order_g    
 * 类名称：TreeBean    
 * 类描述：    
 * 创建人：郭莫
 * 创建时间：2021年4月11日 下午6:22:34    
 * 修改人：郭莫
 * 修改时间：2021年4月11日 下午6:22:34    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class TreeBean {
	private Integer id;
	private String text;
	private String url;
	private Integer pid;
	private List<TreeBean> nodes;
	private Boolean selectable;

}