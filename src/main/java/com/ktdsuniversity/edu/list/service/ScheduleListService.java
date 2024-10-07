package com.ktdsuniversity.edu.list.service;

import java.util.List;

import com.ktdsuniversity.edu.list.vo.ScheduleVO;
import com.ktdsuniversity.edu.list.vo.WriteScheduleVO;

public interface ScheduleListService {

	public List<ScheduleVO> getAllScheduleList();
	public boolean createSchedule(WriteScheduleVO writeScheduleVO);
	public boolean changeState(int id);
	public boolean removeSchedule(int id);
}
