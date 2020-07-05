/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 2 - Chapitre 1 : Gerez des choix et des conditions
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction utilisant la structure de controle "if" uniquement. 
 * Celle-ci devra retourner le plus petit des deux nombres fournis en parametre. 
 * De plus, le résultat devra etre multiplie par 10.
 *  
 * - Creer une enumeration representant les trois couleurs primaires. Puis, 
 * creer une fonction, retournant pour chaque couleur son nom au format String
 * en anglais (par exemple "RED")
 * 
 * - Afficher le resultat de ces deux fonctions dans la console.
 * 
 * 
 * 
 * A vous de jouer, et bon courage !
 *
 */
class Course(private val id: Int, var titre: String, val duree: Double, var etat: Boolean);

fun main(args: Array<String>) {
	println("Hello Openclassrooms students !");
    var min: Int = minOf(14, 7);
    var couleur = CouleurInEnglish(Couleur.VERT);
    
    println("Le minimum est fois 10: $min");
    println("La couleur est préferée est $couleur");
    
   
}

fun minOf(a: Int, b: Int) = if (a < b ) a*10 else b*10
enum class Couleur {
    ROUGE,
    JAUNE,
    VERT
}

fun CouleurInEnglish(couleur: Couleur) = when(couleur) {
    Couleur.ROUGE -> "RED"
    Couleur.JAUNE -> "YELLOW"
    Couleur.VERT -> "GREEN"
}






















