# URL Shortener - Backend (Java Spring)

This is the backend of a URL shortener project built with **Java + Spring Boot**.

The system allows you to register long URLs and generate short codes using **Base62 encoding** for fast redirection.

---

## Technologies Used

- Java 17+
- Spring Boot
- PostgreSQL

---

## How to Run

### Requirements:
- Java 17+
- Maven

### Steps:

```bash
git clone https://github.com/gomes800/URL-Shortener

cd URL-Shortener/Backend

./mvnw spring-boot:run
```

    The backend will be running at:
    http://localhost:8080

    Main Endpoints:
    
    POST /shorten
    → Receives a JSON with a long URL and returns a shortened code (Base62).
    Example Request Body: { "url": "https://github.com/" }
    
    GET /{code}
    → Redirects to the original long URL based on the provided short code.
    Returns HTTP 302 (Found) with Location header pointing to the original URL.
    
    
