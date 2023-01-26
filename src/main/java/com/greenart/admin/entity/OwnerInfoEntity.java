package com.greenart.admin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="owner_info")
public class OwnerInfoEntity {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="owi_seq") private Long owiSeq;
    @Column(name="owi_id") private String owiId;
    @Column(name="owi_pwd")  @JsonIgnore private String owiPwd;
    @Column(name="owi_email") private String owiEmail;
    @Column(name="owi_phone") private String owiPhone;
    @Column(name="owi_nickname") private String owiNickname;
    @Column(name="owi_si_seq") private Integer owiSiSeq;
    
}
