package cn.yr.producer.service;

public interface KafkaProducerService {
	void sendMessage(String topicName,String message);
}
