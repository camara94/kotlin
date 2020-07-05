/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 1 - Chapitre 4 : Generez vos premieres classes
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une classe "Course" : Cette classe represente un cours sur Openclassrooms. 
 * Elle devra contenir un identifiant, un titre, une duree et un etat (actif ou non).
 *  
 * - Declarer et initialiser ce cours avec toutes ses proprietes 
 * (vous avez libre choix du contenu). Attention toutefois, 
 * l'identifiant ne doit pouvoir etre ni modifie, ni consulte depuis 
 * l'exterieur de la classe. La duree du cours pourra quant à elle etre accessible 
 * mais non modifiable.
 * 
 * - Afficher le titre de votre cours nouvellement initialise.
 * 
 * 
 * 
 * A vous de jouer, et bon courage !
 *
 */
class Course(private val id: Int, var titre: String, val duree: Double, var etat: Boolean)

fun main(args: Array<String>) {
	println("Hello Openclassrooms students !")
    var cours = Course(1, "Angular 8", 425.36, true);
    println("Le titre du cours est ${cours.titre}")
}