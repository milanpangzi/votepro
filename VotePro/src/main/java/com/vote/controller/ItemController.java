package com.vote.controller;


import com.vote.pojo.Item;
import com.vote.pojo.Option;
import com.vote.pojo.Subject;
import com.vote.service.ItemService;
import com.vote.service.OptionService;
import com.vote.service.SubjectService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import java.util.Map;


@Controller
@SessionAttributes(value = {"itemList","pg","map","stitle","osid","check"})
public class ItemController {

    @Autowired
    private ItemService is;
    @Autowired
    private SubjectService ss;
    @Autowired
    private OptionService os;

    @RequestMapping("/registIm")
    public String registIm(){
        return "add";
    }

    @RequestMapping("/List")
    public String selectByConP(@RequestParam Map<String, Object> map, Model model){
        System.out.println("投票控制器》》》》》");
        String pageIndex = (String) map.get("pageIndex");
        String stitle = (String) map.get("stitle");
        if(pageIndex==null){
            pageIndex = "1";
        }
        Page<Object> pg = PageHelper.startPage(Integer.parseInt(pageIndex),2,"sid");

        model.addAttribute("itemList",is.selectByCon(map));
        model.addAttribute("stitle",map.get("stitle"));
        model.addAttribute("map",map);
        model.addAttribute("pg",pg);
        return "votelist";
    }
    /**
     * 新增投票
     * */
    @RequestMapping("/viewList")
    public String addvote(Subject sb,String[] option,Model model,
                          int stype){
        System.out.println("添加投票");
        ss.insertSb(sb);
        int sid = sb.getSid();

        for(int i=0;i<option.length;i++){
            String options = option[i];
            int sids = sid;
            os.insertOp(options,sids);
        }
        return "forward:/List";
    }
    /**
     * 查看投票
     * */
    @RequestMapping("/view")
    public String view(@RequestParam Map<String,Object> map,Model mo){
        System.out.println("查看投票");
        String sid = (String) map.get("sid");
        mo.addAttribute("check",is.selectByCon(map));
        mo.addAttribute("olist",os.selectBySid(Integer.parseInt(sid)));
        System.out.println("osid>>>>:"+sid);
        return "voteview";
    }

    /**
     *
     * 我要参与
     * */
   @RequestMapping("/joinItem")
    public String joinItem(){
       System.out.println("我要参与");
       return "vote";
   }
}
