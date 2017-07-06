package org.bianqi.note.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.note.pojo.Notebook;
import org.bianqi.note.pojo.NotebookExample;

public interface NotebookMapper {
    int countByExample(NotebookExample example);

    int deleteByExample(NotebookExample example);

    int deleteByPrimaryKey(Long nbId);

    int insert(Notebook record);

    int insertSelective(Notebook record);

    List<Notebook> selectByExample(NotebookExample example);

    Notebook selectByPrimaryKey(Long nbId);

    int updateByExampleSelective(@Param("record") Notebook record, @Param("example") NotebookExample example);

    int updateByExample(@Param("record") Notebook record, @Param("example") NotebookExample example);

    int updateByPrimaryKeySelective(Notebook record);

    int updateByPrimaryKey(Notebook record);
}