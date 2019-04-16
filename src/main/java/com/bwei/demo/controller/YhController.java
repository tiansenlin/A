package com.bwei.demo.controller;


import com.bwei.demo.entity.Bumen;
import com.bwei.demo.entity.Jiaose;
import com.bwei.demo.entity.Yh;
import com.bwei.demo.service.IYhService;
import com.bwei.demo.uitl.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 田森林 on 2019/3/18.
 */
@Controller
public class YhController {
    @Autowired
    private IYhService iYhService;
    @RequestMapping("list")
    public String list(@RequestParam(defaultValue ="")String mohu,String currentPage, Model m){
        int count=iYhService.count(mohu);
        int pageSize=1;
        Map<Object, Object> map = new HashMap<>();
        PageUtils page=new PageUtils(currentPage,count,pageSize);
        map.put("mohu",mohu);
        map.put("page",page);
        List<Yh> yhList=iYhService.getlist(map);
        m.addAttribute("mohu",mohu);
        m.addAttribute("page",page.getPage());
        m.addAttribute("yhlist",yhList);
        return "list";
    }
    @RequestMapping("toadd")
    public String toadd(){
        return "add";
    }
    @RequestMapping("add")
    @ResponseBody
    public Object add(Yh yh){
        iYhService.add(yh);

        return "redirect:list";
    }
    @RequestMapping("jiaoseadd")
    @ResponseBody
    public Object jiaoseadd(Model model){
        List<Jiaose> jlist=iYhService.getjlist();
        model.addAttribute("jlist",jlist);
        return jlist;
    }
    @RequestMapping("bnameadd")
   @ResponseBody
    public Object bnameadd(Model m){
        List<Bumen> blist=iYhService.getblist();
        m.addAttribute("blist",blist);
        return blist;
    }
    @RequestMapping("del")
    @ResponseBody
    public Object del(int yid){
        iYhService.del(yid);
        return "redirect:list";
    }
}
