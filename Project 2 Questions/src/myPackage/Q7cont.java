package myPackage;

import java.util.Arrays;
import java.util.Comparator;


public class Q7cont extends Q7{

	    public Q7cont(String name, String department, int age) {
	        super(name, department, age);
	    }

	    public static class CompareDepartment implements Comparator<Q7> {

	        @Override
	        public int compare(Q7 o1, Q7 o2) {
	            if (o1.getDepartment().compareTo(o2.getDepartment()) > 0) {
	                return 1;
	            } else if (o1.getDepartment().compareTo(o2.getDepartment()) < 0) {
	                return -1;
	            } else {
	                return 0;
	            }
	        }

	    }
	    public static class NameCompare implements Comparator<Q7> {

	        @Override
	        public int compare(Q7 o1, Q7 o2) {
	            if (o1.getName().compareTo(o2.getName()) > 0) {
	                return 1;
	            } else if (o1.getName().compareTo(o2.getName()) < 0) {
	                return -1;
	            } else {
	                return 0;
	            }
	        }

	    }
	    public static class CompareAge implements Comparator<Q7> {

	        @Override
	        public int compare(Q7 o1, Q7 o2) {
	            if (o1.getAge() > o2.getAge()) {
	                return 1;
	            } else if (o1.getAge() < o2.getAge()) {
	                return -1;
	            } else {
	                return 0;
	            }
	        }

	    }

	    public static void main(String[] args) {

	        String name = "Rnsley";
	        String name1 = "Aita";

	        String department = "Education";
	        String department2 = "HR";

	        int age = 30;
	        int age2 = 20;

	        Q7 employee1 = new Q7(name,department,age);
	        Q7 employee2 = new Q7(name1,department2,age2);

	        Q7[] myArray = {employee1,employee2};

	        CompareAge checkAge = new CompareAge();
	        CompareDepartment checkDep = new CompareDepartment();
	        NameCompare checkName = new NameCompare();

	        Arrays.sort(myArray,checkAge);
	        System.out.println("Sort by age: ");
	        for(Q7 employee : myArray){
	            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: "+ employee.getDepartment());
	        }

	        Arrays.sort(myArray,checkDep);
	        System.out.println("Sort by Department: ");
	        for(Q7 employee : myArray){
	            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: " +employee.getDepartment());
	        }

	        Arrays.sort(myArray,checkName);
	        System.out.println("Sort by Name: ");
	        for(Q7 employee : myArray){
	            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: "+employee.getDepartment());
	        }

	    }
}
