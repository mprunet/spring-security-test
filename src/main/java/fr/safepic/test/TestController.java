package fr.safepic.test;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("OK");
    }
}
