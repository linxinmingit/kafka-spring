package cn.yr.producer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KafkaProducerDaoImpl implements KafkaProducerDao {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String topicName, String message) {
		//kafkaTemplate.send(topic, partition, key, data);
		kafkaTemplate.send(topicName, message);
	}

}
