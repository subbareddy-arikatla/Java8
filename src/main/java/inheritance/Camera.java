class Camera:
    def __init__(self, camera_mp):
        self.camera_mp = camera_mp

    def take_photo(self):
        print("Taking photo with", self.camera_mp, "MP camera")


class MusicPlayer:
    def __init__(self, brand):
        self.brand = brand

    def play_music(self):
        print("Playing music with", self.brand, "music system")


class SmartPhone(Camera, MusicPlayer):
    def __init__(self, camera_mp, brand, model_name):
        Camera.__init__(self, camera_mp)
        MusicPlayer.__init__(self, brand)
        self.model_name = model_name

    def show_details(self):
        print("Model Name:", self.model_name)
        print("Camera:", self.camera_mp, "MP")
        print("Music Brand:", self.brand)


# Creating 2 smartphones
s1 = SmartPhone(64, "Sony", "iPhone 15")
s2 = SmartPhone(108, "Dolby", "Samsung S24")

print("SmartPhone 1 Details")
s1.show_details()
s1.take_photo()
s1.play_music()

print("\nSmartPhone 2 Details")
s2.show_details()
s2.take_photo()
s2.play_music()