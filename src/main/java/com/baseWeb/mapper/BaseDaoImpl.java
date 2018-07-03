package com.baseWeb.mapper;

import com.baseWeb.entity.goods.DataConstants;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements
		BaseDao<T> {
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	public SqlSessionTemplate getSessionTemplate() {
		return sessionTemplate;
	}

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
	public SqlSession getSqlSession() {
		return super.getSqlSession();
	}

	/**
	 * 获取Mapper命名空间.
	 * 
	 * @param sqlId
	 * @return
	 */
	public String getStatement(String sqlId) {
		String name = this.getClass().getName();
		StringBuffer sb = new StringBuffer();
		sb.append(name).append(".").append(sqlId);
		String statement = sb.toString();

		return statement;
	}
	@Override
	public int deleteByPK(Long id) {
		return  getSessionTemplate().delete(getStatement(DataConstants.SQL_DELETE_BY_PK), id);
	}

	@Override
	public int insertByPK(T record) {
		 return getSessionTemplate().insert(getStatement(DataConstants.SQL_INSERT), record);
	}

	@Override
	public int insertBySelective(T record) {
		 return getSessionTemplate().insert(getStatement(DataConstants.SQL_INSERT_SELECTIVE), record);
	}

	@Override
	public T selectByPK(Long  id) {
		getSessionTemplate().clearCache();
		return getSessionTemplate().selectOne(getStatement(DataConstants.SQL_GET_BY_PK), id);
	}

	@Override
	public int updateBySelective(T record) {
		 return getSessionTemplate().update(getStatement(DataConstants.SQL_UPDATE_SELECTIVE), record);
	}

	@Override
	public int updateByPK(T record) {
		return getSessionTemplate().update(getStatement(DataConstants.SQL_UPDATE_BY_PK), record);
	}

	@Override
	public List<T> selectListByParam(T record) {
		return getSessionTemplate().selectList(getStatement(DataConstants.SQL_GET_BY_SELECTIVE), record);
	}

	@Override
	public List<T> selectByPage(T record, PageBounds page) {
		return getSessionTemplate().selectList(getStatement(DataConstants.SQL_GET_BY_SELECTIVE), record,page);
	}
	
	@Override
	public int deleteByPK(T record) {
		return getSessionTemplate().delete(getStatement(DataConstants.SQL_DELETE_BY_PK), record);
	}
}
