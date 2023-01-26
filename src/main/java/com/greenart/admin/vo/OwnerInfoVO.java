package com.greenart.admin.vo;

import com.greenart.admin.entity.OwnerInfoEntity;

import lombok.Data;

@Data
public class OwnerInfoVO {
private Long owiSeq;
private String owiId;
private String owiEmail;
private String owiPhone;
private String owiNickname;
private Long owiSiSeq;

public OwnerInfoVO(OwnerInfoEntity entity){
this.owiSeq = entity.getOwiSeq();
this.owiId = entity.getOwiId();
this.owiEmail = entity.getOwiEmail();
this.owiPhone = entity.getOwiPhone();
this.owiNickname = entity.getOwiNickname();
this.owiSiSeq = entity.getOwiSeq();

}
}
