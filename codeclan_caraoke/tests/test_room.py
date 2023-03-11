import unittest

from src.caraoke_house import *
from src.room import *
from src.guest import *
from src.song import *

class TestRoom(unittest.TestCase):
    def setUp(self):
        self.caraoke_house = CaraokeHouse("The Warbling Wren")
        self.guest_1 = Guest("Maria")
        self.guest_2 = Guest("John")
        self.room_1 = Room("Room 1")
        self.room_2 = Room("Room 2")
        
    def test_check_in(self):
        self.room_1.check_in(self.guest_1)
        self.assertEqual(1, len(self.room_1.guest_list))

    def test_check_out(self):
        self.room_1.guest_list = [self.guest_2]
        self.room_1.check_out(self.guest_2)
        self.assertEqual(0, len(self.room_1.guest_list))

    def test_add_song(self):
        self.song_1 = Song("David Bowie", "Space Oddity")
        self.room_1.add_song(self.song_1)
        self.assertEqual(1, len(self.room_1.songs_playlist))