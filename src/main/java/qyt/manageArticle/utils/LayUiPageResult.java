package qyt.manageArticle.utils;

import java.util.List;

public class LayUiPageResult {

	
	
		Integer code;
		String msg;
		Integer count;
		List  data;
		public Integer getCode() {
			return code;
		}
		public void setCode(Integer code) {
			this.code = code;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public Integer getCount() {
			return count;
		}
		public void setCount(Integer count) {
			this.count = count;
		}
		public List getData() {
			return data;
		}
		public void setData(List data) {
			this.data = data;
		}
		@Override
		public String toString() {
			return "LayUiPageResult [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
		}
		
		
		
}
