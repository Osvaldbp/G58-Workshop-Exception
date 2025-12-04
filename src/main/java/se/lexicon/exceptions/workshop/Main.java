package se.lexicon.exceptions.workshop;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import se.lexicon.exceptions.workshop.Exception.Class.DuplicateNameException;
import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;

public class Main {

	public static void main(String[] args) throws IOException, DuplicateNameException {

            List<String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
            List<String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

            List<String> lastNames = CSVReader_Writer.getLastNames();


            NameService nameService = new NameService(maleFirstNames, femaleFirstNames, lastNames);

            Person randomPerson = nameService.getNewRandomPerson();
        System.out.println(randomPerson);


            try {
                nameService.addFemaleFirstName("Selma");
            } catch (DuplicateNameException e) {
                System.out.println("Duplicate name: " + e.getMessage());
            }
            try  {
                nameService.addFemaleFirstName("Anna");
            } catch (DuplicateNameException e) {
                System.out.println("Duplicate name: " + e.getMessage());
            }
	}

}
