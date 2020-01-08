package com.dxw.springbootswagger.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  Dxw 
 * @Date 2019-11-27 
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter

public class TUser extends Model<TUser> implements Serializable {

	private static final long serialVersionUID =  8955411356735420907L;


	/**
	 * 用户ID
	 */
	@TableId(type = IdType.ID_WORKER_STR)
	@ApiModelProperty(value="用户id",dataType="String",name="userId")
	private String userId;

	/**
	 * 唯一id
	 */
	private String openId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 部门ID
	 */
	private Long deptId;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 联系电话
	 */
	private String mobile;

	/**
	 * 状态 0锁定 1有效
	 */
	private String status;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	/**
	 * 最近访问时间
	 */
	private Date lastLoginTime;

	/**
	 * 性别 0男 1女 2保密
	 */
	private String ssex;

	/**
	 * 是否开启tab，0关闭 1开启
	 */
	private String isTab;

	/**
	 * 主题
	 */
	private String theme;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 城市
	 */
	private String ctCode;

	/**
	 * 注册人群 1-统战干部 2-新阶层精英 3- 代表人士、4-普通会员和组织
	 */
	private Integer registrationType;

	/**
	 * 出生年月
	 */
	private String birthday;

	/**
	 * 审核状态   -1 -审核中  1-审核通过
	 */
	private Integer auditState;

	/**
	 * 消息开关状态  -1-关闭 1-开启
	 */
	private Integer newsState;

	/**
	 *  登录次数
	 */
	private Integer loginNumber;

	/**
	 * 所属人群
	 */
	private  Integer  theirCrowd;

	/**
	 * 会站
	 */
	@TableField(exist = false)
	private String[] siteId;


 }
