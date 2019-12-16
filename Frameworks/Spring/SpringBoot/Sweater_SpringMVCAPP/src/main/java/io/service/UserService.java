package io.service;

import io.repos.UsrRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private final UsrRepository usrRepository;

    public UserService(UsrRepository userRepository) {
        this.usrRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usrRepository.findByUsername(username);
    }
}
