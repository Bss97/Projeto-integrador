package com.vemdaterra.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vemdaterra.app.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByListEmailContainingIgnoreCase(String email);
	public Optional<Usuario> findAllByEmailContainingIgnoreCase(String email);

}
