package fr.eni.filsrouge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class RootController {

    @GetMapping("/")
    public Info getRootInfo() {
        return new Info("Votre nom", "votreMail@campus-eni.fr", LocalDate.now().toString());
    }

    // Classe interne pour représenter l'objet retourné
    static class Info {
        private String name;
        private String email;
        private String date;

        public Info(String name, String email, String date) {
            this.name = name;
            this.email = email;
            this.date = date;
        }

        // Getters et setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}

