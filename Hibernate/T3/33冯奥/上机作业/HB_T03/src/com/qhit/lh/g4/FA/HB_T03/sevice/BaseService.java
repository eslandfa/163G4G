/**
 * 
 */
package com.qhit.lh.g4.FA.HB_T03.sevice;

import java.io.Serializable;
import java.util.List;

/**
 * @author FA	
 *2017年12月14日下午7:38:01
 *TODO
 */
public interface BaseService {

	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> query(String str);
}
