package io.nerdbyteslns.todowebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    @Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(username, password)) {
            model.put("username", username);
            return "welcome";
        } else {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
    }

    @RequestMapping(value = "todo", method = RequestMethod.GET)
    public String gotoToDoPage() {
        return "todo";
    }
}
