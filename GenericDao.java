/**
 * 
 */
package com.mindtree.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @author m1026398
 *
 */
@SuppressWarnings("hiding")
public interface GenericDao<T,ID> {

	
	
	public HibernateTemplate gethibernateTemplate();
	public void insertEntity(T entity);
	public List<T> getAllEntities(Class<T> claz);
}
