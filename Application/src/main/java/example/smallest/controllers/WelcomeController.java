package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET, produces = {"text/html"})
    public @ResponseBody String helloWorld() {

        return "<!DOCTYPE html>"
            + "<html>"
            + "<head>"
            + "<title>DevOps Success</title>"
            + "<style>"
            + "body{margin:0;height:100vh;display:flex;justify-content:center;align-items:center;"
            + "background:linear-gradient(135deg,#0f2027,#203a43,#2c5364);"
            + "font-family:Segoe UI,Tahoma;color:#fff;}"
            + ".card{background:rgba(255,255,255,0.12);padding:40px;border-radius:16px;"
            + "text-align:center;box-shadow:0 10px 25px rgba(0,0,0,0.35);max-width:750px;}"
            + "h1{font-size:36px;margin-bottom:15px;}"
            + "p{font-size:20px;line-height:1.6;}"
            + ".highlight{color:#00eaff;font-weight:bold;}"
            + ".datetime{margin-top:25px;font-size:18px;background:rgba(0,0,0,0.3);"
            + "padding:12px;border-radius:10px;}"
            + "</style>"
            + "</head>"
            + "<body>"
            + "<div class='card'>"
            + "<h1>🎉 Congratulations DevOps Engineer shareef!! 🎉</h1>"
            + "<p>You have <span class='highlight'>successfully deployed your application on Kubernetes ☸️</span><br>"
            + "using an <span class='highlight'>Ansible Playbook 🛠️</span><br>"
            + "automated via <span class='highlight'>GitHub Actions ⚙️🚀</span></p>"
            + "Keep learning, keep automating, and keep scaling 🌍📈</p>"
            + "<p>🚀 All the best for your <span class='highlight'>bright DevOps future 🌟</span> 🎯</p>"
            + "<div class='datetime'>⏰ Date & Time: <span id='clock'></span></div>"
            + "</div>"
            + "<script>"
            + "function updateTime(){"
            + "var now=new Date();"
            + "document.getElementById('clock').innerHTML="
            + "now.toLocaleString('en-IN');}"
            + "setInterval(updateTime,1000);updateTime();"
            + "</script>"
            + "</body>"
            + "</html>";
    }
}
