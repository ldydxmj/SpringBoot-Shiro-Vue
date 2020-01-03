package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.NovelDao;
import com.heeexy.example.service.NovelService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: hxy
 * @date: 2017/10/24 16:07
 */
@Service
public class NovelServiceImpl implements NovelService {

	@Autowired
	private NovelDao novelDao;

	/**
	 * 新增小说
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addNovel(JSONObject jsonObject) {
		novelDao.addNovel(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 小说列表
	 */
	@Override
	public JSONObject listNovel(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = novelDao.countNovel(jsonObject);
		List<JSONObject> list = novelDao.listNovel(jsonObject);
		System.out.println(list);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新小说
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateNovel(JSONObject jsonObject) {
		novelDao.updateNovel(jsonObject);
		return CommonUtil.successJson();
	}
}
