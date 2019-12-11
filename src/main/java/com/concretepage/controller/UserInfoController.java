package com.concretepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.concretepage.service.IUserInfoService;

@Controller
@RequestMapping("app")
public class UserInfoController {
	@Autowired
	private IUserInfoService userInfoService;

	@GetMapping("login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("custom-login");
		return mav;
	}

	@GetMapping("secure/account-details")
	public ModelAndView getAllUserAccounts() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("accountInfo", userInfoService.getAllBalances());
		mav.setViewName("accounts");
		return mav;
	}

	@GetMapping("error")
	public ModelAndView error() {
		ModelAndView mav = new ModelAndView();
		String errorMessage = "You are not authorized for the requested data.";
		mav.addObject("errorMsg", errorMessage);
		mav.setViewName("403");
		return mav;
	}

	@PostMapping("update/checking/{amt}")
	public ModelAndView updateChecking(@RequestParam(value = "amt", required = true) double amt) {
		userInfoService.setChecking(amt);
		ModelAndView mav = new ModelAndView();
		mav.addObject("accountInfo", userInfoService.getAllBalances());
		mav.setViewName("accounts");
		return mav;
	}

	@PostMapping("update/saving/{amt}")
	public ModelAndView updateSaving(@PathVariable("amt") double amt) {
		userInfoService.setSaving(amt);
		ModelAndView mav = new ModelAndView();
		mav.addObject("accountInfo", userInfoService.getAllBalances());
		mav.setViewName("accounts");
		return mav;
	}
}