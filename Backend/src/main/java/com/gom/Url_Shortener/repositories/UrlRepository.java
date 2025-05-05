package com.gom.Url_Shortener.repositories;

import com.gom.Url_Shortener.domain.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UrlRepository extends JpaRepository<ShortUrl, UUID> {

}
