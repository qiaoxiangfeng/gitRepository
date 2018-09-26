package com.bootdo.fandeng.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.fandeng.domain.MemberDO;
import com.bootdo.fandeng.service.MemberService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author qiaoxiangfeng
 * @email 1992lcg@163.com
 * @date 2018-09-23 22:28:53
 */
 
@Controller
@RequestMapping("/fandeng/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping()
	@RequiresPermissions("fandeng:member:member")
	String Member(){
	    return "fandeng/member/member";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fandeng:member:member")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MemberDO> memberList = memberService.list(query);
		int total = memberService.count(query);
		PageUtils pageUtils = new PageUtils(memberList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fandeng:member:add")
	String add(){
	    return "fandeng/member/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("fandeng:member:edit")
	String edit(@PathVariable("id") Long id,Model model){
		MemberDO member = memberService.get(id);
		model.addAttribute("member", member);
	    return "fandeng/member/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fandeng:member:add")
	public R save( MemberDO member){
		if(memberService.save(member)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fandeng:member:edit")
	public R update( MemberDO member){
		memberService.update(member);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fandeng:member:remove")
	public R remove( Long id){
		if(memberService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fandeng:member:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		memberService.batchRemove(ids);
		return R.ok();
	}
	
}
