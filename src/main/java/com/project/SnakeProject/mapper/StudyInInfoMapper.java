package com.project.SnakeProject.mapper;

import com.project.SnakeProject.vo.StudyInInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyInInfoMapper {
  List<StudyInInfoVo> ViewStudyInInfo();
}
