package cn.ucmed.mapper;

import cn.ucmed.model.tAuthor;

public interface tAuthorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tAuthor record);

    int insertSelective(tAuthor record);

    tAuthor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tAuthor record);

    int updateByPrimaryKey(tAuthor record);
}