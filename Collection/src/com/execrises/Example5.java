package com.execrises;

import java.util.*;

class ProminentTrainee implements Comparable<ProminentTrainee> {
    int TraineeId, TraineeAge;
    String TraineeDOB, TraineeName;

    public ProminentTrainee(int traineeId, int traineeAge, String traineeDOB, String traineeName) {
        TraineeId = traineeId;
        TraineeAge = traineeAge;
        TraineeDOB = traineeDOB;
        TraineeName = traineeName;
    }

    public int compareTo(ProminentTrainee b) {
        if (TraineeId > b.TraineeId) {
            return 1;
        } else if (TraineeId < b.TraineeId) {
            return -1;
        } else {
            return 0;
        }
    }
}


public class Example5 {

    public static void main(String[] args) {


        ProminentTrainee pt1 = new ProminentTrainee(101, 12, "04/08/2001", "Akshay");
        ProminentTrainee pt2 = new ProminentTrainee(102, 14, "05/09/2001", "Bhavesh");
        ProminentTrainee pt3 = new ProminentTrainee(103, 16, "06/10/2001", "Nayan");
        ProminentTrainee pt4 = new ProminentTrainee(104, 18, "08/08/2001", "Rahul");
        ProminentTrainee pt5 = new ProminentTrainee(105, 20, "08/09/2001", "tulesh");
        ProminentTrainee pt6 = new ProminentTrainee(103, 16, "06/10/2001", "Nayan");

        ArrayList<ProminentTrainee> arrayList = new ArrayList<>();

        arrayList.add(pt1);
        arrayList.add(pt2);
        arrayList.add(pt3);
        arrayList.add(pt4);
        arrayList.add(pt6);

        // print
        System.out.println("Print");
        for (
                ProminentTrainee p : arrayList) {
            System.out.println(p.TraineeId + " " + p.TraineeName + " " + p.TraineeDOB + " " + p.TraineeAge);
        }
        System.out.println();

        arrayList.forEach(s ->

        {
            ProminentTrainee p = s;
            System.out.println(p.TraineeId + " " + p.TraineeName + " " + p.TraineeDOB + " " + p.TraineeAge);
        });
        System.out.println();

        // add position 1
        arrayList.add(1, pt5);


        // convert HashMap
        System.out.println("Convert ArrayList to HashMap");
        HashMap<Integer, ProminentTrainee> hashMap = new HashMap();

        arrayList.forEach(s ->

        {
            ProminentTrainee p = s;
            hashMap.put(p.TraineeId, p);
        });

        for (
                Map.Entry m : hashMap.entrySet()) {
            ProminentTrainee pm = (ProminentTrainee) m.getValue();
            System.out.println(m.getKey() + " " + pm.TraineeName + " " + pm.TraineeDOB + " " + pm.TraineeAge);
        }
        System.out.println();

        // sort by Name with help of lamda funcation

        System.out.println("ArrayList Sorting with Lamda");
        Collections.sort(arrayList, (p1, p2) ->

        {
            return p1.TraineeName.compareTo(p2.TraineeName);
        });
        for (
                ProminentTrainee p : arrayList) {
            System.out.println(p.TraineeId + " " + p.TraineeName + " " + p.TraineeDOB + " " + p.TraineeAge);
        }
        System.out.println();

        // get index 3 element from arrayList
        System.out.println("get Index 3");
        ProminentTrainee p = arrayList.get(3);
        System.out.println(p.TraineeId + " " + p.TraineeName + " " + p.TraineeDOB + " " + p.TraineeAge);
        System.out.println();


        //print TraineeId 105 element
        System.out.println("print TraineeId 105");
        arrayList.forEach(s ->

        {
            ProminentTrainee pId = s;
            if (pId.TraineeId == 105) {
                System.out.println(pId.TraineeId + " " + pId.TraineeName + " " + pId.TraineeDOB + " " + pId.TraineeAge);
            }
        });
        System.out.println();

        // convert arrayList to Treeset
        System.out.println("convert ArrayList to treeSet");
        Set<ProminentTrainee> treeSet = new TreeSet<ProminentTrainee>(arrayList);
        for (
                ProminentTrainee b : treeSet) {
            System.out.println(b.TraineeId + " " + b.TraineeName + " " + b.TraineeDOB + " " + b.TraineeAge);
        }
        // size of TreeSet
        System.out.println("Print size of treeSet");
        System.out.println(treeSet.size());

        //count element of the list using Lamda
        int count = (int) arrayList.stream().filter(s -> s.TraineeId >= 0).count();
        System.out.println(count);
    }

}
