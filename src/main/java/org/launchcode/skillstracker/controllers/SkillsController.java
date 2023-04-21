package org.launchcode.skillstracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsController {

    @GetMapping
    public String skills() {
        String html =
            "<html>" +
            "<h1>Skills Tracker</h1>" +
            "<body>" +
              "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                  "<li>Java" +
                  "<li>JavaScript" +
                  "<li>Python" +
                "</ol>" +
            "</body>" +
            "</html>";
        return html;
    }

    @GetMapping("form")
    public String studentForm() {
        String options =
            "<option value = 'Java'> Java " +
            "</option>" +
            "<option value = 'JavaScript'> JavaScript " +
            "</option>" +
            "<option value = 'Python'> Python " +
            "</option>";
        String html =
            "<html>" +
              "<body>" +
                "<form method = 'post'>" +
                  "<p style='font-size: 20px'>Name:</br>" +
                    "<input type = 'text' name = 'coder' />" +
                    "</br>My favorite language:</br>" +
                      "<select name = 'o1' >" +
                        options +
                      "</select>" +
                    "</br>My second favorite language:</br>" +
                      "<select name = 'o2' >" +
                        options +
                      "</select>" +
                    "</br>My third favorite language:</br>" +
                      "<select name = 'o3' >" +
                        options +
                      "</select>" + "</br>" +
                    "<input type = 'submit'/>" +
                  "</p>" +
                "</form>" +
              "</body>" +
            "</html>";
        return html;
    }

    @PostMapping("form")
    public String coderList(@RequestParam String coder, String o1, String o2, String o3) {
        String html =
                "<html>" +
                    "<h2>"+coder+"</h2>" +
                    "<ol>" +
                        "<li>"+ o1 +
                        "<li>"+ o2 +
                        "<li>"+ o3 +
                    "</ol>" +
                "</html>";
        return html;
    }
}
