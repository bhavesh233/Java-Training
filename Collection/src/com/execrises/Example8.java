package com.execrises;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;


class Employee{
    int TraineeId,TraineeAge;
    String TraineeName,TraineeAddress,TraineeDOB ,TraineeJoiningDate;

    public Employee(int traineeId, int traineeAge, String traineeName, String traineeAddress, String traineeDOB, String traineeJoiningDate) {
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


public class Example8 {


        public static void main(String[] args) {

            ArrayList<Employee> arrayList =new ArrayList<>();
            try {
                //creating a constructor of file class and parsing an XML file
                File file = new File("./readXml.xml");

                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse(file);
                doc.getDocumentElement().normalize();
                System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
                NodeList nodeList = doc.getElementsByTagName("Details");

                for (int itr = 0; itr < nodeList.getLength(); itr++) {
                    Node node = nodeList.item(itr);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) node;
                        int trainId = Integer.valueOf(eElement.getElementsByTagName("TraineeId").item(0).getTextContent());
                        int trainAge = Integer.valueOf(eElement.getElementsByTagName("TraineeAge").item(0).getTextContent());
                        String traineeAddress = eElement.getElementsByTagName("TraineeAddress").item(0).getTextContent();
                        String traineName =eElement.getElementsByTagName("TraineeName").item(0).getTextContent();
                        String trainDob =eElement.getElementsByTagName("TraineeDOB").item(0).getTextContent();
                        String trainJonDate = eElement.getElementsByTagName("TraineeJoiningDate").item(0).getTextContent();
                        Employee e1= new Employee(trainId,trainAge,traineName,traineeAddress,trainDob,trainJonDate);
                        arrayList.add(e1);
                    }
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            for (Employee e1:arrayList){
                System.out.println(e1.TraineeId+" "+e1.TraineeName+" "+e1.TraineeAge+" "+e1.TraineeAddress+" "+e1.TraineeDOB+" "+e1.TraineeJoiningDate);
            }
        }
    }

