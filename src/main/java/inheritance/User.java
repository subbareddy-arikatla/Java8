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
        print(self.name, "placed order for", self.order_item)


class DeliveryPartner(User):
    def __init__(self, name, location, vehicle_type):
        super().__init__(name, location)
        self.vehicle_type = vehicle_type

    def deliver_order(self):
        print(self.name, "is delivering order using", self.vehicle_type)


# Creating 1 customer and 1 delivery partner
c1 = Customer("Arjun", "Hyderabad", "Pizza")
d1 = DeliveryPartner("Kiran", "Hyderabad", "Bike")

print("Customer Details")
c1.login()
c1.place_order()

print("\nDelivery Partner Details")
d1.login()
d1.deliver_order()