# F006 - Réaliser un virement

## Contexte métier

Un client souhaite transférer de l'argent d'un compte vers un autre.

## Fonctionnalité

Effectuer un virement bancaire.

## Critères d'acceptation

- débit du compte source
- crédit du compte destination
- création d'une trace d'opération

## Concepts Java à apprendre

### Exceptions personnalisées

Créer :

- AccountNotFoundException
- InsufficientFundsException

### Objets métier

Manipuler plusieurs objets ensemble.

### Encapsulation métier

Créer :

- debit()
- credit()

dans l'entité Account.

## Concepts Spring Boot à apprendre

### @Transactional

Garantir l'atomicité.

### Service métier

Créer un TransferService.

### Gestion d'erreurs

Transformer une exception en réponse HTTP.

## Concepts d'architecture

### Règle métier

Le compte doit être responsable de son solde.

### Cohésion

La logique bancaire ne doit pas être dans le contrôleur.

## Défis supplémentaires

Empêcher un virement vers le même compte.

## Questions de validation

### Débutant

- Pourquoi utilise-t-on une exception ?
- Quand un virement doit-il être refusé ?
- Quel est le rôle du service ?

### Intermédiaire

- Pourquoi utiliser @Transactional ?
- Que se passe-t-il si le crédit échoue après le débit ?
- Pourquoi créer une exception métier spécifique ?

### Expert

- Le débit doit-il être implémenté dans le Service ou dans l'entité Account ? Pourquoi ?
- Quels sont les risques de concurrence si deux virements arrivent simultanément ?
- Quel niveau d'isolation de transaction choisirais-tu et pourquoi ?
