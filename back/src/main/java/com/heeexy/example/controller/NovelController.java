package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.NovelService;
import com.heeexy.example.util.CommonUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: hxy
 * @description: 文章相关Controller
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/novel")
public class NovelController {

	@Autowired
	private NovelService novelService;
	private Logger logger = LoggerFactory.getLogger(NovelController.class);
	/**
	 * 查询小说列表
	 */
//	@RequiresPermissions("novel:list")
	@GetMapping("/listNovel")
	public JSONObject listNovel(HttpServletRequest request) {
		logger.error("listNovel的值为:" + request);
		return novelService.listNovel(CommonUtil.request2Json(request));
	}

	/**
	 * 新增小说
	 */
//	@RequiresPermissions("novel:add")
	@PostMapping("/addNovel")
	public JSONObject addNovel(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "author,peoples,hasGaoShou");
		return novelService.addNovel(requestJson);
	}

	/**
	 * 修改文章
	 */
//	@RequiresPermissions("novel:update")
	@PostMapping("/updateNovel")
	public JSONObject updateNovel(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,author,peoples,hasGaoShou");
		return novelService.updateNovel(requestJson);
	}
}
