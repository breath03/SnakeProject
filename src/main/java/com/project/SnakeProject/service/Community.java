package com.project.SnakeProject.service;

import com.project.SnakeProject.vo.CommunityVo;

import java.util.List;

public interface Community {
  public List<CommunityVo> ViewCommunity(int categoryID);

}
