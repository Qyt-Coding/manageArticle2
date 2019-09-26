package qyt.manageArticle.newPojo;

import java.util.List;

import qyt.manageArticle.pojo.Article;
import qyt.manageArticle.pojo.LeaveWords;
import qyt.manageArticle.pojo.Reply;

public class LeaveWordReplayAA {
	
	LeaveWords leaveWords;
	
	List<Reply>  replyList;

	public LeaveWords getLeaveWords() {
		return leaveWords;
	}

	public void setLeaveWords(LeaveWords leaveWords) {
		this.leaveWords = leaveWords;
	}

	public List<Reply> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<Reply> replyList) {
		this.replyList = replyList;
	}

	@Override
	public String toString() {
		return "LeaveWordReplayAA [leaveWords=" + leaveWords + ", replyList=" + replyList + "]";
	}



}
