# covid-api - Debreux Romain

## État d'avancement

J'ai mis en place avec succès le build local de l'application avec Gradle. Cependant, je rencontre des difficultés lors du build avec Jenkins, car Docker semble mal installé sur ma machine Jenkins suite à l'utilisation de la solution d'installation du tutoriel. J'ai tenté de réinstaller Docker, mais sans succès, ce qui m'a empêché de tester ma pipeline Jenkins.

## Instructions pour Tester Localement

### Clonage du Projet

```bash
git clone https://github.com/Rudalf/covid-api.git
```

### Commandes de Build et de Test en Local

```bash
gradle build
docker build -t myapp .
docker-compose up
```

## Pipeline Jenkins

La configuration de la pipeline Jenkins se trouve dans le fichier `Jenkinsfile` du projet. Cependant, je rencontre des problèmes avec l'installation de Docker sur ma machine Jenkins, ce qui empêche son exécution.
