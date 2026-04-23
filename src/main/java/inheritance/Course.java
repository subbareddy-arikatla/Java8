class Course:
    def __init__(self, course_name, price):
        self.course_name = course_name
        self.price = price

    def show_course(self):
        print("Course Name:", self.course_name)
        print("Price:", self.price)


class ProgrammingCourse(Course):
    def __init__(self, course_name, price, language, duration):
        super().__init__(course_name, price)
        self.language = language
        self.duration = duration

    def show_programming_course(self):
        self.show_course()
        print("Language:", self.language)
        print("Duration:", self.duration)


# Creating 2 programming courses
p1 = ProgrammingCourse("Python Full Stack", 25000, "Python", "6 Months")
p2 = ProgrammingCourse("Java Development", 30000, "Java", "8 Months")

print("Programming Course 1 Details")
p1.show_programming_course()

print("\nProgramming Course 2 Details")
p2.show_programming_course()
