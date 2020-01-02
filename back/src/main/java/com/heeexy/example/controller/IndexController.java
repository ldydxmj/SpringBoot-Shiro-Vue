package com.heeexy.example.controller;

import org.springframework.web.bind.annotation.*;



/**
 * @author: hxy
 * @description: 文章相关Controller
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/hello")
public class IndexController {



	public String index(){
		return "HelloWord";
	}

}
