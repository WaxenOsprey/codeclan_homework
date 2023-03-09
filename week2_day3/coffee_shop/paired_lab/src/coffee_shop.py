class CoffeeShop:
    def __init__(self, name, till, stock):
        self.name = name
        self.till = till
        self.stock = stock

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

    #sell_drink a better name?    
    def make_sale(self, drink, customer):
        can_drink = self.check_age(customer)
        energy_ok = self.check_caffeine(drink, customer)
        if can_drink == True and energy_ok == True:
            self.till += drink.price
        customer.pay_for_drink(drink)
        customer.energy += drink.caffeine_level
    
#    def stock_value(self, stock):
#        total_value = 0
#        keys = stock.keys()
#        i = 0
#        drink_prices = []
#        for key in keys:
#            price = key.price
#            drink_prices[i].append(price) 
#            i += 1
#        j = 0 
#        for item in stock:
#            total_value += drink_prices[j] * item.value()
#            j += 1
#        return total_value
#  DO LIST COMPREHENSION

            
