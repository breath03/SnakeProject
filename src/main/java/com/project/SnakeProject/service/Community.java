package com.project.SnakeProject.service;

import com.project.SnakeProject.vo.CommunityVo;

import java.util.List;

public interface Community {
  public List<CommunityVo> ViewCommunity(int categoryID);

  public List<CommunityVo> ViewContent(int postNum);

  public int insertTogether(int parameterPostNum, String sessionId);

  public int updatePost(int parameterPostNum ,CommunityVo communityVo);
}
