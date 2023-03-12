import unittest
from src.caraoke_house import *
from src.room import *
from src.guest import *

class TestCaraokeHouse(unittest.TestCase):
    def setUp(self):
        self.caraoke_house = CaraokeHouse("The Warbling Wren")
        self.guest_5 = Guest("Jim")


    def test_open_room(self):
        self.caraoke_house.open_room("Room 1")
        self.assertEqual(1, len(self.caraoke_house.room_list))

