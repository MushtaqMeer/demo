package com.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class TopicService {

	
	
	private List<Topics> listTopics=new ArrayList<>(
			Arrays.asList(
					new Topics("100","java"),
					new Topics("101","python")
					)
			);
	

	public List<Topics> getAllTopics() {
		
		return listTopics;
		
	}

	public Topics getTopic(String id) {
		
	return listTopics.stream().filter(t -> t.getCourseid().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
		
		listTopics.add(topic);
	}

	
	
}
