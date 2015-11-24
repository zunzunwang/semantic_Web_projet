package semweb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import org.semarglproject.jena.rdf.rdfa.JenaRdfaReader;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.RDF;

public class GenerationXHTML {
	protected GenerationXHTML() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void gerneration(String iri){
		PersonExtractor persponExtrator;
		try {
			persponExtrator = new PersonExtractor();
			persponExtrator.showPersonData(iri);
			
			String file_html=
					"<!DOCTYPE html><br>"
					+ "<html><br>"
					+ "<head><br>"
					+ "<title>a new rdfa page</title><br>"
					+ "</head><br>"
					+ "<body><br>"
					+ "<div vocab=\"http://xmlns.com/foaf/0.1/\"typeof=\"Person\"><br>"
					+ "<div Resource=result typeof=\"Person\">"
					+ "<div><br>"
					+ "<img property=\"image\" src=\""+persponExtrator.img+"\" height=400><br>"
					+ "</div><br>"
					+ "<div><br>"
					+ "<span property=\"name\">"+persponExtrator.name+"</span> <br>"
					+ "</div><br>"
					+ "<div><br>"
					+ "Birthday: <span property=\"birthDate\">"+persponExtrator.birthday+"</span><br>"
					+ "</div><br>"
					+ "<div><br>"
					+ "Deathday: <a property=\"deathDate\" >"+persponExtrator.deathday+"</a><br>"
					+ "</div><br>"
					+ "</div><br>"
					+ "</div><br>"
					+ "</body><br>"
					+ "</html><br>";
			System.out.println(file_html);
			File fileName = new File("./test.html");
			PrintWriter outFile = null;
			try {
				outFile = new PrintWriter(fileName);
				outFile.write(file_html);
				outFile.flush();
				outFile.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

	

}
