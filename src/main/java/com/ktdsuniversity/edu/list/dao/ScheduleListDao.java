package com.ktdsuniversity.edu.list.dao;

import java.util.List;

import com.ktdsuniversity.edu.list.vo.ScheduleVO;
import com.ktdsuniversity.edu.list.vo.WriteScheduleVO;


public interface ScheduleListDao {
	
	public int selectAllCount();
	
	public List<ScheduleVO> selectAllScheduleList();
	
	public int insertSchedule(WriteScheduleVO writeScheduleVO);

	public int updateState(int id);

	public int deleteSchedule(int id);
	
}
