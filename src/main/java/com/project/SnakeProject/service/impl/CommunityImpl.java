package com.project.SnakeProject.service.impl;

import com.project.SnakeProject.mapper.CommunityMapper;
import com.project.SnakeProject.service.Community;
import com.project.SnakeProject.vo.CommunityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityImpl implements Community {

  @Autowired
  private CommunityMapper mapper;

  @Override
  public List<CommunityVo> ViewCommunity(int categoryID) {
    return mapper.ViewCommunity(categoryID);
  }

  @Override
  public List<CommunityVo> ViewContent(int postNum) {
    return mapper.ViewContent(postNum);
  }

  @Override
  public int insertTogether(int parameterPostNum, String sessionId) {
    return mapper.insertTogether(parameterPostNum, sessionId);
  }
}
