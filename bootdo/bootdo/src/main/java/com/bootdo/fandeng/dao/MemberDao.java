package com.bootdo.fandeng.dao;

import com.bootdo.fandeng.domain.MemberDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author qiaoxiangfeng
 * @email 1992lcg@163.com
 * @date 2018-09-23 22:28:53
 */
@Mapper
public interface MemberDao {

	MemberDO get(Long id);
	
	List<MemberDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MemberDO member);
	
	int update(MemberDO member);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
