package utils;
import static utils.ValidationUtils.convertDate;
import static com.app.core.Category.*;
import java.util.HashMap;
import java.util.HashSet;
import com.app.core.Library;
public class CollectionUtils {
	
	//Store book details in a library in hashing based data structure : HashSet
	public static HashSet<Library> populateData() {
		HashSet<Library> library = new HashSet<>();
		try{
			library.add(new Library("Touch of Eternity",FICTION,500,convertDate("1-1-2020"),"Durjoy Dutta",2));
			library.add(new Library("War and Peace",FICTION,500,convertDate("1-1-2020"),"Leo Tolstoy",2));
			library.add(new Library("World's best boyfriend",FICTION,500,convertDate("1-1-2020"),"Durjoy Dutta",3));
			library.add(new Library("Oh yes! I am Single",FICTION,500,convertDate("1-1-2020"),"Durjoy Dutta",2));
			library.add(new Library("Harry Potter",NON_FICTION,500,convertDate("1-1-2020"),"J.K Rowling",2));
		}
		catch(Exception e) {
			System.out.println("In Collection Unit's catch block");
		}
		return library;	
	}

	//Store book details in a library in hashing based data structure : HashMap
	public static HashMap<String, Library> populateHashMap(HashSet<Library> library){
		HashMap<String, Library> map = new HashMap<>();
		for(Library l: library)
			System.out.println("Added in map: "+map.put(l.getTitle(), l));
		return map;
		
	}
}
