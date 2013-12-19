Projet d'un site paris sport avec google app engine.

19/12/2013

Package du projet :

*projetPariSport.cron
contient les traitements periodiques

*projetPariSport.dataCenterTool
contient les outils pour manipuler le data center

*projetPariSport.parameter
contient les parametres de configuration pour l'api

*projetPariSport.saxHandler
contient les parseurs du xml de l'api Sport Data LLC

*projetPariSport.structObject
contient les structures qui sont stocker dans le data center necessaire au fonctionnement de l'application

Avancement :

_Ajout du structure Schedule et tout ce qui tourne autour (Recuperation xml sur le site, le parser, construire la liste et l'ajouter dans le data center).
_Creation d'un traitement periodique pour recuperer la liste des matchs dans le data center.
_Creation de outil pour manipuler le data center (a finir).

18/12/2013

Pour installer les lib pour google app engine sur eclipse:
https://developers.google.com/appengine/docs/java/tools/eclipse?hl=fr

src/projetPariSport/ProjetParisSport.java
exemple de sauvegarde objet dans le data store et recuperation de ce objet.

src/projetPariSport/structObject/Account.java
notre objet qui est stocker dans le data store.

war/pages/logTest.jsp
une page jsp pour tester le fonctionnement de l'identification google account.

war/WEB-INF/web.xml
Les champs filter ont ete ajoute pour que la lib Objectify puisse fonctionner.
Les champs security-constraint sont optionnels, sert a restraindre la partie Admin du site.

16/12/2013

Redaction des specification fonctionnel de l'application