package br.edu.utfpr.pb.od26s.server.service.impl;

import br.edu.utfpr.pb.od26s.server.model.Usuario;
import br.edu.utfpr.pb.od26s.server.service.UsuarioService;
import br.edu.utfpr.pb.od26s.server.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends CrudServiceImpl<Usuario, Long> implements UsuarioService, UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	protected JpaRepository<Usuario, Long> getRepository() {
		return usuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return usuarioRepository.findByUsername(username).orElseThrow(
				 () -> new UsernameNotFoundException("Usuário não encontrado!")
			   );
	}

}
