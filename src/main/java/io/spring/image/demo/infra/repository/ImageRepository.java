package io.spring.image.demo.infra.repository;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository  extends JpaRepository<Image, String> {
}
