/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.accountant.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.accountant.entity.Attachment;

/**
 * 原始业务记录DAO接口
 * @author 倪得渊
 * @version 2017-09-26
 */
@MyBatisDao
public interface AttachmentDao extends CrudDao<Attachment> {
	
}