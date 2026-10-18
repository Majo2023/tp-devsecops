# TP DevSecOps - Application democyber

Application Java Spring Boot pour le TP DevSecOps.

## Structure du projet

- `pom.xml` : Configuration Maven
- `src/main/java/com/example/democyber/` : Code source Java
  - `DemoCyberApplication.java` : Classe principale
  - `controller/WebController.java` : Contrôleur web
- `src/main/resources/templates/` : Templates Thymeleaf
- `src/main/resources/` : Configuration
- `Dockerfile` : Image Docker
- `.github/workflows/ci.yml` : Pipeline CI/CD

## Déploiement

- Docker Hub: madjid45/democyber:latest
- GitHub: https://github.com/Majo2023/tp-devsecops
- CI/CD: GitHub Actions
- Security: Gitleaks
