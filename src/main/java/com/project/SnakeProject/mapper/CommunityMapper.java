package com.project.SnakeProject.mapper;

import com.project.SnakeProject.vo.CommunityVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityMapper {
  List<CommunityVo> ViewCommunity(int categoryID);

}
