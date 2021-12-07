Classe Employe

    Annoter la classe Employe en tant qu'entité pour qu'elle puisse récupérer les données de la table Employe
    Ajouter un champ id de type Long et l'annoter de manière a ce qu'il puisse gérer les identifiants générés automatiquement par MySQL.

Initialisation interface EmployeRepository

    Créer l'interface EmployeRepository dans le package repository et la faire implémenter JpaRepository

Suite interface EmployeRepository

    Déclarer les méthodes permettant d'effectuer les recherches suivantes :
        Recherche d'employés par matricule
        Recherche d'employés par nom et prénom
        Recherche d'employés par nom sans prendre en compte la casse
        Recherche d'employés embauchés avant une certaine date
        Recherche d'employés embauchés après une certaine date
        Recherche d'employés gagnant plus de X euros et ordonnés selon leur salaire (ceux qui gagnent le plus d'abord).

    Ajouter une méthode permettant de rechercher les employés en fonction de leur nom, sans prendre en compte la casse, et ce de manière paginée.

    Ajouter une méthode findByNomOrPrenomAllIgnoreCase prenant en parametre un String nomOuPrenom et qui recherche sans prendre en compte la casse les employés ayant ce paramètre en nom ou en prénom. Utiliser @Param.

    Ajouter une méthode findEmployePlusRiches qui récupère les employés dont le salaire est supérieur au salaire moyen des employés (voir requête SQL exo 13 du TP MySQL)

Héritage

    Mettre en place la stratégie d'héritage ad hoc par rapport à ce qui a été mis en place lors du TP MySQL
    BONUS Créer un repository BaseEmployeRepository générique permettant de factoriser les méthodes d'EmployeRepository pour qu'elles puissent être utilisées dans les repository de entités qui héritent d'Employe
    Créer les Repository pour les entités restantes (en les faisant hériter de BaseEmployeRepository si vous avez fait la question précédente).

Bonus

    Dans le repository de Manager, ajouter une méthode findOneWithEquipeById prenant en paramètre un Long et retournant le manager. Essayer de récupérer l'équipe et voir l'exception levée. Corriger la méthode en ajoutant l'annotation @EntityGraph.
