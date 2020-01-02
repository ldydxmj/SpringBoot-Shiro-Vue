package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: hxy
 * @date: 2017/10/24 16:06
 */
public interface NovelService {
	/**
	 * 新增文章
	 */
	JSONObject addNovel(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	JSONObject listNovel(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	JSONObject updateNovel(JSONObject jsonObject);
}
