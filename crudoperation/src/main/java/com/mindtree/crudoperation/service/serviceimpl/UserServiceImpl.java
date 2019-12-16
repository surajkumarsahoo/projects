package com.mindtree.crudoperation.service.serviceimpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.crudoperation.dto.UserDto;
import com.mindtree.crudoperation.entity.User;
import com.mindtree.crudoperation.repository.UserRepository;
import com.mindtree.crudoperation.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	private ModelMapper modelMapper=new ModelMapper();
	@Override
	public UserDto insertUserDetail(UserDto user) {
		User userDetail=modelMapper.map(user, User.class);
		userRepository.save(userDetail);
		UserDto userDto=modelMapper.map(userDetail, UserDto.class);
		System.out.println("tryuio");
		return userDto;
	}
	@Override
	public void deleteUserDetail(String userName) {
		userRepository.deleteById(userName);
		
	}
	@Override
	public Set<UserDto> getAllDataOfUser() {
		List<User> users=userRepository.findAll();
		Set<UserDto> userDtos=new HashSet<UserDto>();
		for (User user : users) {
			UserDto userDto=modelMapper.map(user, UserDto.class);
			userDtos.add(userDto);
			
		}
		return userDtos;
	}
}
