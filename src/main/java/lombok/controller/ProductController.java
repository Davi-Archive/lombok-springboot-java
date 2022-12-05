package lombok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.model.ProductModel;
import lombok.repository.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductRepository repository;

	@GetMapping
	public ResponseEntity<List<ProductModel>> listarTodos() {
		return ResponseEntity.ok().body(repository.findAll());
	}

	@PostMapping
	public ResponseEntity<ProductModel> salvar(@RequestBody ProductModel product) {
		return ResponseEntity.ok().body(repository.save(product));
	}
}
