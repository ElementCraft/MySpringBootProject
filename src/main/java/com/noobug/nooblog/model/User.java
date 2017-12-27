package com.noobug.nooblog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable
{
	@Id
	@GeneratedValue
	private Long id;
	private String account;
	private String nickName;

	@JsonIgnore
	private String password;
	private String RealName;
	private Integer sex;
	private String phone;
	private String email;
	private Integer cityId;
	private Integer isAuth;
	private Integer isBan;
	private String signature;
	private String iconPath;
	private Timestamp registTime;
	private Integer isPublic;
	private Integer score;
	private Timestamp lastLoginTime;
	private String lastLoginIp;

}
