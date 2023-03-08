class CoffeeShop:
    def __init__(self, name, till, drinks):
        self.name = name
        self.till = till
        self.drinks = drinks

    def check_age(self, customer):
        if customer.age >= 16:
            return True
        elif customer.age < 16:
            return False
        
    def accept_money(self, amount):
        self.till += amount