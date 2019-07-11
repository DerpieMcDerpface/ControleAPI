# ControleAPI
My application for the final Java Exam
****************************************************************************
//CONFIG:
port: 9900

config database:
port: 3306
user: root
pwd: root
database name: controleapi
****************************************************************************
//LANCEMENT:

Problème de persistence des données, à la base j'avais fait en sorte que la base ne soit pas supprimé à la fin du run. Mais avec l'introduction d'un fichier SQL pour remplir la base ça pose désormais problème. Mais je ne sais plus quelle option je dois changer pour que ça flush. Du coup, il faut supprimer les tables à chaque lancement.
****************************************************************************
//URL des pages:
  localhost:9900/pokedex/home
  Affiche l'accueil.


  localhost:9900/pokedex/type/all
  Affiche la liste des types.


  J'ai eu un soucis pour générer le lien vers les pages de détails de façon automatique mais c'est possible de le faire à la main:

  localhost:9900/pokedex/pokemon/type/{id}

  en remplaçant {id} par l'id du type souhaité. 



