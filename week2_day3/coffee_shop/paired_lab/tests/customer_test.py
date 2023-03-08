from src.customer import Customer
from src.drink import Drink
from src.coffee_shop import CoffeeShop
from src.food import Food
import unittest

class TestCustomer(unittest.TestCase):
    def setUp(self):
        self.customer_1 = Customer("Claire", 32, 100, 6)

    def test_customer_has_name(self):
        self.assertEqual("Claire", self.customer_1.name)
    
    def test_customer_wallet_amount(self):
        self.assertEqual(100, self.customer_1.wallet)

    def test_pay_for_drink(self):
        drink_1 = Drink("Espresso", 3, 3)
        self.customer_1.pay_for_drink(drink_1)
        self.assertEqual(97, self.customer_1.wallet)

    def test_buy_food(self):
        food_1 = Food("Bagel", 15, 5)
        self.customer_1.buy_food(food_1)
        self.assertEqual(1, self.customer_1.energy)
        self.assertEqual(85, self.customer_1.wallet)

