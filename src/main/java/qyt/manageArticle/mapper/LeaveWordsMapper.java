package qyt.manageArticle.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qyt.manageArticle.pojo.LeaveWords;
import qyt.manageArticle.pojo.LeaveWordsExample;

public interface LeaveWordsMapper {
    int countByExample(LeaveWordsExample example);

    int deleteByExample(LeaveWordsExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(LeaveWords record);

    int insertSelective(LeaveWords record);

    List<LeaveWords> selectByExample(LeaveWordsExample example);

    LeaveWords selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") LeaveWords record, @Param("example") LeaveWordsExample example);

    int updateByExample(@Param("record") LeaveWords record, @Param("example") LeaveWordsExample example);

    int updateByPrimaryKeySelective(LeaveWords record);

    int updateByPrimaryKey(LeaveWords record);
}