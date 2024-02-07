import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many students do you have? ");
		int numStudents = keyboard.nextInt();
		keyboard.nextLine();
		Student[] students = new Student[numStudents];

		System.out.println("A. Randomize the grades: ");
		System.out.println("B. Manually enter the grades: ");
		String choice = keyboard.nextLine();
		
		System.out.println(choice);
		if (choice.equalsIgnoreCase("A")) {
			Random random = new Random();

			for (int i = 0; i < numStudents; i++) {
				int grade = random.nextInt(65, 100);
				students[i] = new Student("Student " + i, grade);
			}

		} else if (choice.equalsIgnoreCase("B")) {
			for (int i = 0; i < numStudents; i++) {
				System.out.println("Student Name: ");
				String name = keyboard.nextLine();
				System.out.println("Grade: ");
				int grade = keyboard.nextInt();
				keyboard.nextLine();
				students[i] = new Student(name, grade);
			}
		}
		System.out.println("Original List:");
		for (Student student : students) {
			System.out.println(student.getName() + " = " + student.getGrade());
		}

		QuickSort<Student> quickSort = new QuickSort<>();
		Student[] quickSortArray = quickSort.quickSort(Arrays.copyOf(students, numStudents), 0, students.length - 1);
		System.out.println("\nQuick Sorted array:");
		for (Student student : quickSortArray) {
			System.out.println(student.getName() + " = " + student.getGrade());

		}

		MergeSort<Student> mergeSort = new MergeSort<>();
		Student[] mergeSortArray = mergeSort.mergeSort(students);

		System.out.println("\nMerge Sorted array:");
		for (Student student : mergeSortArray) {
			System.out.println(student.getName() + " = " + student.getGrade());

		}
	}

}
