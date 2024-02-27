package ph.oron.kafkaspringthree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ph.oron.kafkaspringthree.dto.KafkaMessage;
import ph.oron.kafkaspringthree.service.KafkaService;

@RestController
public class KafkaController {


    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/send-message")
    String sendMessage(@RequestBody KafkaMessage message) {

        kafkaService.sendMessage(message);

        return "Hello world!";
    }

}
