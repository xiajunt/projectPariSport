Projet d'un site paris sport avec google app engine.

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