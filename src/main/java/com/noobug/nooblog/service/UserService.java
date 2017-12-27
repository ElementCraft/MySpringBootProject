package com.noobug.nooblog.service;

import com.noobug.nooblog.model.User;
import com.noobug.nooblog.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService
{
	@Autowired
	private UserRepository userRepo;

	/**
	 * 获取所有用户
	 * @return 用户List
	 */
	public List<User> getAllUsers()
	{
		return userRepo.findAll();
	}

	/**
	 * 获取有电话的用户
	 * @return
	 */
	public List<User> getHavePhoneUsers()
	{
		return userRepo.findByPhoneNotNull();
	}

	/**
	 * 通过ID修改用户积分
	 * @param id    用户ID
	 * @param delta 积分变化值
	 */
	public void fixUserScoreById(Long id, int delta)
	{
		User user = userRepo.findOne(id);
		int score = user.getScore();

		user.setScore(score + delta);
		userRepo.saveAndFlush(user);
	}

	/**
	 * 通过ID获取用户
	 * @return
	 */
	public User getUserById(Long id)
	{
		return userRepo.findOne(id);
	}
}
