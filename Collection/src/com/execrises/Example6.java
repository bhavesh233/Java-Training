package com.execrises;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class ProminentTrainee2 {
    int TraineeId, TraineeAge;
    String TraineeName, TraineeAddress, TraineeDOB, TraineeJoiningDate;

    public ProminentTrainee2(int traineeId, int traineeAge, String traineeName, String traineeAddress, String traineeDOB, String traineeJoiningDate) {
        TraineeId = traineeId;
        TraineeAge = traineeAge;
        TraineeName = traineeName;
        TraineeAddress = traineeAddress;
        TraineeDOB = traineeDOB;
        TraineeJoiningDate = traineeJoiningDate;
    }

    public int getTraineeId() {
        return TraineeId;
    }

    public void setTraineeId(int traineeId) {
        TraineeId = traineeId;
    }

    public int getTraineeAge() {
        return TraineeAge;
    }

    public void setTraineeAge(int traineeAge) {
        TraineeAge = traineeAge;
    }

    public String getTraineeName() {
        return TraineeName;
    }

    public void setTraineeName(String traineeName) {
        TraineeName = traineeName;
    }

    public String getTraineeAddress() {
        return TraineeAddress;
    }

    public void setTraineeAddress(String traineeAddress) {
        TraineeAddress = traineeAddress;
    }

    public String getTraineeDOB() {
        return TraineeDOB;
    }

    public void setTraineeDOB(String traineeDOB) {
        TraineeDOB = traineeDOB;
    }

    public String getTraineeJoiningDate() {
        return TraineeJoiningDate;
    }

    public void setTraineeJoiningDate(String traineeJoiningDate) {
        TraineeJoiningDate = traineeJoiningDate;
    }
}


class WriteFile {
    public void writeXmlFile(ArrayList<ProminentTrainee2> list) {

        try {

            DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder build = dFact.newDocumentBuilder();
            Document doc = build.newDocument();

            Element root = doc.createElement("Studentinfo");
            doc.appendChild(root);


            for (ProminentTrainee2 dtl : list) {
                Element Details = doc.createElement("Details");
                root.appendChild(Details);

                Element TraineeId = doc.createElement("TraineeId");
                TraineeId.appendChild(doc.createTextNode(String.valueOf(dtl.getTraineeId())));
                Details.appendChild(TraineeId);

                Element TraineeName = doc.createElement("TraineeName");
                TraineeName.appendChild(doc.createTextNode(String.valueOf(dtl.getTraineeName())));
                Details.appendChild(TraineeName);

                Element TraineeAddress = doc.createElement("TraineeAddress");
                TraineeAddress.appendChild(doc.createTextNode(String.valueOf(dtl.getTraineeAddress())));
                Details.appendChild(TraineeAddress);

                Element TraineeDOB = doc.createElement("TraineeDOB");
                TraineeDOB.appendChild(doc.createTextNode(String.valueOf(dtl.getTraineeDOB())));
                Details.appendChild(TraineeDOB);

                Element TraineeJoiningDate = doc.createElement("TraineeJoiningDate");
                TraineeJoiningDate.appendChild(doc.createTextNode(String.valueOf(dtl.getTraineeJoiningDate())));
                Details.appendChild(TraineeJoiningDate);

                Element TraineeAge = doc.createElement("TraineeAge");
                TraineeAge.appendChild(doc.createTextNode(String.valueOf(dtl.getTraineeAge())));
                Details.appendChild(TraineeAge);


            }

            TransformerFactory tranFactory = TransformerFactory.newInstance();
            Transformer aTransformer = tranFactory.newTransformer();

            aTransformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            aTransformer.setOutputProperty(
                    "{http://xml.apache.org/xslt}indent-amount", "4");
            aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            try {
                FileWriter fos = new FileWriter("./ProminentPractise.xml");
                StreamResult result = new StreamResult(fos);
                aTransformer.transform(source, result);

            } catch (IOException e) {

                e.printStackTrace();
            }

        } catch (TransformerException ex) {
            System.out.println("Error outputting document");

        } catch (ParserConfigurationException ex) {
            System.out.println("Error building document");
        }
    }
}

public class Example6 {


    public static void main(String[] args) {

        ProminentTrainee2 p21 = new ProminentTrainee2(101, 10, "ABC", "Rajkot", "04/08/2010", "04/01/2015");
        ProminentTrainee2 p22 = new ProminentTrainee2(102, 12, "ABCD", "Rajkot", "04/08/2010", "04/01/2015");
        ProminentTrainee2 p23 = new ProminentTrainee2(103, 13, "ABCDE", "Rajkot", "04/08/2010", "04/01/2015");
        ProminentTrainee2 p24 = new ProminentTrainee2(104, 14, "ABCDEF", "Rajkot", "04/08/2010", "04/01/2015");
        ProminentTrainee2 p25 = new ProminentTrainee2(105, 15, "ABCDEFG", "Rajkot", "04/08/2010", "04/01/2015");

        ArrayList<ProminentTrainee2> arrayList = new ArrayList<>();
        arrayList.add(p21);
        arrayList.add(p22);
        arrayList.add(p23);
        arrayList.add(p24);
        arrayList.add(p25);

        for (ProminentTrainee2 p : arrayList) {
            System.out.println(p.TraineeId);
        }

        WriteFile ob = new WriteFile();
        ob.writeXmlFile(arrayList);
    }
}
