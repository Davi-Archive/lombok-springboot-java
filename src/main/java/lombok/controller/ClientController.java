package lombok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.model.ClientModel;
import lombok.repository.ClientRepository;

@RestController
@RequestMapping("/api/client")
public class ClientController {

	@Autowired
	private ClientRepository repository;

	@GetMapping
	public ResponseEntity<List<ClientModel>> listarTodos() {
		return ResponseEntity.ok().body(repository.findAll());
	}

	@PostMapping
	public ResponseEntity<ClientModel> salvar(@RequestBody ClientModel client) {
		return ResponseEntity.ok().body(repository.save(client));
	}
}
