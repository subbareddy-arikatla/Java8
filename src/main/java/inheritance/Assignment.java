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
        print("Base course details reused + extra programming details added")
        super().show_course()
        print("Language:", self.language)
        print("Duration:", self.duration)


class Camera:
    def __init__(self, camera_mp, **kwargs):
        super().__init__(**kwargs)
        self.camera_mp = camera_mp

    def take_photo(self):
        print("Taking photo with", self.camera_mp, "MP camera")


class MusicPlayer:
    def __init__(self, brand, **kwargs):
        super().__init__(**kwargs)
        self.brand = brand

    def play_music(self):
        print("Playing music with", self.brand)


class SmartPhone(Camera, MusicPlayer):
    def __init__(self, model_name, camera_mp, brand):
        super().__init__(camera_mp=camera_mp, brand=brand)
        self.model_name = model_name

    def show_details(self):
        print("Model Name:", self.model_name)
        print("Camera MP:", self.camera_mp)
        print("Music Brand:", self.brand)


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
        super().show_school()
        print("Teacher Name:", self.teacher_name)
        print("Subject:", self.subject)


class Student(Teacher):
    def __init__(self, school_name, teacher_name, subject, student_name, grade):
        super().__init__(school_name, teacher_name, subject)
        self.student_name = student_name
        self.grade = grade

    def show_student(self):
        super().show_teacher()
        print("Student Name:", self.student_name)
        print("Grade:", self.grade)


class User:
    def __init__(self, name, location):
        self.name = name
        self.location = location

    def login(self):
        print(self.name, "logged in from", self.location)


class Customer(User):
    def __init__(self, name, location, order_item):
        super().__init__(name, location)
        self.order_item = order_item

    def place_order(self):
        print(self.name, "placed order:", self.order_item)


class DeliveryPartner(User):
    def __init__(self, name, location, vehicle_type):
        super().__init__(name, location)
        self.vehicle_type = vehicle_type

    def deliver_order(self):
        print(self.name, "is delivering using", self.vehicle_type)


print("========== 1) SINGLE INHERITANCE TASK ==========")
pc1 = ProgrammingCourse("Python Full Stack", 25000, "Python", "6 Months")
pc2 = ProgrammingCourse("Java Full Stack", 30000, "Java", "8 Months")

print("\nProgramming Course 1 Details")
pc1.show_programming_course()

print("\nProgramming Course 2 Details")
pc2.show_programming_course()


print("\n========== 2) MULTIPLE INHERITANCE TASK ==========")
sp1 = SmartPhone("iPhone 15", 48, "Apple Music")
sp2 = SmartPhone("Samsung S24", 108, "Spotify")

print("\nSmartPhone 1 Details")
sp1.show_details()
sp1.take_photo()
sp1.play_music()

print("\nSmartPhone 2 Details")
sp2.show_details()
sp2.take_photo()
sp2.play_music()


print("\n========== 3) MULTILEVEL INHERITANCE TASK ==========")
st1 = Student("ABC School", "Ramesh", "Maths", "Rahul", "10th")
st2 = Student("XYZ School", "Sita", "Science", "Anjali", "9th")

print("\nStudent 1 Full Details")
st1.show_student()

print("\nStudent 2 Full Details")
st2.show_student()


print("\n========== 4) HIERARCHICAL INHERITANCE TASK ==========")
customer1 = Customer("Arjun", "Hyderabad", "Burger")
partner1 = DeliveryPartner("Kiran", "Hyderabad", "Bike")

print("\nCustomer Details")
customer1.login()
customer1.place_order()

print("\nDelivery Partner Details")
partner1.login()
partner1.deliver_order()