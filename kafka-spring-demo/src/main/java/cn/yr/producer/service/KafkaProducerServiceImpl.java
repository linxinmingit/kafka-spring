package cn.yr.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.yr.producer.dao.KafkaProducerDao;

@Service
@Transactional
public class KafkaProducerServiceImpl implements KafkaProducerService {
	
	@Autowired
	private KafkaProducerDao kafkaProducerDaoImpl;
	
	public void sendMessage(String topicName, String message) {
		// TODO Auto-generated method stub
		kafkaProducerDaoImpl.sendMessage(topicName, message);
	}

}
