package Restful;

import Entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.userService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmed on 5/30/2017.
 */

@Controller
public class userRest {

    // --------------------- hibernate AutoWired --------------------------------
    @Autowired(required = true)
    @Qualifier("userService")
    service.userService userService;

    public service.userService getUserService() {
        return userService;
    }

    public void setUserService(service.userService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<user> GetAllUser() {

        return userService.GetAllUser();
    }


}
