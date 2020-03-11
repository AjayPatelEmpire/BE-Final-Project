package com.isia.model;
import java.io.File;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Complain_Master")
public class ComplainVO 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="ComplainSubject")
	private String complainSubject;
	
	@Column(name="ComplainDesription")
	private String complainDesription;
	
	@Column(name="ComplainFileName")
	private String complainFileName;
	
	@Column(name="ComplainStatus")
	private String complainStatus;
	
	@Column(name="ComplainDate")
	private String complainDate;
	
	@Column(name="Reply")
	private String reply;
	
	@Column(name="ReplyDate")
	private String replyDate;
	
	@Column(name="ComplainFilePath")
	private String complainFilePath;
	
	@Column(name="Status")
	private boolean status=true;
	
	@ManyToOne
	@JoinColumn(name="Login_ID")
	private LoginVO loginVO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComplainSubject() {
		return complainSubject;
	}

	public void setComplainSubject(String complainSubject) {
		this.complainSubject = complainSubject;
	}

	public String getComplainDesription() {
		return complainDesription;
	}

	public void setComplainDesription(String complainDesr) {
		this.complainDesription = complainDesr;
	}
	public String getComplainFileName() {
		return complainFileName;
	}

	public void setComplainFileName(String complainFileName) {
		this.complainFileName = complainFileName;
	}

	public String getComplainStatus() {
		return complainStatus;
	}

	public void setComplainStatus(String complainStatus) {
		this.complainStatus = complainStatus;
	}

	public String getComplainDate() {
		return complainDate;
	}

	public void setComplainDate(String complainDate) {
		this.complainDate = complainDate;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}

	public String getComplainFilePath() {
		return complainFilePath;
	}

	public void setComplainFilePath(String complainFilePath) {
		this.complainFilePath = complainFilePath;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}
}