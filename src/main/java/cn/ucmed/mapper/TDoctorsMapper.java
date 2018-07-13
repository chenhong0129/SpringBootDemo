package cn.ucmed.mapper;

import cn.ucmed.model.TDoctors;

public interface TDoctorsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDoctors record);

    int insertSelective(TDoctors record);

    TDoctors selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDoctors record);

    int updateByPrimaryKey(TDoctors record);
}