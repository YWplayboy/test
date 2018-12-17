package com.car.static_comment;

import com.car.exception.DBException;

import java.util.List;

public interface BaseComment<T> {
	/**
	 * 通过主键查找对象
	 * @param id
	 * @return
	 */
	public T findById(String id) throws DBException;

	/**
	 * 添加数据
	 * @param obj
	 * @return
	 */
	public int add(T obj) throws DBException;

	/**
	 * 修改数据
	 * @param obj
	 * @return
	 */
	public int update(T obj) throws DBException;

	/**
	 * 删除数据
	 * @param id
	 * @return
	 * @throws DBException
	 */
	public int delete(String id) throws DBException;

	/**
	 * 查询所有
	 * @return
	 * @throws DBException
	 */
	public List<T> findAll() throws DBException;
}
