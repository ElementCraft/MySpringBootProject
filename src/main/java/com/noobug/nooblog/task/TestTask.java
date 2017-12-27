package com.noobug.nooblog.task;

import com.noobug.nooblog.model.User;
import com.noobug.nooblog.redis.RedisBase;
import com.noobug.nooblog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestTask
{
	@Autowired
	private UserService userService;

	@Autowired
	private RedisBase<String, User> userRedis;

	@Scheduled(fixedRate = 5000)
	public void test1()
	{
		User user = userService.getUserById(1L);

		userRedis.set("TestUser:1", user);

		log.warn("what {}", userRedis.get("TestUser:1").getScore());
	}
}
