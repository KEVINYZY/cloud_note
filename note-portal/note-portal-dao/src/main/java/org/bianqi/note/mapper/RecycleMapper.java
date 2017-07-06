package org.bianqi.note.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.note.pojo.Recycle;
import org.bianqi.note.pojo.RecycleExample;

public interface RecycleMapper {
    int countByExample(RecycleExample example);

    int deleteByExample(RecycleExample example);

    int deleteByPrimaryKey(Integer recycleId);

    int insert(Recycle record);

    int insertSelective(Recycle record);

    List<Recycle> selectByExampleWithBLOBs(RecycleExample example);

    List<Recycle> selectByExample(RecycleExample example);

    Recycle selectByPrimaryKey(Integer recycleId);

    int updateByExampleSelective(@Param("record") Recycle record, @Param("example") RecycleExample example);

    int updateByExampleWithBLOBs(@Param("record") Recycle record, @Param("example") RecycleExample example);

    int updateByExample(@Param("record") Recycle record, @Param("example") RecycleExample example);

    int updateByPrimaryKeySelective(Recycle record);

    int updateByPrimaryKeyWithBLOBs(Recycle record);

    int updateByPrimaryKey(Recycle record);
}