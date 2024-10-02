package com.ktdsuniversity.edu.list.dao;

import java.util.List;

import com.ktdsuniversity.edu.list.vo.ListVO;


public interface ListDao {
	
	public int selectListCount();
	public List<ListVO> selectAllList();
}
