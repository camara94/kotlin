/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 1 - Chapitre 3 : Implementez differentes fonctions
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir creer :
 *
 * - getResult() : Une fonction retournant le resultat (nombres entiers) d'une addition 
 * entre les deux nombres fournis en parametre
 * - getUsernameUpperCase() : Une fonction retournant le nom de l'utilisateur
 * fourni en parametre, mais tout en majuscule ! 
 * - isUsernameOfTeacher() : Une fonction retournant true si le nom de l'utilisateur
 * fourni en parametre est égale à "Phil" ou "Ambroise", et false dans les autres cas.
 *
 * Au lancement du programme, vous executerez et afficherez le resultat 
 * de ces trois fonctions. 
 * 
 * A vous de jouer, et bon courage !
 *
 */

fun getResult(a: Int, b: Int): Int {
    return a + b;
}

fun getUsernameUpperCase(nom: String): String {
    return nom.toUpperCase();
}

fun isUsernameOfTeacher(nom: String): Boolean {
    return if ( nom == "Phil" || nom == "Ambroise" ) true else false;
}

fun main(args: Array<String>) {
    println("Hello Openclassrooms students !")
    val somme: Int = getResult(40, 56);
    val nom: String = getUsernameUpperCase("mawatta camara");
    var teacher: Boolean = isUsernameOfTeacher("Ambroise");
    
    println("la somme est $somme");
    println("le nom est $nom");
    println("le nom du prof est $teacher");
    