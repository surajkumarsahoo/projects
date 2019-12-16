package com.mindtree.crudoperation.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.crudoperation.dto.UserDto;

@Service
public interface UserService {

	/**
	 * @param user
	 * @return
	 */
	UserDto insertUserDetail(UserDto user);

	/**
	 * @param userName
	 */
	void deleteUserDetail(String userName);

	/**
	 * @return
	 */
	Set<UserDto> getAllDataOfUser();

	

}
