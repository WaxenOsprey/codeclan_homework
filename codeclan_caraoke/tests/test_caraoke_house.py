import unittest
from src.caraoke_house import *
from src.room import *
from src.guest import *

class TestCaraokeHouse(unittest.TestCase):
    def setUp(self):
        self.caraoke_house = CaraokeHouse("The Wailing Cat")
        self.guest_1 = Guest("Paul")
        self.room_1 = Room("Room 1")
        self.room_2 = Room("Room 2")
        self.caraoke_house.room_list = [self.room_1, self.room_2]

    def test_open_room(self):
        self.caraoke_house.open_room("Room 3")
        self.assertEqual(3, len(self.caraoke_house.room_list))