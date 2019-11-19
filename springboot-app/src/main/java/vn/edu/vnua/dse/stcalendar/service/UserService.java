package vn.edu.vnua.dse.stcalendar.service;

import java.util.Optional;

import vn.edu.vnua.dse.stcalendar.model.User;


public interface UserService {
	public Optional<User> findByUsername(String username);
}
