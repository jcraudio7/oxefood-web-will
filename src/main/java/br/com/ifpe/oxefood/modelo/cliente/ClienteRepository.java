package br.com.ifpe.oxefood.modelo.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpe.oxefood.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

  
}

