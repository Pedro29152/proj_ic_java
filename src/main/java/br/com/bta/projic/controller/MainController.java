
package br.com.bta.projic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class MainController {

    @Value("${project.version}")
    public String appVersion;

    @Value("${project.name}")
    public String appName;

    @Value("${project.description}")
    public String appDescription;

    @GetMapping({"", "/", "/api"})
    public Map<String, Object> index() {
        Map<String, Object> info = new HashMap<String, Object>();
        info.put("version", appVersion);
        info.put("name", appName);
        info.put("description", appDescription);
        
        return info;
    }

}
