/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 1 - Chapitre 2 : Declarez et initialisez des variables
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir creer et utiliser :
 *
 * - Une variable de type String que vous appelerez "answer". Celle-ci 
 * sera "tardivement" initialisee dans le corps de la methode main() 
 * avec votre prenom.
 * 
 * - Une variable de type String contenant deja la valeur "What is your name ?",
 * que vous appelerez "question"
 *
 * Au lancement du programme, vous afficherez la question, puis initialiserez 
 * la variable "answer" avec votre prenom, et enfin afficherez 
 * la phrase "Your name is VOTRE_PRENOM".
 * 
 * A vous de jouer, et bon courage !
 *
 */
private  lateinit var answer: String;

fun main(args: Array<String>) {
    val question: String = "What is your name ?";
    answer = "Laby Damaro";
    answer = answer.toUpperCase();
    println(question)
    println("Your name is $answer")
    println("Hello OpenClassrooms students !")
}