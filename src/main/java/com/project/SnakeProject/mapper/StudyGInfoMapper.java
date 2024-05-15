package com.project.SnakeProject.mapper;

import com.project.SnakeProject.vo.StudyGInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyGInfoMapper {
  List<StudyGInfoVo> ViewStudyGInfo();
}
