/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld.praktikmandiri;
/**
 *
 * @author ivana
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/")
    public String index() {
        return "<div style=\"text-align: center\">\n" +
                "    <h1>Hello World!</h1>\n" +
                "    <h2>Ivan Andika Surya (672019171)</h2>\n" +
                "    <p>Website sederhana ini dibangun menggunakan Framework Spring-boot!</p>\n" +
                "</div>";
    }
}


