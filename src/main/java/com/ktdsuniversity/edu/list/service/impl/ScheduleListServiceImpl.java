package com.ktdsuniversity.edu.list.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.list.dao.ScheduleListDao;
import com.ktdsuniversity.edu.list.service.ScheduleListService;
import com.ktdsuniversity.edu.list.vo.ScheduleVO;
import com.ktdsuniversity.edu.list.vo.WriteScheduleVO;

@Service
public class ScheduleListServiceImpl implements ScheduleListService {

	@Autowired
	private ScheduleListDao scheduleListDao ;
	
	@Override
	public List<ScheduleVO> getAllScheduleList() {
		List<ScheduleVO> scheduleVO = this.scheduleListDao.selectAllScheduleList();
		return scheduleVO;
	}

	@Override
	public boolean createSchedule(WriteScheduleVO writeScheduleVO) {
		int rows = this.scheduleListDao.insertSchedule(writeScheduleVO);
		return rows > 0;
	}

	@Override
	public boolean changeState(int id) {
		int rows = this.scheduleListDao.updateState(id);
		return rows > 0;
	}

	@Override
	public boolean removeSchedule(int id) {
		int rows = this.scheduleListDao.deleteSchedule(id);
		return rows > 0;
	}

}
