package qyt.manageArticle.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qyt.manageArticle.pojo.Reply;
import qyt.manageArticle.pojo.ReplyExample;

public interface ReplyMapper {
    int countByExample(ReplyExample example);

    int deleteByExample(ReplyExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(Reply record);

    int insertSelective(Reply record);

    List<Reply> selectByExample(ReplyExample example);

    Reply selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByExample(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
    
    List<Reply> selectArticleIdAndLeaveWordId(String  cId,String  bId);
}