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
  public List<CommunityVo> ViewCommunity() {
    return mapper.ViewCommunity();
  }

}
