Heuristica 1: Escolleix el node amb pendent mes similar al node final. Utilitza node final i successor.

Heuristica 2: Calcula la distancia entre el successor i el final, en cas d'empat agafa la primera. Utilitza node successor i final.

Heuristica 3: Calcula la distancia entre el successor i el final, tenint en compte tambe la pendent. Utilitza node successor, final i actual.

Noves:
Heuristica 1: Calcula la distancia entre el successor i el final, sense fer sqrt, per ahorrar càlcul.En cas de fer sqr seria admissible.

Heuristica 2: Calculem distància entre successor i final i el multipliquem per una certa importància, aquesta importància fa referència a lo que ens costa mourens cap a la casella successora.

Heuristica 3: Admissible respecte el temps, calculem quants de temps ens costaria mourens de la casella actual a la final tenint en compte que la altura mai canvia.

