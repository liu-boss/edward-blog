package com.lhamster.mapper;

import com.lhamster.domain.BlogInform;
import java.util.List;

public interface BlogInformMapper {
    int deleteByPrimaryKey(Integer inId);

    int insert(BlogInform record);

    BlogInform selectByPrimaryKey(Integer inId);

    List<BlogInform> selectAll();

    int updateByPrimaryKey(BlogInform record);
}