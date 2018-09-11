package com.example.mybatisgenerator.entity;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Integer userId;

    private String openId;

    private String unionId;

    private String nickName;

    private Byte gender;

    private String avatarUrl;

    private Integer coinAmount;

    private BigDecimal redEnvelopeAmount;

    private Integer sceneCode;

    private Integer channelId;

    private Date createTime;

    private Date updateTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public Integer getCoinAmount() {
        return coinAmount;
    }

    public void setCoinAmount(Integer coinAmount) {
        this.coinAmount = coinAmount;
    }

    public BigDecimal getRedEnvelopeAmount() {
        return redEnvelopeAmount;
    }

    public void setRedEnvelopeAmount(BigDecimal redEnvelopeAmount) {
        this.redEnvelopeAmount = redEnvelopeAmount;
    }

    public Integer getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(Integer sceneCode) {
        this.sceneCode = sceneCode;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}