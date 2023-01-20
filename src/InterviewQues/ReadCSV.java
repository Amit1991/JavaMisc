package InterviewQues;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ReadCSV {

    static class Student {

        String name;
        Integer std;
        String subject;
        Integer marks;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getStd() {
            return std;
        }

        public void setStd(Integer std) {
            this.std = std;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public Integer getMarks() {
            return marks;
        }

        public void setMarks(Integer marks) {
            this.marks = marks;
        }

        public Student(String name, Integer std, String subject, Integer marks) {
            this.name = name;
            this.std = std;
            this.subject = subject;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", std=" + std +
                    ", subject='" + subject + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\amitku\\Downloads\\Book1.csv");
        FileReader fr = new FileReader(file);
        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)
        {
            // Print all the content of a file
            System.out.print((char)i);
        }

        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        Map<String, List<Map<String, Integer>>> marks = new HashMap<>();
        List<Student> students = new ArrayList<>();
        Stream<String> fs = Files.lines(Path.of("C:\\Users\\amitku\\Downloads\\Book1.csv"));
        fs.forEach(a -> {

            String[] arr = a.split(",");
            for (int j = 0; j < arr.length; j++) {

                if(pattern.matcher(arr[1]).matches()
                    && pattern.matcher(arr[3]).matches())
                {
                    students.add(new Student(arr[0], Integer.parseInt(arr[1])
                            , arr[2], Integer.parseInt(arr[3])));

                    if(marks.get(arr[0]) == null)
                    {
                        List data = new ArrayList<>();
                        Map marksData = new HashMap<>();
                        marksData.put(arr[2], arr[3]);
                        data.add(marksData);
                        marks.put(arr[0], data);
                    }
                }
            }
        });

        System.out.println(students);
        System.out.println(marks);
    }
}
