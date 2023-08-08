package com.kimu.mybatisexam.DTO;

public class UserParam {

	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberEnrollDt;
	
	public UserParam() {
	}

	public UserParam(String memberId, String memberPwd, String memberName, String memberEnrollDt) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberEnrollDt = memberEnrollDt;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEnrollDt() {
		return memberEnrollDt;
	}

	public void setMemberEnrollDt(String memberEnrollDt) {
		this.memberEnrollDt = memberEnrollDt;
	}

	@Override
	public String toString() {
		return "UserParam [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberEnrollDt=" + memberEnrollDt + "]";
	}
	
}
