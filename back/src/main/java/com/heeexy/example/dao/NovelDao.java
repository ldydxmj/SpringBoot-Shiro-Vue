package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author: hxy
 * @description: 文章Dao层
 * @date: 2017/10/24 16:06
 */
public interface NovelDao {
	/**
	 * 新增文章
	 */
	int addNovel(JSONObject jsonObject);

	/**
	 * 统计文章总数
	 */
	int countNovel(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	List<JSONObject> listNovel(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	int updateNovel(JSONObject jsonObject);
}
