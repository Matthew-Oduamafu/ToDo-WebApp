package io.nerdbyteslns.todowebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, <br/> <strong>what are <i>you</i> learning today?</strong>";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuilder bd = new StringBuilder("<!DOCTYPE html>");
        bd.append("<html lang=\"en\">");
        bd.append("<head>");
        bd.append("<meta charset=\"UTF-8\">");
        bd.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        bd.append("    <title>Sample Document</title>");
        bd.append("    <style>");
        bd.append("        body {");
        bd.append("            background-color: #f0f0f0;");
        bd.append("            font-family: Arial, sans-serif;");
        bd.append("        }");
        bd.append("        h1 {");
        bd.append("            color: #333;");
        bd.append("        }");
        bd.append("        p {");
        bd.append("            color: #666;");
        bd.append("        }");
        bd.append("    </style>");
        bd.append("</head>");
        bd.append("<body>");
        bd.append("    <h1>Welcome to my website!</h1>");
        bd.append("    <p>This is a sample paragraph with some text.</p>");
        bd.append("</body>");
        bd.append("</html>");

        return bd.toString();
    }


    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHelloJsp";
    }
}
