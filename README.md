# Kotlin

## Résumé du cours
Ce cours aborde les concepts :
* de variables et des fonctions en Kotlin
* de mécanismes d’une classe en Kotlin
* de structures de contrôle en Kotlin
* de lambdas en Kotlin
* d'extensions en Kotlin
* de conception de classe en Kotli

## Définition
* Kotlin a été développé par Jetbrains dans l’objectif de pallier les limitations qu’imposait Java dans le développement de leurs différents produits.
Kotlin est un langage de programmation qui se veut **concis**, **sûr**, **pragmatique** et **100% interopérable avec Java**.
* Kotlin est un langage de programmation **statiquement typé** supportant néanmoins **l’inférence de type** grâce à son compilateur.
* Kotlin supporte la **programmation orientée objet** et la **programmation fonctionnelle**.
* Kotlin est open source, supporte la plupart des IDEs et fonctionne sur la majorité des plateformes Java actuelles (où le bytecode JVM est accepté).

## Variable
En kotlin, il ya trois façons de declarer une variable
* <code>val question = "Bonjour Camara"</code> c'est l'équivalent d'une finale en java;
* <code>val question = "Bonjour tout le monde !"</code> 
* <code>var question?: string = "je peux contenir null"</code>;là on peut changer le contenu quand on veut;
* <code>val message: String? = "Bienvenue sur notre beau site"</code> le point d'interogation permet d'indiquer que la variable peut contenir null.

## Déclarez et initialisez des variables
* Le mot-clé  **val**  permet de créer une variable dont la référence sera immuable (qui ne peut pas être modifiée après son initialisation).
* Le mot-clé  **var**  permet de créer une variable dont la référence sera muable (qui peut être modifiée après son initialisation).
* **Kotlin** ne vous oblige pas à mentionner obligatoirement le type d’une variable lors de sa déclaration (grâce à l’inférence de type).
* Une **variable  val**  doit être initialisée dans le même bloc de code que celui où elle a été déclarée.
* Vous pouvez définir une variable comme pouvant contenir une valeur nulle grâce au point d’interrogation  **?** .
* Une constante se définit grâce au mot-clé  **const**  suivi du mot-clé **val**  .
* Vous pouvez définir une variable comme étant **initialisable plus tard** dans votre code grâce au mot-clé  **lateinit**  .

## Fonction en Kotlin
Une fonction se déclare grâce au mot-clé  fun  en Kotlin.
* Le type d’un paramètre de fonction est indiqué après son nom. Les deux points  :  indiquent toujours la déclaration d’un type en Kotlin.
* **Une expression** est une partie de votre code qui peut retourner une valeur. **Une instruction** est un bloc de code qui ne retourne aucune valeur.
* En Kotlin, toutes les fonctions retournent une valeur, même si aucun type de retour n’est mentionné (le type retourné par défaut sera alors **Unit**).
* Une fonction n’est pas obligée de posséder un corps et peut contenir uniquement une expression.

## Class en Kotlin
* Une classe se déclare grâce au mot-clé  **class**  .
* Par défaut, la visibilité d’une classe est  **public**  en Kotlin.
* Les propriétés d’une classe peuvent se déclarer directement dans son constructeur primaire.
* Le mot-clé  val  placé devant le nom d’une propriété dans le constructeur d’une classe permet d’indiquer à Kotlin de générer automatiquement un assesseur.
* Le mot-clé  var  placé devant le nom d’une propriété dans le constructeur d’une classe permet d’indiquer à Kotlin de générer automatiquement un assesseur ET un mutateur.

## Les Conditions et les énumeration en Kotlin
* En Kotlin, toutes les structures de contrôles (sauf les boucles) sont des expressions et peuvent retourner des valeurs.
* L’opérateur ternaire n’existe plus en Kotlin, mais peut être facilement remplacé par une condition  if  .
* L’instruction  switch  n’existe plus en Kotlin. Celle-ci est remplacée par l'expression  when  beaucoup plus concise.
* Pour créer une énumération en Kotlin, vous devrez utiliser les mots-clés  enum class  suivis du nom de l’énumération.

## Les Boucles en Kotlin
En Kotlin, la syntaxe pour écrire une itération  while  ne diffère pas de son homologue Java.
* La boucle  for  s’utilise désormais sous la forme  **item** in **elements**  .
* Vous pouvez utiliser des intervalles en Kotlin afin de créer une plage de données à parcourir 
(1..10  signifie une plage de 1 à 10 inclus).
* Le mot-clé  step  dans une boucle  for  permet de **sauter** des itérations.
* Vous pouvez créer facilement des collections de données immuables grâce aux méthodes  **listOf**  et  **setOf**

## Cast en Kotlin
* En Kotlin, le mot-clé  instanceof  n’existe plus et est remplacé par  **is**  .
* Le Smart Cast (ou **conversion intelligente**) est la déduction automatique du type par le compilateur de Kotlin après une vérification avec  **is**  .
* Le **Unsafe Cast** (ou **conversion non sécurisée**) est la tentative de conversion du type d’une variable en un autre grâce au mot-clé  **as** . Si la tentative échoue, une erreur de type  ClassCastException  sera déclenchée.
* Le **Safe Cast** (ou **conversion sécurisée**) est la tentative de conversion du type d’une variable en un autre grâce au mot-clé  **as**  suivi du point d’interrogation  **?** . Si la tentative échoue, l'expression sera  null.

## Les Exceptions en Kotlin
* En Kotlin, une exception se gère comme en Java, grâce aux mots-clés  **try**  et  **catch**  .
* Contrairement à Java, en Kotlin, une fonction pouvant renvoyer une exception n’a pas besoin du mot-clé  **throws**  dans sa signature.
* **try**  ,  **catch**  et  throw  sont des expressions en Kotlin et pourront donc renvoyer une valeur. 
* La classe  Nothing  représente une **valeur inexistante**, utilisée notamment par une fonction ne renvoyant qu’une exception (et jamais de valeur).
* L’opérateur Elvis  ?:  permet de définir une action alternative si l'expression le précédant est égale à nulle.
