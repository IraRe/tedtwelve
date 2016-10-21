/**
 * 
 */
package com.prodyna.ted.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodyna.ted.entity.User;

/**
 * @author Iryna Feuerstein, PRODYNA AG
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    public List<User> findAll();

    public void deleteUserById(Long id);

}
