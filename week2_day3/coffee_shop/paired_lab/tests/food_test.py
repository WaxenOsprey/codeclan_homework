from src.customer import Customer
from src.food import Food

import unittest

class TestFood(unittest.TestCase):
    def setUp(self):
        self.food_1 = Food("Bagel", 15, 5)
        self.customer_1 = Customer("Peter", 45, 100, 6)

    def test_buy_food(self):
        self.customer_1.buy_food(self.food_1)
        self.assertEqual(1, self.customer_1.energy)
        self.assertEqual(85, self.customer_1.wallet)
