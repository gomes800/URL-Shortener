package com.gom.Url_Shortener.services;

import com.gom.Url_Shortener.domain.ShortUrl;
import com.gom.Url_Shortener.repositories.UrlRepository;
import com.gom.Url_Shortener.util.Base62;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;

    @Value("${app.base-url}")
    private String baseUrl;

    public String shortenUrl(String url) {
        ShortUrl entity = new ShortUrl();
        entity.setOriginalUrl(url);
        ShortUrl saved = urlRepository.save(entity);

        String code = Base62.encode(saved.getId());
        saved.setCode(code);
        urlRepository.save(saved);

        return baseUrl + "/" + code;
    }

    public String searchOriginalUrl(String shortCode) {
        Long id = Base62.decode(shortCode);
        ShortUrl entity = urlRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("URL not found."));
        return entity.getOriginalUrl();
    }
}
