package medium.priority_queue;

import java.util.*;

class Priorities {

    ArrayList<Student> students = new ArrayList<>();

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> studentsPQ = new PriorityQueue<>();

        for (String event : events) {

            // Read the input
            String[] command = event.split("\\s");

            if (command[0].equals("ENTER")) {
                // Enter a new student
                Student newStudent = new Student(
                        Integer.parseInt(command[3]),
                        command[1],
                        Double.parseDouble(command[2])
                );

                studentsPQ.add(newStudent);
            } else {
                // Serve a student
                studentsPQ.poll();
            }
        }

        while (studentsPQ.size() > 0) {
            students.add(studentsPQ.poll());
        }

        return students;
    }
}
