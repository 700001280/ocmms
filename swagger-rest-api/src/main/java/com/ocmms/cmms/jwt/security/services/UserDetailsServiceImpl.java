package com.ocmms.cmms.jwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocmms.cmms.jwt.domain.UserLogin;
import com.ocmms.cmms.jwt.repository.UserLoginRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserLoginRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserLogin user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		return UserDetailsImpl.build(user);
	}

	@Transactional
	public UserDetails loadUserByOpenId(String openid) throws UsernameNotFoundException {
		UserLogin user = userRepository.findByOpenId(openid)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with OpenId: " + openid));

		return UserDetailsImpl.build(user);
	}
}
