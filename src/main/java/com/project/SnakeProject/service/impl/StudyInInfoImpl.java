package com.project.SnakeProject.service.impl;

import com.project.SnakeProject.mapper.StudyInInfoMapper;
import com.project.SnakeProject.service.StudyInInfo;
import com.project.SnakeProject.vo.StudyInInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyInInfoImpl implements StudyInInfo {

  @Autowired
  private StudyInInfoMapper mapper;

  @Override
  public List<StudyInInfoVo> ViewStudyInInfo() {
    return mapper.ViewStudyInInfo();
  }
}
