from src.drink import Drink

import unittest

class TestDrink(unittest.TestCase):
    def setUp(self):
        self.drink_1 = Drink("Americano", 5)

    def test_drink_has_name(self):
        print("hello")
        self.assertEqual("Americano", self.drink_1.name)

    def test_drink_has_price(self):
        self.assertEqual(5, self.drink_1.price)