/* Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,

the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).

Develop a method getCountry(String CountryName) which iterates through the HashSet and

returns the country if exist else return null.

NOTE: You can test the methods using a main method.
*/

public class July21_11 {

	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("Srilanka");
		countries.saveCountryNames("UAE");
		countries.saveCountryNames("Argentina");
		countries.saveCountryNames("Brazil");
		countries.saveCountryNames("Russia");

		System.out.println("Russia: " + countries.getCountry("Russia"));
		System.out.println("India: " + countries.getCountry("India"));		
	}

}