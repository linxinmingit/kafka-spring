package cn.yr.producer.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.yr.producer.service.KafkaProducerService;

@Controller
@RequestMapping("kafka")
public class KafkaProducerController {
	@Autowired
	private KafkaProducerService kafkaProducerServiceImpl;
	
	@RequestMapping(value="send",method=RequestMethod.POST)
	public void sendMassager(@PathVariable String topicName)
	{
		kafkaProducerServiceImpl.sendMessage(topicName,String.valueOf(new Timestamp(System.currentTimeMillis())));
	}
	
}
