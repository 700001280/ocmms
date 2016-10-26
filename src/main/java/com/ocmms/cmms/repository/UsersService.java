package com.ocmms.cmms.repository;

import java.util.Collections;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.transaction.annotation.Transactional;

import com.ocmms.cmms.model.Users;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UsersService implements UserDetailsService {

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostConstruct
	protected void initialize() {
		save(new Users("user", "user", true, "info@ocmms.com", "13883678760", "13883678760", "ROLE_USER"));
		save(new Users("admin", "admin", true, "info@ocmms.com", "13883678760", "13883678760", "ROLE_ADMIN"));
	}

	@Transactional
	public Users save(Users user) {
		if (usersRepository.findOneByUserName(user.getUserName()) == null) {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			usersRepository.save(user);
			return user;
		} else {
			return null;
		}

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = usersRepository.findOneByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("user not found");
		}
		return createUser(user);
	}

	public void signin(Users user) {
		SecurityContextHolder.getContext().setAuthentication(authenticate(user));
	}

	private Authentication authenticate(Users user) {
		return new UsernamePasswordAuthenticationToken(createUser(user), null,
				Collections.singleton(createAuthority(user)));
	}

	private User createUser(Users user) {
		return new User(user.getUserName(), user.getPassword(), Collections.singleton(createAuthority(user)));
	}

	private GrantedAuthority createAuthority(Users user) {
		return new SimpleGrantedAuthority(user.getRole());
	}

}
