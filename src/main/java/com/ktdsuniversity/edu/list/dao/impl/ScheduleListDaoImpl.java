package com.ktdsuniversity.edu.list.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.list.dao.ScheduleListDao;
import com.ktdsuniversity.edu.list.vo.ScheduleVO;
import com.ktdsuniversity.edu.list.vo.WriteScheduleVO;

@Repository
public class ScheduleListDaoImpl extends SqlSessionDaoSupport implements ScheduleListDao{

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	@Override
	public List<ScheduleVO> selectAllScheduleList() {
		return this.getSqlSession()
				.selectList("com.ktdsuniversity.edu.list.dao.ScheduleListDao.selectAllScheduleList");
	}

	@Override
	public int insertSchedule(WriteScheduleVO writeScheduleVO) {
		return this.getSqlSession()
				.insert("com.ktdsuniversity.edu.list.dao.ScheduleListDao.insertSchedule", writeScheduleVO);
	}

	@Override
	public int updateState(int id) {
		return this.getSqlSession()
				.update("com.ktdsuniversity.edu.list.dao.ScheduleListDao.updateState", id);
	}

	@Override
	public int deleteSchedule(int id) {
		return this.getSqlSession()
				.delete("com.ktdsuniversity.edu.list.dao.ScheduleListDao.deleteSchedule", id);
	}
	@Override
	public int selectAllCount() {
		return this.getSqlSession().selectOne("com.ktdsuniversity.edu.list.dao.ScheduleListDao.selectAllCount");
	}



}
