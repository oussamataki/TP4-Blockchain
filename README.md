
# Blockchain Simple en Java

## Description  
Ce projet implémente une blockchain basique en Java. Chaque bloc contient un index, des données, un horodatage, un hachage unique et le hachage du bloc précédent. L'intégrité de la blockchain est vérifiée en comparant les hachages.

## Structure du Projet  
Le projet contient deux classes principales :  

1. **Block.java**  
   - Représente un bloc de la blockchain.  
   - Génère un hachage unique à l’aide de SHA-256.  
   - Stocke les informations essentielles du bloc (index, données, timestamp, hachage, hachage précédent).  

2. **Main.java**  
   - Initialise une blockchain avec plusieurs blocs.  
   - Vérifie la validité de la chaîne en s'assurant que chaque bloc pointe correctement vers le précédent.  

## Dépendances  
Le projet utilise la bibliothèque **Apache Commons Codec** pour le calcul du hachage SHA-256. Ajoutez cette dépendance à votre projet si nécessaire :  

### Maven  
Ajoutez ceci dans le `pom.xml` :  
```xml
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>1.15</version>
</dependency>
```

### Gradle  
Ajoutez ceci dans `build.gradle` :  
```gradle
dependencies {
    implementation 'commons-codec:commons-codec:1.15'
}
```

## Exécution  
1. Compilez et exécutez `Main.java`.  
2. La blockchain sera affichée avec ses blocs et leur état de validité.  

## Exemple de sortie  
```shell
Block{index=0, data='block 1', timestamp=2024-03-17 12:00:00, currentHash='abc123', previousHash='0'}
Block{index=1, data='block 2', timestamp=2024-03-17 12:01:00, currentHash='def456', previousHash='abc123'}
Block{index=2, data='block 3', timestamp=2024-03-17 12:02:00, currentHash='ghi789', previousHash='def456'}
Block{index=3, data='block 4', timestamp=2024-03-17 12:03:00, currentHash='jkl012', previousHash='ghi789'}
BlockChain Valide
```

## Améliorations possibles  
- Ajouter une preuve de travail (Proof of Work) pour sécuriser la blockchain.  
- Utiliser une base de données pour stocker les blocs de manière persistante.  
- Implémenter un réseau distribué avec synchronisation des blocs.  

