package main.masterlogic;


import main.eightTask.ListOfInteger;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class ProjectCentralProcessor {
    public void executeprojectCentralProcessor() {
        FailaNosaukums();

    }
    public void FailaNosaukums() {
        String FailaNosaukums = "textData.txt";
        System.out.println(FailaNosaukums);










    //    public void letsReadTextFile () {

        String projectDirectoryFullPath = System.getProperty("user.dir");
        String pathToCurrentProjectTextFilePackage = "/src/data/";
        String textFileName = "textData.txt";

        List<String> listOfStrings = new ArrayList<>();
        StringBuilder temporaryPlaceWhereCreateStringFromChars = new StringBuilder();
        try {
            FileReader fr = new FileReader(projectDirectoryFullPath + pathToCurrentProjectTextFilePackage + textFileName); //Javas klase, kura veic faila ielasīšanas darbu. Tai tiek padots ceļš uz to failu, kuru vēlamies nolasīt. Ceļu, tieši šajā gadījumā, salipinam kopā no trīs daļām. Salipinātais ceļš izskatās šādi: /Users/mberzins/IdeaProjects/LearningProject/src/main/resources/textfiles/textFile.txt

            int decimalValueOfCharWhichComesFromFile; //vieta, kur tiks glabāta simbola (char) decimālā vērtība. Piemēram, burta A decimālā vērtība ir 65. Sīkāk skatīt tabulā https://asecuritysite.com/coding/asc2?val=0%2C255
            while ((decimalValueOfCharWhichComesFromFile = fr.read()) != -1) { //read metode iet cauri faila saturam, simbolu pa simbolam un atgriež tā simbolu decimālo vērtību. Metode read() iet cauri failam un atgriež char decimālo vērtību. Ja atgriež -1, tas nozīmē ka ir sasniegtas faila beigas. Līdz ar to, tiek apturēts While cikls un tas vairs netiek izpildīts.

                if (decimalValueOfCharWhichComesFromFile > 32 && decimalValueOfCharWhichComesFromFile != 59) { //tiek salīdzināt ar char decimālajām vērtībām. Līdz 32. Dec vērtībai ir atstartpes, jaunu rindu simboli utt. Char ar 59 Dec vērtību ir semikols. Tātad ko šis ifs dara: ja simbola decimālā vērtība ir virs 32 UN nav 59tā, tātad šis simbols ir derīgs, un izpildam to kodu, kas ir if bodijā.
                    temporaryPlaceWhereCreateStringFromChars.append((char) decimalValueOfCharWhichComesFromFile); //izmantojot append metodi no StringBuilder klases, lipinam to char klāt mūsu stringā, lai beigās izveidotos vārds. Izmantojam vērtību kāstošanu (casting) uz char tipu (vienvārd sakot, pārtulko dec vērtību uz char vērtību.).
                } else {
                    listOfStrings.add(temporaryPlaceWhereCreateStringFromChars.toString()); //Ja ifā dabūjām false, tātad tas nozīmē, ka simbols, kurš tagad tiek apstrādāts ir vai nu atstartpe, vai nu jauna rinda, vai semikols utt. Līdz ar to, mēs pieņemam, ka ir nolasīts vesels vārds un vārdam vairs nav jālipina klāt neviens chars. Ar metodi toString() no salipinātajiem chariem tiek izveidots vesels String vārds. Ar metodi add(), uzģenerētais strings tiek ievietots Listā, kurš saturēs visus vārdus, kurus izvilksim ārā no teksta faila.
                    temporaryPlaceWhereCreateStringFromChars.setLength(0); //Iztukšojam string builder objektu no ieprikš salipinātajiem chariem, lai varētu sākt visu sting veidošana no jauna.
                }
            }
            listOfStrings.add(temporaryPlaceWhereCreateStringFromChars.toString()); //šis ir tas pats, kas atrodas else blokā. Tas ir vajadzīgs tādēļ, lai Listē tiktu saglabāts pēdējais salipinātais strings. Kāpēc tas netika izdarīts dažas rindas augstāk pēdējā elsā? Tas tādēļ, ka nolasot pēdējo simbolu no mūsu teksta faila, tas nebija ne atstarpe ne semikols, līdz ar to netika izpildīts else bloks. Taču, tā kā tas arī bia pēdējais simbols failā, tad vairs netiek arī pildīts while cikls. Līdz ar to, šādu loģiku mums vajadzēja izvilkt arī ārpus while cikla.
            temporaryPlaceWhereCreateStringFromChars.setLength(0);
            fr.close(); //aizveram ciet faila nolasīšanas plūsmu
        } catch (IOException exception) { //ja gadījumā try blokā kaut kas izmeta kļūdu, piemēram, netika atrasts tas fails, kuru vajadzēja apstrādāt, tad tiek izmesta kļūda ar tipu IOException
            System.out.println(exception.getMessage()); //Ja tiek noķerta kļūda, tad tiek izpildīts šis kods. Tieši šajā gadījumā, no kļūdas tiek paņemts kļūdas iemesls un ar println() metodes palīdzību, tas tiek izvadīts uz ekrāna
        } finally { //finally bloks tiek izpildīts vienmēr, neatkarīgi no tā, vai kļūda ir vai nav
            System.out.println("This comes from finally. File reading is done. Either it was successful or not");
            System.out.println(listOfStrings); //println() metodei tiek padots viss lists, un println metode māk uz ekrāna izvadīt to, kā šis lists izskatās.
        }
    }

    }
}




