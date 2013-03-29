package bdoc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import javax.imageio.stream.FileImageInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.apache.commons.cli.*;


import com.bdoc.interfaces.webservice.interfaces.*;

public class Main {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws ParseException 
	 * @throws ParserConfigurationException 
	 * @throws TransformerException 
	 */
	public static void main(String[] args) throws MalformedURLException, ParseException, ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub
		
		//parsing option s in XML FILE
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder(); 
		
		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("DOCUMENT");
		doc.appendChild(rootElement);
		
		// staff elements
		Element techData = doc.createElement("TECHDATA");
		rootElement.appendChild(techData);
		
		//define String options values
		String nomFichierEntree = null;
		String domaineAComposer = null;
		String modeleAComposer = null;		
		String repertoireSortie = null;
		String channel = null;
		String sortieBDOCEditSingle = null;
		String webService = null;
		
		// create Options object
		Options options = new Options();
		// add t option
		options.addOption("n", true, "nomFichierEntrée");			
		options.addOption("d", true, "domaineAComposer ");		
		options.addOption("m", true, "modeleAComposer ");			
		options.addOption("r", true, "repertoireSortie ");		
		options.addOption("c", true, "Channel ");			
		options.addOption("s", true, "SortieBDOCEditSingle");
		options.addOption("w", true, "webService");
				
		CommandLineParser parser = new BasicParser();
		CommandLine cmd = parser.parse( options, args);

		//read options
		if(cmd.hasOption("n")) {
			nomFichierEntree = cmd.getOptionValue("n");
			// XML elements
			Element nomFichierEntreeNode = doc.createElement("fluxModele");
			nomFichierEntreeNode.appendChild(doc.createTextNode(nomFichierEntree));
			techData.appendChild(nomFichierEntreeNode);
		}
		else {
		    
		}
		
		if(cmd.hasOption("d")) {
			domaineAComposer = cmd.getOptionValue("d");
			// XML elements
			Element domaineAComposerNode = doc.createElement("domaineModele");
			domaineAComposerNode.appendChild(doc.createTextNode(domaineAComposer));
			techData.appendChild(domaineAComposerNode);
		}
		else {
		    
		}
		if(cmd.hasOption("m")) {
			modeleAComposer = cmd.getOptionValue("m");
			// XML elements
			Element modeleAComposerNode = doc.createElement("nomModele");
			modeleAComposerNode.appendChild(doc.createTextNode(modeleAComposer));
			techData.appendChild(modeleAComposerNode);
		}
		else {
		    
		}
		if(cmd.hasOption("r")) {
			repertoireSortie = cmd.getOptionValue("r");
			// XML elements
			Element repertoireSortieNode = doc.createElement("repOutModele");
			repertoireSortieNode.appendChild(doc.createTextNode(repertoireSortie));
			techData.appendChild(repertoireSortieNode);
		}
		else {
		    
		}
		if(cmd.hasOption("c")) {
			channel = cmd.getOptionValue("c");
			// XML elements
			Element channelNode = doc.createElement("channel");
			channelNode.appendChild(doc.createTextNode(channel));
			techData.appendChild(channelNode);
		}
		else {
		    
		}
		if(cmd.hasOption("s")) {
			sortieBDOCEditSingle = cmd.getOptionValue("s");
			// XML elements
			Element sortieBDOCEditSingleNode = doc.createElement("firstname");
			sortieBDOCEditSingleNode.appendChild(doc.createTextNode(sortieBDOCEditSingle));
			techData.appendChild(sortieBDOCEditSingleNode);
		}
		else {
		    
		}
		if(cmd.hasOption("w")) {
			webService = cmd.getOptionValue("w");			
		}
		else {
		    
		}
		
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		//StreamResult result = new StreamResult(new File("C:\\temp\\fileIn.xml"));
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		StreamResult result = new StreamResult(bos);
		transformer.transform(source, result);
		byte []xmlArray=bos.toByteArray();
		
		
	
		  URL portAddress = new URL(webService);
		  try
		  {
			DocumentGenerationImplServiceLocator dGImplServiceLocator = new DocumentGenerationImplServiceLocator();		   
		    DocumentGenerationImplSoapBindingStub dImplServiceLocator = (DocumentGenerationImplSoapBindingStub) dGImplServiceLocator.getDocumentGenerationImpl(portAddress);
			 
		   DocumentGenerationImplSoapBindingStub service = dImplServiceLocator;
		   
		   
		   //WebServiceRetour lists = service.getRessourcesList("BdocWebVELA_5.0");
		   //String params = "<?xml version='1.0' encoding='UTF-8' standalone='no'?><DOCUMENT><TECHDATA><nomModele>I_MODELE_DEMONSTRATION</nomModele><domaineModele>THELEM_HORSPRODUCTION</domaineModele><numEdition>TEST</numEdition><immediat>yes</immediat></TECHDATA><bc type='client' id='101'><lastName>Dupont</lastName><firstName>Georges</firstName><email>g.dupont@yopmail.fr</email><address><address_1>batiment c</address_1><address_2>4 rue des mimosas</address_2><zip>69004</zip><city>Lyon</city><country>France</country></address><phone>+33 4 41 42 43 44</phone><gsm>+33 7 71 72 73 74</gsm><segment>VIP</segment></bc><DESTINATAIRE><nom_complet>Nom Complet destinataire</nom_complet><add_ligne1>Adresse 1</add_ligne1><add_ligne2>Adresse 2</add_ligne2><add_ligne3>Adresse 3</add_ligne3><add_ligne4>Adresse 4</add_ligne4><code_postal>10000</code_postal><ville>VILLE</ville><pays>FR (FRANCE)</pays></DESTINATAIRE><EMETTEUR><nom_complet>Nom Complet emetteur</nom_complet><code_emetteur>Code emetteur</code_emetteur><service>service</service><add_ligne1>Adresse 1</add_ligne1><add_ligne2>Adresse 2</add_ligne2><add_ligne3>Adresse 3</add_ligne3><add_ligne4>Adresse 4</add_ligne4><code_postal>33333</code_postal><ville>VILLE</ville><telephone>0101010101</telephone><email>email@email.fr</email><cart_1>cart1</cart_1><cart_2>cart2</cart_2><cart_3>cart3</cart_3></EMETTEUR><EDITION><date_edition>02/02/2002</date_edition><code_logo>0</code_logo><ville>VILLE</ville><profil>P</profil></EDITION><APPORT><nom>NOM APPORTEUR</nom><code>20000</code><designation>DESIGNATION</designation><add_ligne1>Adresse 1</add_ligne1><add_ligne2>Adresse 2</add_ligne2><add_ligne3>Adresse 3</add_ligne3><add_ligne4>Adresse 4</add_ligne4><code_postal>44444</code_postal><ville>VILLE</ville><telephone>0202020202</telephone><nom_agence>NOM AGENCE</nom_agence></APPORT><SINITRE><numero>NUM000SINSITRE</numero><evenement>Evénement</evenement><fait_generateur>Faits générateurs</fait_generateur><cause>Cause</cause><type>type de dommages</type><date_survenance>01/01/2001</date_survenance><nature_dommages>Natures des dommages : dommages</nature_dommages><add_ligne1>Adresse 1</add_ligne1><add_ligne2>Adresse 2</add_ligne2><add_ligne3>Adresse 3</add_ligne3><add_ligne4>Adresse 4</add_ligne4><code_postal>55555</code_postal><ville>VILLE</ville></SINITRE><CONTRAT><num_client>T10280578</num_client><nom_souscript>NOM-SOUSCRIPTEUR</nom_souscript><prenom_souscript>Prénom-souscripteur</prenom_souscript><genre_souscript>0</genre_souscript><adlign1_souscript>Adresse 1</adlign1_souscript><adlign2_souscript>Adresse 2</adlign2_souscript><adlign3_souscript>Adresse 3</adlign3_souscript><adlign4_souscript>Adresse 4</adlign4_souscript><cp_souscript>55555</cp_souscript><ville_souscript>VILLE</ville_souscript></CONTRAT><PERSONNE><qualite>Assuré sinistré</qualite><nom_complet>NOM COMPLET</nom_complet><add_ligne1>ADRESSE 1</add_ligne1><add_ligne2>ADRESSE 2</add_ligne2><add_ligne3>ADRESSE 3</add_ligne3><add_ligne4>ADRESSE 4</add_ligne4><code_postal>99999</code_postal><ville>VILLE</ville><telephone>0606060606</telephone><references>Références : xxxxxxxx</references></PERSONNE><PERSONNE><qualite>Assuré sinistré</qualite><nom_complet>NOM COMPLET</nom_complet><add_ligne1>ADRESSE 1</add_ligne1><add_ligne2>ADRESSE 2</add_ligne2><add_ligne3>ADRESSE 3</add_ligne3><add_ligne4>ADRESSE 4</add_ligne4><code_postal>99999</code_postal><ville>VILLE</ville><telephone>0606060606</telephone><references>Références : xxxxxxxx</references></PERSONNE><PERSONNE><qualite>Expert</qualite><nom_complet>NOM COMPLET</nom_complet><add_ligne1>ADRESSE 1</add_ligne1><add_ligne2>ADRESSE 2</add_ligne2><add_ligne3>ADRESSE 3</add_ligne3><add_ligne4>ADRESSE 4</add_ligne4><code_postal>88888</code_postal><ville>VILLE</ville><telephone>0808080880</telephone><references>Références : xxxxxxxxx</references><role_parent>Assuré sinistré</role_parent><nom_parent>NOM PARENT</nom_parent><add_ligne1_parent>ADRESSE 1</add_ligne1_parent><add_ligne2_parent>ADRESSE 2</add_ligne2_parent><add_ligne3_parent>ADRESSE 3</add_ligne3_parent><add_ligne4_parent>ADRESSE 4</add_ligne4_parent><code_postal_parent>77777</code_postal_parent><ville_parent>VILLE PARENT</ville_parent><telephone_parent>0505050505</telephone_parent><references_parent>Références parent : aaaaaaaaa</references_parent></PERSONNE><PERSONNE><qualite>Réparateur</qualite><nom_complet>NOM COMPLET</nom_complet><add_ligne1>ADRESSE 1</add_ligne1><add_ligne2>ADRESSE 2</add_ligne2><add_ligne3>ADRESSE 3</add_ligne3><add_ligne4>ADRESSE 4</add_ligne4><code_postal>66666</code_postal><ville>VILLE</ville><telephone>0404040404</telephone><references></references><role_parent>Assuré sinistré</role_parent><nom_parent>NOM PARENT</nom_parent><add_ligne1_parent>ADRESSE 1</add_ligne1_parent><add_ligne2_parent>ADRESSE 2</add_ligne2_parent><add_ligne3_parent>ADRESSE 3</add_ligne3_parent><add_ligne4_parent>ADRESSE 4</add_ligne4_parent><code_postal_parent>77777</code_postal_parent><ville_parent>VILLE PARENT</ville_parent><telephone_parent>0505050505</telephone_parent><references_parent>Références parent : aaaaaaaaa</references_parent></PERSONNE><NOTES><note>instructions 1</note></NOTES><NOTES><note>instructions 2</note></NOTES><PRECISIONS><precisions>precisions 1</precisions></PRECISIONS><PRECISIONS><precisions>precisions 2</precisions></PRECISIONS></DOCUMENT>";
		  /*
		   File F = new File("C:\\test\\fileIn.xml");
		   FileImageInputStream fis = new FileImageInputStream(F);
		   byte [] b = new byte[(int) F.length() ];
		   fis.read(b);
		   */
		   System.out.println("--------BDOCWSClient--------");
		   System.out.println("PARAMETERS:");
		   System.out.println(bos);
		   
		   WebServiceRetour lists = service.generate(xmlArray);
		   
		   System.out.println("RESULT:");
		   System.out.println(lists.getReturnType());
		   
		  }
		  catch (Exception e)
		  {
			  System.out.println("ERROR:");
		   e.printStackTrace();
		  }
		 }
}
