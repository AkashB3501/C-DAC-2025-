import java.util.*;

class Student implements Comparable<Student> {
	 
	 int rollnum;
	 String name;
	 String department;
	 double cgpa;
	 
	 Student(int rollnum,String name,String department,double cgpa)
	 {
		this.rollnum=rollnum;
        this.name=name;
        this.department=department;
        this.cgpa=cgpa;
	 }
	 
	 @Override
	 public String toString()
	 {
		 return name + "(" + cgpa + ")";
	 }
	 
	 public int compareTo(Student s)
	 {
        return Double.compare(s.cgpa, this.cgpa);
     }
}
 
class Q31_UniversityManagementSystem {
	 
	public static void main(String args[])
	{
		Student s1 = new Student(101,"Amit","CS",8.5);
		Student s2 = new Student(102,"Priya","Math",9.2);
		Student s3 = new Student(103,"Rohan","CS",7.8);
		Student s4 = new Student(104,"Sneha","Physics",4.5);
		
		// 1. Registration List
        List<Student> registrationList = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        System.out.println("\n Registration Order: " + registrationList);


        // 2. Merit List
        List<Student> meritList = new ArrayList<>(registrationList);
        Collections.sort(meritList);
        System.out.println("\n Merit List: " + meritList);


        // 3. Alphabetical List
        List<Student> alphabeticalList = new ArrayList<>(registrationList);
        alphabeticalList.sort(Comparator.comparing(st -> st.name));
        System.out.println("\n Alphabetical: " + alphabeticalList);


        // 4. Department Grouping
        Map<String, List<Student>> deptGroups = new HashMap<>();
        for (Student st : registrationList) {
            deptGroups.computeIfAbsent(st.department, k -> new ArrayList<>()).add(st);
        }
        System.out.println("\n Department Groups: " + deptGroups);


        // 5. Unique Names
        Set<String> uniqueNames = new HashSet<>();
        for (Student st : registrationList) uniqueNames.add(st.name);
        System.out.println("\n Unique Names: " + uniqueNames);


        // 6. Roll Number Sorting
        Set<Integer> rollNumbers = new TreeSet<>();
        for (Student st : registrationList) rollNumbers.add(st.rollnum);  
        System.out.println("\n Roll Numbers Sorted: " + rollNumbers);


        // 7. Performance Filter
        Iterator<Student> it = registrationList.iterator();
        while (it.hasNext()) {
            if (it.next().cgpa < 5.0) it.remove();
        }
        System.out.println("\n After Filter (CGPA >= 5.0): " + registrationList);

        // 8. Recent Registrations (Stack)
        Stack<Student> stack = new Stack<>();
        stack.push(s1);
        stack.push(s2);
        stack.push(s3);
        stack.push(s4);
        System.out.println("\n Recent Registration (Stack): " + stack);

        // 9. Scholarship Queue (FIFO)
        Queue<Student> scholarshipQueue = new LinkedList<>(Arrays.asList(s1, s2, s3));
        System.out.println("\n Scholarship Queue: " + scholarshipQueue);

        // 10. Hostel Applications
        LinkedList<Integer> hostel = new LinkedList<>();
		
        hostel.addLast(105); // Regular
        System.out.println("\n Add regular(105): " + hostel);
		
        hostel.addFirst(101); // Priority
        System.out.println("\n Add priority(101): " + hostel);
		
        hostel.removeFirst();
        System.out.println("\n Remove front: " + hostel);
    }
}
/*
PS D:\Assignment 5> javac Q31_UniversityManagementSystem.java
PS D:\Assignment 5> java Q31_UniversityManagementSystem

 Registration Order: [Amit(8.5), Priya(9.2), Rohan(7.8), Sneha(4.5)]

 Merit List: [Priya(9.2), Amit(8.5), Rohan(7.8), Sneha(4.5)]

 Alphabetical: [Amit(8.5), Priya(9.2), Rohan(7.8), Sneha(4.5)]

 Department Groups: {CS=[Amit(8.5), Rohan(7.8)], Math=[Priya(9.2)], Physics=[Sneha(4.5)]}

 Unique Names: [Priya, Sneha, Amit, Rohan]

 Roll Numbers Sorted: [101, 102, 103, 104]

 After Filter (CGPA >= 5.0): [Amit(8.5), Priya(9.2), Rohan(7.8)]

 Recent Registration (Stack): [Amit(8.5), Priya(9.2), Rohan(7.8), Sneha(4.5)]

 Scholarship Queue: [Amit(8.5), Priya(9.2), Rohan(7.8)]

 Add regular(105): [105]

 Add priority(101): [101, 105]

 Remove front: [105]
 
*/