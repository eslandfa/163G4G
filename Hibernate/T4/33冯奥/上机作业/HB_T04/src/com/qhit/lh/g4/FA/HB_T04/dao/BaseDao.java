/**
 * 
 */
package com.qhit.lh.g4.FA.HB_T04.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author FA
 *2017年12月14日下午7:37:18
 *TODO
 */
public interface BaseDao {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> query(String str);
}
