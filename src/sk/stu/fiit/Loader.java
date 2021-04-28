/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author patoh
 */
public class Loader {
    
  
    private static User currentlyLogged;
 
    private static ArrayList<User> users;
    //key : project ID
    private static HashMap<String, Project> projects;
    private static final Logger LOGGER = Logger.getLogger(Loader.class.getName());
    
    static{
        currentlyLogged = null;
        users = new  ArrayList<>();
        projects = new HashMap<>();
        
    }
    
    //cesta k suboru kde sa ukladaju data
    private static final String SAVEFILE = "save.ser";
    //cesta k XML suboru
    private static final String SETTINGSFILE = "src/sk/stu/fiit/xml/settings.xml";

    public static User getCurrentlyLogged() {
        return currentlyLogged;
    }

    public static void setCurrentlyLogged(User currentlyLogged) {
        Loader.currentlyLogged = currentlyLogged;
    }
    
    public static void logoutUser(){
        currentlyLogged = null;               
                
    }
            
    public static void addProject(Project project){
        projects.put(project.getId(), project);
        save();
    }
    
    public static HashMap<String, Project> getProjects(){
        return projects;
    }
    
    public static void addUser(User user){
        users.add(user);
        save();
    }
    
    public static ArrayList<User> getUsers(){
        return users;
    }
    
    /**
     * Funkcia, ktora vykona serializaciu statickych kolekcii v tejto triede,
     * Uklada zoznam projektov a zoznam vytvorenych pouzivatelov.
     */
    public static void save(){
        FileOutputStream savefile;
        
        try{
            savefile = new FileOutputStream(SAVEFILE);
            ObjectOutputStream output = new ObjectOutputStream(savefile);
            
            output.writeObject(users);
            output.writeObject(projects);
            output.close();
            savefile.close();
            LOGGER.log(Level.INFO, "Data bili ulozene");
                  
        }catch(IOException ex){
            LOGGER.log(Level.SEVERE, "Chyba pri ukladani dat.\n{0}", ex.getMessage());
        }
   
    }

    /**
     * Funkcia sluziaca pre nacitavanie serializovanych dat.
     * @throws ClassNotFoundException 
     */
    public static void load() throws ClassNotFoundException{
              
            FileInputStream savefile;
        
        try{
            savefile = new FileInputStream(SAVEFILE);
            ObjectInputStream input = new ObjectInputStream(savefile);
            
            users = (ArrayList<User>)input.readObject();
            projects = (HashMap<String,Project>)input.readObject();
            input.close();
            input.close();
            LOGGER.log(Level.INFO, "Data uspesne nacitane");
                  
        }catch(IOException | ClassNotFoundException ex){
            LOGGER.log(Level.INFO, "Nepodarilo sa uspesne nacitat data.{0}", ex.getMessage());
        }
       
        
    }
    
    /**
     * Funkcia sluziaca pre najdene pouzivatela v zozname pouzivatelov podla
     * jeho prihlasovacieho mena.
     * @param username Prihlasovacie meno pouzivatela.
     * @return Ak sa v zozname nachadza pouzivatel so zadanym pouzivatelskym menom
     * tak vrati jeho instanciu. Inak null.
     */
    public static User findUser(String username){
        for(User user : users){
            if(user.getUsername().equals(username))
                return user;
        }
        return null;
    }
    
    
    /**
     * Funkcia sluziaca pre vyhladanie zaznamu s ulozenym rozmerov v XML subore.
     * @param classname Nazov triedy (zaznamu), pre ktore sa vyhladavaju rozmery.
     * @return Rozmery pozadovaneho komponentu.
     */
    public static Dimension lookupDimension(String classname){
        
         try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document input = factory.newDocumentBuilder().parse(SETTINGSFILE);
            
            Node root = input.getFirstChild();
            
            NodeList windows = ((Element)root).getElementsByTagName("window");
            int width = 0;
            int height = 0;
            
            for(int i =0; i < windows.getLength(); i++){
                Element window = (Element) windows.item(i);
                
                NodeList windowNodes = ((Node)window).getChildNodes();
              
                for(int k = 0; k < windowNodes.getLength(); k++){
                    
                 
                    Element record ;
                    try{
                         record =(Element) windowNodes.item(k);
                    }catch(ClassCastException cxe){
                        continue;
                    }     
                    if("name".equals(record.getNodeName()) && classname.equals(record.getFirstChild().getNodeValue())){
                        
                        NodeList dimensions = (((Element)windowNodes).getElementsByTagName("dimension")).item(0).getChildNodes();
                        for(int j = 0; j < dimensions.getLength(); j++){
                            Node dimension = dimensions.item(j);
                            if("width".equals(dimension.getNodeName())){
                               
                                 width = Integer.parseInt((String)dimension.getFirstChild().getNodeValue());
                            }else if("height".equals(dimension.getNodeName())){
                                height =  Integer.parseInt(dimension.getFirstChild().getNodeValue());
                            }else
                                continue;
                        }
                        return new Dimension(width,height);
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException  ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    /**
     * Funkcia ulozi zaznam o rozmeroch okien do XML formatu. Ak zaznam v subore
     * neexistuje, vytvori sa novy pod prislusnym nazvom.
     * @param classname Nazov triedy, v ktorej sa okno vytvorilo. Sucasne to
     * je aj nazov zaznamu pouzity pre neskorsiu identifikaciu.
     * @param d Rozmery okna, ktore sa maju zaznamenat. 
     */
    
    public static void saveDimension(String classname, Dimension d){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document input = factory.newDocumentBuilder().parse(SETTINGSFILE);
            
      
            
            Node root = input.getFirstChild();

            
            NodeList windows = ((Element)root).getElementsByTagName("window");
            
            for(int i =0; i < windows.getLength(); i++){
                Element window = (Element) windows.item(i);
               
                NodeList windowNodes = ((Node)window).getChildNodes();
                for(int k = 0; k < windowNodes.getLength(); k++){
                    
                   
                    Element record ;
                    try{
                         record =(Element) windowNodes.item(k);
                    }catch(ClassCastException cxe){
                        continue;
                    }     
                    if("name".equals(record.getNodeName())&& classname.equals(record.getFirstChild().getNodeValue())){
                        
                        NodeList dimensions = (((Element)windowNodes).getElementsByTagName("dimension")).item(0).getChildNodes();
                        for(int j = 0; j < dimensions.getLength(); j++){
                            Node dimension = dimensions.item(j);
                            if("width".equals(dimension.getNodeName())){
                                dimension.setTextContent(Integer.toString((int)d.getWidth()));
                            }else if("height".equals(dimension.getNodeName())){
                                dimension.setTextContent(Integer.toString((int)d.getHeight()));
                            }else
                                continue;
                               // write the content into xml file
                            TransformerFactory transformerFactory = TransformerFactory.newInstance();
                            Transformer transformer = transformerFactory.newTransformer();
                            DOMSource source = new DOMSource(input);
                            StreamResult result = new StreamResult(new File(SETTINGSFILE));
                            transformer.transform(source, result);

                           
                        }
                         System.out.println("updated");
                          return;
                    }
                }
            }
        
            //ak nebol najdeny zaznam tak sa vytvori novy
            Element window = input.createElement("window");
            root.appendChild(window);
            Element nameElement = input.createElement("name");
            nameElement.appendChild(input.createTextNode(classname));
            window.appendChild(nameElement);
            Element dimenson = input.createElement("dimension");
            window.appendChild(dimenson);
            Element width = input.createElement("width");
            width.appendChild(input.createTextNode(Integer.toString((int)d.getWidth())));
            dimenson.appendChild(width);
            Element height = input.createElement("height");
            height.appendChild(input.createTextNode(Integer.toString((int)d.getHeight())));
            dimenson.appendChild(height);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(input);
            StreamResult result = new StreamResult(new File(SETTINGSFILE));
            transformer.transform(source, result);
            
        System.out.println("new node ");
            
        } catch (ParserConfigurationException | SAXException | IOException | TransformerException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       

}
