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
- Security: Gitleaks (secrets) + Trivy (vulnerabilities)

## Pipeline CI/CD

Le workflow `.github/workflows/ci.yml` exécute les étapes suivantes :

1. **Gitleaks** : détection de secrets dans le code et l'historique Git.
2. **Maven** : compilation et packaging de l'application Java 21.
3. **Docker** : construction de l'image et test HTTP sur `/health`.
4. **Trivy** : analyse des vulnérabilités CRITICAL/HIGH de l'image.
5. **Docker Hub** : publication de l'image si toutes les vérifications passent.

Les rapports de sécurité sont disponibles dans les artifacts GitHub Actions
(`gitleaks-report` et `trivy-report`).
