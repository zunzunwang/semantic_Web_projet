package semweb;

import java.rmi.RemoteException;

public class Main_GenerationXHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url_Albert="http://dbpedia.org/resource/Albert_Einstein";
			GenerationXHTML test = new GenerationXHTML() ;
			/**
			 * test for function generationXHTML. you can find a file html: ./test.html.
			 */
			System.out.println("________________________test of function generationXHTML:_______________________");			
			test.gerneration(url_Albert);
			System.out.println("Success generation. find your file at ./test.html");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

				
				

	}

}
