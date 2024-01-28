package medium.priority_queue;

class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    @Override
    public int compareTo(Student student) {

        if (this.cgpa == student.getCGPA()) {
            // Take another comparason factor

            if (this.name.equals(student.getName())) {
                // Same names, compare by ids

                if (this.id == student.getId()) {
                    // Same ids
                    return 0;
                } else {
                    // Compare ids
                    return (this.id > student.getId() ? 1 : -1);
                }

            } else {
                // Names r different, compare 'em alphabetically
                return this.name.compareTo(student.getName());
            }


        } else {
            // Get who got a higher cgpa
            return (this.cgpa > student.getCGPA() ? -1 : 1);
        }
    }
}