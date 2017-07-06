package org.bianqi.note.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.note.pojo.Share;
import org.bianqi.note.pojo.ShareExample;

public interface ShareMapper {
    int countByExample(ShareExample example);

    int deleteByExample(ShareExample example);

    int deleteByPrimaryKey(Integer shareId);

    int insert(Share record);

    int insertSelective(Share record);

    List<Share> selectByExampleWithBLOBs(ShareExample example);

    List<Share> selectByExample(ShareExample example);

    Share selectByPrimaryKey(Integer shareId);

    int updateByExampleSelective(@Param("record") Share record, @Param("example") ShareExample example);

    int updateByExampleWithBLOBs(@Param("record") Share record, @Param("example") ShareExample example);

    int updateByExample(@Param("record") Share record, @Param("example") ShareExample example);

    int updateByPrimaryKeySelective(Share record);

    int updateByPrimaryKeyWithBLOBs(Share record);

    int updateByPrimaryKey(Share record);
}