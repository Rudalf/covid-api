# CovidFront

## Aperçu du Projet

CovidFront est une application front-end conçue pour interagir avec l'API Covid. Bien que le projet ait atteint plusieurs jalons importants, certaines fonctionnalités sont encore en cours de développement ou rencontrent des problèmes spécifiques.

### Fonctionnalités Implémentées

1. **Liaison avec l'API :** Mise en place de la communication avec les différents endpoints de l'API Covid.
2. **Authentification Sécurisée :** L'infrastructure pour une authentification sécurisée via JWT a été intégrée. Cependant, des problèmes de version côté back-end entravent actuellement la confirmation du bon fonctionnement de cette fonctionnalité.
3. **Page de Connexion :** Une page de connexion a été partiellement implémentée, bien que la gestion des rôles et des utilisateurs dans la base de données ne soit pas encore prise en compte. Le portail pourrait fonctionner avec une base de données mise à jour.
4. **Module de Routing :** Un module de gestion des routes a été mis en place pour rediriger les utilisateurs vers les différentes sections de l'application.
5. **Recherche de Centres par Ville :** Une page permettant la recherche de centres par ville a été implémentée.
6. **Formulaire de Prise de Rendez-vous :** Un formulaire de prise de rendez-vous a été créé, mais la fonction de réservation ne crée pas actuellement une instance de Réservation, mais plutôt une instance de Centre (page utilisée en guise de test de requêtes http).
7. **Menu de Navigation :** Un menu de navigation a été ajouté, bien qu'il ne soit pas encore fonctionnel pour la navigation dans l'ensemble du site.

### Défis et Points à Améliorer

1. **Interface de Monitoring :** L'interface de monitoring pour les rôles Admin et SuperAdmin n'a pas encore été implémentée.
2. **Gestion des Rendez-vous :** La gestion des rendez-vous entre patients, médecins et centres de vaccination n'a pas encore été mise en œuvre.

# Covid-api

## Aperçu du Projet

Covid-api est la partie back-end de l'application, gérant la logique métier et les interactions avec la base de données.

### Fonctionnalités Implémentées

1. **Création de la Base de Données :** La base de données a été créée par programmation, assurant une organisation structurée du projet avec des composants tels que repo-controller-service.
2. **Endpoints Intéressants :** Des endpoints importants pour les fonctionnalités attendues de l'API ont été mis en place.

### Défis et Points à Améliorer

1. **Authentification Sécurisée :** La mise en place de l'authentification sécurisée avec JWT rencontre actuellement des problèmes de version, entravant l'utilisation complète de la librairie JWT, notamment une classe de configuration nécessaire au bon fonctionnement de l'authentification.


# Mise en production

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
