package com.bootdo.fandeng.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 
 * 
 * @author qiaoxiangfeng
 * @email 1992lcg@163.com
 * @date 2018-09-23 22:28:53
 */
public class MemberDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//会员ID
	private Long memberId;
	//会员名称
	private String memberName;
	//会员账号
	private String memberNumber;
	//会员手机
	private Long memberPhone;
	//微信号
	private String memberWechat;
	//会员开始时间
	private Date memberBegin;
	//会期结束时间
	private Date memberEnd;
	//邀请人ID
	private Long inviteMemberId;
	//邀请人数
	private Integer inviteNumber;
	//
	private BigDecimal invitePrize;
	//
	private Date createTime;
	//
	private Date updateTime;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：会员ID
	 */
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	/**
	 * 获取：会员ID
	 */
	public Long getMemberId() {
		return memberId;
	}
	/**
	 * 设置：会员名称
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	/**
	 * 获取：会员名称
	 */
	public String getMemberName() {
		return memberName;
	}
	/**
	 * 设置：会员账号
	 */
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	/**
	 * 获取：会员账号
	 */
	public String getMemberNumber() {
		return memberNumber;
	}
	/**
	 * 设置：会员手机
	 */
	public void setMemberPhone(Long memberPhone) {
		this.memberPhone = memberPhone;
	}
	/**
	 * 获取：会员手机
	 */
	public Long getMemberPhone() {
		return memberPhone;
	}
	/**
	 * 设置：微信号
	 */
	public void setMemberWechat(String memberWechat) {
		this.memberWechat = memberWechat;
	}
	/**
	 * 获取：微信号
	 */
	public String getMemberWechat() {
		return memberWechat;
	}
	/**
	 * 设置：会员开始时间
	 */
	public void setMemberBegin(Date memberBegin) {
		this.memberBegin = memberBegin;
	}
	/**
	 * 获取：会员开始时间
	 */
	public Date getMemberBegin() {
		return memberBegin;
	}
	/**
	 * 设置：会期结束时间
	 */
	public void setMemberEnd(Date memberEnd) {
		this.memberEnd = memberEnd;
	}
	/**
	 * 获取：会期结束时间
	 */
	public Date getMemberEnd() {
		return memberEnd;
	}
	/**
	 * 设置：邀请人ID
	 */
	public void setInviteMemberId(Long inviteMemberId) {
		this.inviteMemberId = inviteMemberId;
	}
	/**
	 * 获取：邀请人ID
	 */
	public Long getInviteMemberId() {
		return inviteMemberId;
	}
	/**
	 * 设置：邀请人数
	 */
	public void setInviteNumber(Integer inviteNumber) {
		this.inviteNumber = inviteNumber;
	}
	/**
	 * 获取：邀请人数
	 */
	public Integer getInviteNumber() {
		return inviteNumber;
	}
	/**
	 * 设置：
	 */
	public void setInvitePrize(BigDecimal invitePrize) {
		this.invitePrize = invitePrize;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getInvitePrize() {
		return invitePrize;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
