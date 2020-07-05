/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 2 - Chapitre 3 : Decouvrez le Smart Cast
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, guessTheType, permettant de deviner et d'afficher 
 * dans la console le type d'un objet passe en parametre. 
 * Les types supportes seront Int, String, List, Boolean et Array 
 * 
 * - Afficher le resultat de cette fonction dans la console.
 * 
 * 
 * 
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {
	guessTheType(listOf("Laby Damaro"))
   
}

private fun guessTheType(valeur: Any) = when(valeur) {
    is Int -> println("Le type de cette variable est Integer")
    is String -> println("Le type de cette variable est String")
    is List<*> -> println("Le type de cette variable est List")
    is Boolean -> println("Le type de cette variable est Boolean")
    is Array<*>  -> println("Le type de cette variable est Array")
    else -> println("Le type inconnu")
}




















