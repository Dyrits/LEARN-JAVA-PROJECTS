public class MadLibs {
  /*
  This program generates a mad libbed story.
	Author: Dyrits
	Date: 29/05/2020
  */
  	public static void main(String[] args){
      
  		String name1 = "Dylan";
  		String adjective1 = "wonderful";
  		String adjective2 = "awful";
  		String adjective3 = "powerful";
  		String verb1 = "eat";
  		String noun1 = "book";
  		String noun2 = "movie";
  		String noun3 = "dishwasher";
  		String noun4 = "spoon";
  		String noun5 = "chopsticks";
  		String noun6 = "bycycle";
  		String name2 = "Floraine";
  		int number = 777;
  		String place1 = "South Korea";
  		
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }       
}
