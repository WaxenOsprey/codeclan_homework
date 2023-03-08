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
    
    def check_caffeine(self, drink, customer):
        max_energy = 5
        if drink.caffeine_level + customer.energy < max_energy:
            return True
        elif drink.caffeine_level + customer.energy > max_energy:
            return False
        
    def make_sale(self, drink, customer):
        can_drink = self.check_age(customer)
        energy_ok = self.check_caffeine(drink, customer)
        if can_drink == True and energy_ok == True:
            self.till += drink.price
        customer.pay_for_drink(drink)
        customer.energy += drink.caffeine_level
    
