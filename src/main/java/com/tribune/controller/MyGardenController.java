package com.tribune.controller;

import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowGrantsStatement;
import com.tribune.pojo.MyGarden;
import com.tribune.pojo.User;
import com.tribune.service.MyGardenService;
import com.tribune.service.UserService;
import com.tribune.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("myGarden")
public class MyGardenController {
    @Resource
    private MyGardenService myGardenService;
    @Resource
    private UserService userService;

    /**
     * 跳到我的园子页面
     *
     * @return
     */
    @RequestMapping(value = "toMyGardenPage")
    public String toMyGardenPage(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "/my/myGarden";
    }

    /**
     * 发布内容
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "pushContent")
    public String pushContent(HttpServletRequest request, Model model) throws ParseException {
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        String content = request.getParameter("content");
        MyGarden myGarden = new MyGarden();
        myGarden.setContent(content);
        myGarden.setCreatedAt(new Date());
        myGarden.setCreatedPersonId(user.getId());
        myGardenService.pushContent(myGarden);
        return "/my/myGarden";
    }

    /**
     * 跳到全站页面
     *
     * @return
     */
    @RequestMapping(value = "toTotalStationPage")
    public String toTotalStation(HttpServletRequest request, Model model) {
        return "/my/totalStation";
    }

    /**
     * 处理全站页面
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "doTotalStation")
    public String doTatalStation(HttpServletRequest request, Model model) {
        List<User> userList = userService.findUserList();
        model.addAttribute("userList", userList);
        List<MyGarden> gardenList = myGardenService.findTotalStationContent();
        model.addAttribute("gardenList", gardenList);
        return "/my/totalStation";
    }

    /**
     * 删除我发布的内容
     *
     * @return
     */
    @RequestMapping(value = "removeMyGardenContent")
    public String removeMyGardenContent(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        MyGarden myGarden = new MyGarden();
        myGarden.setCreatedPersonId(user.getId());
        String id = request.getParameter("id");
        myGarden.setId(Integer.valueOf(id));
        myGardenService.removeMyGardenContent(myGarden);
        return "/my/myGarden";
    }
}
