# F001 - Création d'un client

## Contexte métier

La banque doit pouvoir enregistrer ses clients.

## Fonctionnalité

Créer un client avec :

- prénom
- nom
- email

## Critères d'acceptation

- prénom obligatoire
- nom obligatoire
- email obligatoire
- email unique

## Concepts Java à apprendre

### Classe

Créer une classe Customer.

### Constructeur

Créer une instance d'un client.

### Encapsulation

Utiliser des attributs privés.

### Equals et HashCode

Comprendre l'identité d'un objet.

## Concepts Spring Boot à apprendre

### REST Controller

Créer un endpoint :

POST /customers

### JSON

Recevoir des données JSON.

### Bean Validation

Découvrir :

- @NotBlank
- @Email

### Réponse HTTP

Retourner :

- 201 Created

## Concepts d'architecture

### Architecture en couches

- Controller
- Service
- Repository

### Séparation des responsabilités

Comprendre pourquoi un contrôleur ne contient pas la logique métier.

## Défis supplémentaires

Empêcher la création d'un email déjà existant.

## Questions de validation

### Débutant

- Quel est le rôle d'une classe ?
- À quoi sert un constructeur ?
- Pourquoi mettre les attributs en private ?

### Intermédiaire

- Pourquoi utiliser un Service entre le Controller et le Repository ?
- Quelle différence entre validation frontend et backend ?
- Que se passe-t-il si deux clients ont le même email ?

### Expert

- Quel problème résout l'encapsulation ?
- Pourquoi une contrainte en base de données ne remplace-t-elle pas complètement la validation métier ?
- Dans quel cas utiliser un record plutôt qu'une classe ?