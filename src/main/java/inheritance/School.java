class School:
    def __init__(self, school_name):
        self.school_name = school_name

    def show_school(self):
        print("School Name:", self.school_name)


class Teacher(School):
    def __init__(self, school_name, teacher_name, subject):
        super().__init__(school_name)
        self.teacher_name = teacher_name
        self.subject = subject

    def show_teacher(self):
        self.show_school()
        print("Teacher Name:", self.teacher_name)
        print("Subject:", self.subject)


class Student(Teacher):
    def __init__(self, school_name, teacher_name, subject, student_name, grade):
        super().__init__(school_name, teacher_name, subject)
        self.student_name = student_name
        self.grade = grade

    def show_student(self):
        self.show_teacher()
        print("Student Name:", self.student_name)
        print("Grade:", self.grade)


# Creating 2 students
st1 = Student("ABC School", "Ramesh Sir", "Maths", "Rahul", "10th")
st2 = Student("XYZ School", "Sita Madam", "Science", "Anjali", "9th")

print("Student 1 Details")
st1.show_student()

print("\nStudent 2 Details")
st2.show_student()