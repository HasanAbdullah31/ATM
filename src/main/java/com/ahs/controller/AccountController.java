package com.ahs.controller;

import com.ahs.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("app/account")
public class AccountController {
    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping(value = "/withdrawChecking/{amt}", method = RequestMethod.GET)
    public ModelAndView withdrawChecking(@PathVariable double amt) {
        double curr = userInfoService.getAllBalances().getChecking();
        if (0 <= amt && amt <= curr) userInfoService.setChecking(curr - amt);
        return new ModelAndView(new RedirectView("/app/secure/account-details"));
    }

    @RequestMapping(value = "/withdrawSavings/{amt}", method = RequestMethod.GET)
    public ModelAndView withdrawSavings(@PathVariable double amt) {
        double curr = userInfoService.getAllBalances().getSaving();
        if (0 <= amt && amt <= curr) userInfoService.setSaving(curr - amt);
        return new ModelAndView(new RedirectView("/app/secure/account-details"));
    }

    @RequestMapping(value = "/transferCToS/{amt}", method = RequestMethod.GET)
    public ModelAndView transferCToS(@PathVariable double amt) {
        double curr = userInfoService.getAllBalances().getChecking();
        if (0 <= amt && amt <= curr) userInfoService.checkingToSaving(amt);
        return new ModelAndView(new RedirectView("/app/secure/account-details"));
    }

    @RequestMapping(value = "/transferSToC/{amt}", method = RequestMethod.GET)
    public ModelAndView transferSToC(@PathVariable double amt) {
        double curr = userInfoService.getAllBalances().getSaving();
        if (0 <= amt && amt <= curr) userInfoService.savingToChecking(amt);
        return new ModelAndView(new RedirectView("/app/secure/account-details"));
    }
}
