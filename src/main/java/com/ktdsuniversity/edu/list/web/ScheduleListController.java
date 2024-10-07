package com.ktdsuniversity.edu.list.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ktdsuniversity.edu.list.service.ScheduleListService;
import com.ktdsuniversity.edu.list.vo.ScheduleVO;
import com.ktdsuniversity.edu.list.vo.WriteScheduleVO;

@Controller
public class ScheduleListController {

	
	@Autowired
	private ScheduleListService scheduleListService;
	
	@GetMapping("/schedule/list")
	public String viewScheduleList(Model model) {
		List<ScheduleVO> scheduleList = this.scheduleListService.getAllScheduleList();
		model.addAttribute("scheduleList",scheduleList);
		return "schedule/main";
	}
	@GetMapping("/schedule/write")
	public String viewScheduleWrite() {
		return "schedule/write";
	}
	
	@PostMapping("/schedule/write")
	public String writeSchedule(WriteScheduleVO writeScheduleVO) {
		this.scheduleListService.createSchedule(writeScheduleVO);
		return "redirect:/schedule/list";
	}

	@GetMapping("/planboard/chagestate/{id}")
	public String changeState(@PathVariable int id) {
		this.scheduleListService.changeState(id);
		return "redirect:/planboard/list";
	}
	
	@GetMapping("/planboard/delete/{id}")
	public String removeSchedule(@PathVariable int id) {
		this.scheduleListService.removeSchedule(id);
		return "redirect:/planboard/list";
	}
}
