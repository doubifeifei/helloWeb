package com.baseWeb.mapper;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public interface BaseDao<T> {
	/**
	 *根据ID删除
	 * @param id
	 * @return
	 * @姓名:xiaoting
	 * @时间 2015-10-12 下午4:17:51
	 */
	
	public int deleteByPK(Long id);

	/**
	 * insertByPK
	 * @param record
	 * @姓名:xiaoting
	 * @时间 2015-10-12 下午4:19:41
	 */
	public int insertByPK(T record) ;

	/**
	 * insertBySelective
	 * @param record
	 * @姓名:xiaoting
	 * @时间 2015-10-12 下午4:20:25
	 */
	public int insertBySelective(T record) ;

	/**
	 * 根据ID查询一个实体
	 * @param id
	 * @return
	 * @姓名:xiaoting
	 * @时间 2015-10-12 下午4:20:45
	 */
	public T selectByPK(Long id) ;
	/**
	 * 查询所有的
	 * @param record
	 * @return
	 * @姓名:xiaoting
	 * @时间 2015-10-12 下午4:49:51
	 */
	public List<T> selectListByParam(T record);
	/**
	 * updateBySelective
	 * @param record
	 * @姓名:xiaoting
	 * @时间 2015-10-12 下午4:20:58
	 */
	public int updateBySelective(T record);

	/**
	 * updateByPK
	 * @param record
	 * @姓名:xiaoting
	 * @时间 2015-10-12 下午4:21:08
	 */
	public int updateByPK(T record);
	/**
	 * 分页查询
	 * @param record
	 * @param page
	 * @return
	 * @姓名:xiaoting
	 * @时间 2015-10-12 下午5:21:00
	 */
	public List<T> selectByPage(T record, PageBounds page);
	
	
	public int deleteByPK(T record);
}
