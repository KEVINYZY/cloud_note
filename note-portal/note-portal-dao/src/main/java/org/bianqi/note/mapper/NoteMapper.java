package org.bianqi.note.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.note.pojo.Note;
import org.bianqi.note.pojo.NoteExample;

public interface NoteMapper {
    int countByExample(NoteExample example);

    int deleteByExample(NoteExample example);

    int deleteByPrimaryKey(Long nId);

    int insert(Note record);

    int insertSelective(Note record);

    List<Note> selectByExample(NoteExample example);

    Note selectByPrimaryKey(Long nId);

    int updateByExampleSelective(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByExample(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKey(Note record);
}