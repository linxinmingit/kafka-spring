package cn.yr.producer.dao;

public interface KafkaProducerDao {
	
	void sendMessage(String topicName,String message);
}
