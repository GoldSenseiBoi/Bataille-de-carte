
# 🃏 Projet Bataille de Cartes

Ce projet consiste à créer un jeu de **Bataille de cartes** en Java, où deux joueurs s'affrontent en tirant des cartes d'un paquet mélangé. Le joueur avec la carte la plus forte gagne le tour, et le jeu continue jusqu'à ce qu'un joueur n'ait plus de cartes.

## 🚀 Fonctionnalités

- 🎴 **Cartes** : Chaque carte a une **couleur** (Cœur, Carreau, Trèfle, Pique) et une **valeur** (2, 3, ..., 10, Valet, Dame, Roi, As).
- 👥 **Deux joueurs** : Chaque joueur tire des cartes à tour de rôle, et celui avec la carte la plus forte remporte le tour.
- 🏆 **Score** : Les joueurs gagnent des points à chaque tour, et à la fin du jeu, le joueur avec le plus de points est déclaré vainqueur.

## 🛠️ Structure du Projet

Le projet utilise Maven pour gérer les dépendances et organiser le code. Voici les classes principales du projet :

1. **Carte** : Représente une carte avec une couleur et une valeur.
2. **Joueur** : Représente un joueur qui possède un ensemble de cartes et un score.
3. **Bataille** : Gère la logique du jeu, distribue les cartes et détermine le gagnant.

## 🧐 Explication des Classes

### 📇 Classe `Carte`

Cette classe représente une carte avec deux attributs :
- **Couleur** : Une des quatre couleurs classiques (Cœur, Carreau, Trèfle, Pique).
- **Valeur** : Les valeurs vont de 2 à As.

Les cartes sont comparées en fonction de leur valeur pour déterminer le gagnant de chaque tour.

### 🧑‍🤝‍🧑 Classe `Joueur`

Chaque joueur a :
- Un **ensemble de cartes** qu'il peut tirer pendant la partie.
- Un **score** qui augmente à chaque fois qu'il gagne un tour.

### ⚔️ Classe `Bataille`

La classe **Bataille** est le cœur du jeu. Elle s'occupe de :
1. **Initialiser un paquet de cartes**.
2. **Mélanger les cartes** de manière aléatoire.
3. **Distribuer les cartes** aux deux joueurs.
4. **Jouer la partie** en comparant les cartes à chaque tour et en ajoutant des points aux joueurs.
5. **Déterminer le vainqueur** à la fin de la partie.

## 📦 Utilisation

### Pré-requis

- **Java** 8 ou supérieur
- **Maven** pour gérer le projet

### 🚀 Lancer le projet

1. **Cloner le dépôt** :
   ```bash
   git clone https://github.com/votre-utilisateur/bataille.git
   cd bataille
   ```

2. **Compiler le projet** avec Maven :
   ```bash
   mvn clean compile
   ```

3. **Exécuter le jeu** :
   ```bash
   mvn exec:java -Dexec.mainClass="com.monjavaprojet.Bataille"
   ```

## 📚 À propos

Ce projet a été réalisé dans le cadre d'un cours de programmation en Java. Le but était de créer un jeu simple utilisant des concepts comme les classes, objets, et la logique de comparaison. Nous avons également utilisé **Maven** pour la gestion de projet.

---

📧 **Contact** : Si vous avez des questions ou des suggestions, n'hésitez pas à me contacter !

```
😃 Amusez-vous bien à jouer à la Bataille de cartes !
```

